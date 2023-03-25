import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	 double valorLocacao;
	 
	 System.out.println("digite o valor da locação: ");
	 valorLocacao = input.nextDouble();
	 
	 int diasAtraso; 
	 
	 System.out.println("digite o numero de dias de atraso na devolução:");
	 diasAtraso = input.nextInt();
	 
	 double valorMulta = valorLocacao * 0.0005 * diasAtraso; 
	 double valorTotal = valorLocacao + valorMulta;
	 
	 if (diasAtraso>0){
	     System.out.printf("Valor total da multa: R$ %.2f\n", valorMulta);
	 }
	     System.out.printf("Valor total a ser pago: R$ %.2f\n", valorTotal);
	 
	 input.close();
	}

}
