import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int maioridade = 18;
		int maiorIdade = 0;
		int menorIdade = 0;
		
		System.out.println("digite a idade de 6 pessoas");
		
		for (int i = 0; i<6; i++){
		System.out.print("Pessoa " + (i + 1) + ": ");
	    int	idade = input.nextInt();
		
		 if (idade >= maioridade) {
            maiorIdade++;
		 }
		
		else {
            menorIdade++;
            }
        }
		
		if(maiorIdade>menorIdade){
		   System.out.print("Tem mais pessoas maior de idade.");
		}
		else if (maiorIdade<menorIdade){
		    System.out.print("Tem mais pessoas menor de idade.");
		}
		else{
		 System.out.println("A quantidade de pessoas maior e menor de idade são iguais");
		}
	input.close();
}
}

