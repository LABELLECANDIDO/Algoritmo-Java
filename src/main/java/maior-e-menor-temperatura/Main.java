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
	
	int maiorTemperatura = Integer.MAX_VALUE;
	int menorTemperatura = Integer.MIN_VALUE;
	int temperatura;
	
	for(int i = 1; i <= 7; i++){
	    System.out.print("digite a temperatura media do dia " + i + ": ");
	    temperatura = input.nextInt();
	    
	    if (temperatura < maiorTemperatura){
	        maiorTemperatura = temperatura;
	    }
	    if(temperatura>menorTemperatura){
	        menorTemperatura = temperatura;
	    }
	    }
	System.out.println("a maior temperatura da semana foi: " + maiorTemperatura + " graus");
	System.out.println("a menor temperatura da semana foi: " + menorTemperatura + " graus");
	}
}
