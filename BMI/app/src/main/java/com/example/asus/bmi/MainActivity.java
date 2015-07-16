package com.example.asus.bmi;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static android.view.View.OnClickListener;

public class MainActivity extends Activity {
    private Button btn_about;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        setListeners();
        btn_about = (Button)findViewById(R.id.bt_about);
        btn_about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,OtherActivity.class);

                startActivity(intent);
            }
        });

        }

    private Button btn_calc;
    private EditText et_height;
    private EditText et_weight;
    private TextView et_suggest;
    private void findViews(){
        btn_calc = (Button)findViewById(R.id.bt_calculate);
        et_height=(EditText)findViewById(R.id.et_height);
        et_weight=(EditText)findViewById(R.id.et_weight);
        et_suggest=(TextView)findViewById(R.id.tv_suggest);
    }

    private void setListeners(){
        btn_calc.setOnClickListener(calcBMI);
    }
    private OnClickListener calcBMI = new OnClickListener(){
        public void onClick(View v)
        {
            try {
                double height = Double.parseDouble(et_height.getText().toString()) / 100;
                double weight = Double.parseDouble(et_weight.getText().toString());
                double M = weight / (height * height);
                double N = ((int)(M*100));
                double BMI = N/100;

                TextView result = (TextView) findViewById(R.id.tv_result);
                result.setText("你的BMI指数为：" + BMI);
                if (BMI<=16) {
                    et_suggest.setText(R.string.advise_veryligth);
                    Toast.makeText(MainActivity.this,R.string.advise_veryligth,Toast.LENGTH_SHORT).show();
                }else if (BMI>16&&BMI<=18.5) {
                    et_suggest.setText(R.string.advise_ligth);
                    Toast.makeText(MainActivity.this,R.string.advise_ligth,Toast.LENGTH_SHORT).show();
                }else if (BMI>18.5&&BMI<=25) {
                    et_suggest.setText(R.string.advise_average);
                    Toast.makeText(MainActivity.this,R.string.advise_average,Toast.LENGTH_SHORT).show();
                }else if (BMI>25&&BMI<=30) {
                    et_suggest.setText(R.string.advise_overweight);
                    Toast.makeText(MainActivity.this,R.string.advise_overweight,Toast.LENGTH_SHORT).show();
                }else if (BMI>30&&BMI<=35) {
                    et_suggest.setText(R.string.advise_heavy);
                    Toast.makeText(MainActivity.this,R.string.advise_heavy,Toast.LENGTH_SHORT).show();
                }else if (BMI>35&&BMI<=40) {
                    et_suggest.setText(R.string.advise_severeobesity);
                    Toast.makeText(MainActivity.this,R.string.advise_severeobesity,Toast.LENGTH_SHORT).show();
                }else {
                    et_suggest.setText(R.string.advise_extremeobesity);
                    Toast.makeText(MainActivity.this,R.string.advise_extremeobesity,Toast.LENGTH_SHORT).show();
                }
            }catch(Exception obj){
                Toast.makeText(MainActivity.this,R.string.wrong,Toast.LENGTH_SHORT).show();
            }
        }
    };
}