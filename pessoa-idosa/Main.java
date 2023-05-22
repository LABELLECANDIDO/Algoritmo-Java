/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	int pessoaIdosa = 0;
	
	  for (int i = 1; i <= 5; i++) {
            System.out.print("Digite a idade da pessoa " + i + ": ");
            int idade = input.nextInt();

            if (idade > pessoaIdosa) {
                pessoaIdosa = idade;
            }
        }

        System.out.println("A pessoa mais idosa tem " + pessoaIdosa + " anos.");
        
        input.close();
	}
}
