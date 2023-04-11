
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 int primeiroNumero = 5;
	  int segundoNumero = 10;
	  
	  if (primeiroNumero>=segundoNumero){
	      primeiroNumero = segundoNumero;
	      segundoNumero = primeiroNumero;
	  }
	  else {
	      segundoNumero = primeiroNumero;
	      primeiroNumero = segundoNumero;
	  }
	 System.out.println("primeiro numero: " + primeiroNumero);
	 System.out.println("segundo numero: " + segundoNumero);
	 
	 input.close();
	}
}
