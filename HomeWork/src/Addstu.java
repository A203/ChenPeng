import java.util.Scanner;
public class Addstu {
	public static void main(String[] args)
	{
		Scanner scanner=new Scanner(System.in);
		int operat=scanner.nextInt();
		String String="";
		switch(operat)
		{
		case 1:String="增加一个学生";break;
		case 2:String="显示所有学生";break;
		case 3:String="退出程序";break;
		default:String="error";
		}
		System.out.println(String);
	}
}