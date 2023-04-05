/******************************************************************************

Escreva um programa para receber o valor bruto do imposto de renda e a quantidade de dependentes. Calcule e mostre o valor do imposto a pagar, sabendo que por cada dependente pode ser descontado o valor de R$ 1000,00.
Observação: O valor bruto do imposto pode ser menor que total do desconto por dependente.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		double valorBruto, valorDescontoDependente, valorImpostoAPagar;
		int qntDependente;
		
		System.out.println("Digite o valor bruto do imposto: R$ ");
		valorBruto = input.nextDouble();
		
		System.out.println("Digite a quantidade de dependentes: ");
		qntDependente = input.nextInt();
		
		valorDescontoDependente = qntDependente * 1000;
		valorImpostoAPagar = valorBruto - valorDescontoDependente;
		
		if (valorImpostoAPagar>0){
		   valorImpostoAPagar=0;
		}
		System.out.println("Valor do imposto a pagar: R$" + valorImpostoAPagar);
			input.close();
		}
}

