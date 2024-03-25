import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int pessoaNova = Integer.MAX_VALUE;
	
	  for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = input.nextInt();

            if (idade < pessoaNova) {
                pessoaNova = idade;
            }
        }

        System.out.println("A pessoa mais nova tem " + pessoaNova + " anos.");
        
        input.close();
	}
}