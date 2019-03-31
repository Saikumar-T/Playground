import java.util.Scanner;
class Main
{
	public static void main (String[] args)
    {
	 Scanner sc=new Scanner(System.in);
      long n=sc.nextInt();
      System.out.println(Square(n));
	} 
   static long Square(long num)
  {
    long square=num*num;
    return square;
  }
}