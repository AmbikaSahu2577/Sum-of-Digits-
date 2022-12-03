import java.util.Scanner;
class  Sum_of_Digits
{
	public static void main(String[] args) 
	{
	   int number,rem,sum=0;
	   System.out.println("enter any number");
	   Scanner sc = new Scanner(System.in);
	   number = sc.nextInt();
	   while(number>0)
	   {
	   	  rem=number%10;
	   	  sum=sum+rem;
	   	  number=number/10;
	   }
	   System.out.println("sum of digits = "+sum);	
	}

}