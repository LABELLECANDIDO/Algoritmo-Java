import java.util.Scanner;
public class Main
{
  public static void main (String[]args)
  {
    Scanner input = new Scanner (System.in);

    int numero = 10;
    while (numero <= 20)
      {
	System.out.printf("%d\n", numero);
	numero = numero + 1;
      }
       input.close();
  }
}
