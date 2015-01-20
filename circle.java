import java.util.Scanner;
public class circle
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please input the circle's radius:");
		int radius=sc.nextInt();
		//i为行数
		//j为列数
		for(int i=0;i<2*radius+1;i++)
		{
			for(int j=0;j<4*radius;j++)
			{
				if((i-radius)*(i-radius)+(j-radius)*(j-radius)<=radius*radius)
					System.out.print("**");
				else System.out.print("  ");
			}
			System.out.println();
		}
	}
}
