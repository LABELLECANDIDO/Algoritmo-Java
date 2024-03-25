import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double valorEnergia, valorNet, totalASerPago;
		int qntIrmao;
		
		System.out.print("digite a quantidade de irmaos: ");
		qntIrmao = input.nextInt();
		
		System.out.print("digite o valor da conta de energia: ");
		valorEnergia = input.nextDouble();
		
		System.out.print("digite o valor da conta de internet: ");
		valorNet = input.nextDouble();
		
		System.out.println("o valor que cada um pagará será: " + (totalASerPago = valorNet + valorEnergia) / qntIrmao );
		
		input.close();
	}
}
