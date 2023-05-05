import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);

    int num = 10;
    while (num >= 0)
      {
	if (num % 2 == 0)
	  {
	    System.out.println (num);
	  }
	num--;
      }
  }
}
