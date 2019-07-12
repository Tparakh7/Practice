package tejas;
import java.util.Scanner;
public class math {
	public static void main(String arg[])
	{
		double bullets;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter no. of bullets");
		bullets=s.nextDouble();
		if(bullets>0)
		{
			System.out.println("Gunfire");
		}
		else{
			System.out.println("Reload Magazine");
		}
		
	}

}
