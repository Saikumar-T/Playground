import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      System.out.println(Sum(n));
	}
      static int Sum(int num)
      {
        int out=0;
        for(int i=1;i<=num;i++)
      {
      out=out+i;
      }
        return out;
     }
}

