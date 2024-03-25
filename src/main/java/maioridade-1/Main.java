/******************************************************************************

Escreva um programa para receber a idade de 5 pessoas e mostrar quantas pessoas são maior de idade e quantas são menor de idade.
Obs.: Maioridade = 18

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maioridade = 18;
		int maiorIdade = 0;
		int menorIdade = 0;
		int idade;
		
		System.out.println("digite a idade de 5 pessoas");
		
		for (int i = 0; i<5; i++){
		System.out.print("Pessoa " + (i + 1) + ": ");
		idade = input.nextInt();
		
		if(idade>=maioridade){
		    maiorIdade++;
		}
		else{
		    menorIdade++;
		}
		}
		 System.out.println("Quantidade de pessoas maiores de idade: " + maiorIdade);
        System.out.println("Quantidade de pessoas menores de idade: " + menorIdade);
        
	input.close();
}
}
