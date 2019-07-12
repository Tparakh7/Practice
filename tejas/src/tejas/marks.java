package tejas;
import java.util.Scanner;
public class marks {
public static void main(String arg[])
{
	int marks;
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the marks");
	marks=s.nextInt();
	if(marks>90)
	{
		System.out.println("Distinction");
	}
	else if(marks>75 && marks<90)
	{
		System.out.println("First Class");
	}
	else if(marks>50 && marks<75)
	{
		System.out.println("Second Class");
	}
	else if(marks<50)
	{
		System.out.println("Fail");
	}
}
}