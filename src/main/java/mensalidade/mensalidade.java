import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 double valorMensalidade;
	 int qntDisciplina;
	 final double valorDisciplina = 100;
	 
	 System.out.println("digite a quantidade de disciplina: ");
	 qntDisciplina = input.nextInt();
	 
	 valorMensalidade = (valorDisciplina * qntDisciplina);
	 System.out.println("o valor da mensalidade será: " + valorMensalidade);
	 
	 
	 
	 
	 
	 
	}
}
