import java.util.Scanner;

class Addition extends Thread
{
	public void run()
	{
		System.out.println("Addition task started");
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the first number : ");
		int a = s.nextInt();
		System.out.println("Enter the second number : ");
		int b = s.nextInt();
		int sum = a + b;
		System.out.println(sum);
		s.close();
		System.out.println("Addition task completed");
	}
}

class CharPrint extends Thread
{
	public void run()
	{
		System.out.println("Character printing task started");
		for(int i=65;i<=75;i++)
		{
			System.out.println((char)i);
			try {
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Character printing task completed");
	}
}

class NumPrint extends Thread
{
	public void run()
	{
		System.out.println("Number printing task started");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			try {
			Thread.sleep(1000);
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
		System.out.println("Number printing task completed");
	}
}

public class ExampleUsingThreadClass {

	public static void main(String[] args) {
		
		Addition a = new Addition();
		CharPrint c = new CharPrint();
		NumPrint n = new NumPrint();
		
		a.start();
		c.start();
		n.start();
	}

}