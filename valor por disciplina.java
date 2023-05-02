import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 
	 final double VALOR_POR_DISCIPLINA = 100.00;
	 double valorMensalidade;
	 int qntDisciplina;
	 
	 
	 System.out.println("digite a quantidade de disciplina: ");
	 qntDisciplina = input.nextInt();
	 
	 valorMensalidade = (VALOR_POR_DISCIPLINA * qntDisciplina);
	 System.out.println("o valor da mensalidade será: " + valorMensalidade);
	 
	}
}