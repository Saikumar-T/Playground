import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner sc=new Scanner(System.in);
      int b=sc.nextInt();
      int e=sc.nextInt();
      System.out.println(exponent(b,e));
	}
    static long exponent(int n1, int n2)
       {
      long exp=1;
         for(int i=1;i<=n2;i++)
         {
           exp=exp*n1;
         }
      return exp;
    }
                           
}