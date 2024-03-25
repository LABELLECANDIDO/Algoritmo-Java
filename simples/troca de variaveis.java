import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		 int numb1, numb2,temporaria;
		 
		 System.out.println("informe o primeiro numero: ");
		 numb1 = input.nextInt();
		 
		 System.out.println("informe o segundo numero: ");
		 numb2 = input.nextInt();
		 
		 if (numb1>numb2){
		     temporaria = numb1;
		     numb1 = numb2;
		    numb2 = temporaria;
		 }
		 System.out.println("primeiro numero: " + numb1);
		 System.out.println("segundo numero: " + numb2);
		 
		  input.close();
		 }
		 
	
}
