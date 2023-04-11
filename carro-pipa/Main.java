/******************************************************************************

Um determinado equipamento controla o fluxo de água de um poço artesiano. O equipamento tem 3 níveis de regulagem.
No nível 1 o fluxo é de 12,5 l/m (litros por minuto)
No nível 2 o fluxo é de 25 l/m (litros por minuto)
No nível 3 o fluxo é de  50l/m (litros por minuto)
Escreva um programa para receber a capacidade em litros do reservatório de um carro
pipa e o nível de regulagem do equipamento. Mostrar quantos minutos serão
necessários para encher o reservatório do carro pipa.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	 
	 final double NIVEL1=12.5, NIVEL2=25, NIVEL3=50;
	 
	 double capacidade;
	 int nivel;
	 
	 System.out.print("digite a capacidade do reservatorio: ");
	 capacidade = input.nextDouble();
	 
	 System.out.print("digite o nível de regulagem (1, 2 ou 3) ");
	 nivel = input.nextInt();
	 
	 if (nivel==1){
	   System.out.println("Será necessário " + (capacidade/NIVEL1)+" minutos");
	 } 
	 else if (nivel==2){
	   System.out.println("Será necessário " + (capacidade/NIVEL2)+" minutos");
	 }
	 else if (nivel==3){  
	   System.out.println("Será necessário " + (capacidade/NIVEL3)+" minutos");
	 
	}
	else{
	    System.out.println("Digite o nível correto");
	}
	input.close();
}
}
