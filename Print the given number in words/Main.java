import java.util.Scanner;
class Main {
	public static void main (String[] args) {
	    // Type your code here
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      if((n<1)||(n>5))
        System.out.println("Invalid");
      else
      {
        switch(n)
        {
          case 1:System.out.print("One");
          break;
          case 2:System.out.print("Two");
          break;
          case 3:System.out.print("Three");
          break;
          case 4:System.out.print("Four");
          break;
          case 5:System.out.print("Five");
          break;
        }}
	}
}