public class shuzu {
	public static void main(String [] args){
		int stu[][] =new int [20][5];
		int [] totalscore =new int[20];
		int [] avescore =new int[5];
		for(int i=0;i<20;i++){
		for(int j=0;j<5;j++){
		stu[i][j]=(int)Math.round((Math.random()*100));
		}
		}
		System.out.print("student Name");
		System.out.print("core C++");
		System.out.print("CoraJava");
		System.out.print("Servlet");
		System.out.print("JSP");
		System.out.println("EJB");
		for(int i=0;i<20;i++){
		System.out.print("student"+i+":"+ "");
		for(int j=0;j<5;j++){
		System.out.print(""+stu[i][j]+"");
		}
		System.out.println();
		for(int m=0;m<20;m++){
		int sum=0;
		for(int n=0;n<5;n++){
		sum=sum+stu[m][n];
		}
		totalscore[m]=sum;
		}
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		for(int m=0;m<20;m++){
		System.out.println("student"+m +"'total score:"+ totalscore[m]);
		}
		for(int m=0;m<5;m++){
		int sum=0;
		int ave=0;
		for(int n=0;n<20;n++){
		sum=stu[n][m]+sum;
		}
		ave=sum/20;
		avescore[m]=ave;
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Average Score:");
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Core C++:"+ avescore[0]);
		System.out.println("Core Java:"+ avescore[1]);
		System.out.println("Servlet:"+ avescore[2]);
		System.out.println("JSP:"+ avescore[3]);
		System.out.println("EJB:"+ avescore[4]);
		}
}
