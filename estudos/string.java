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
	
	String texto, textoConvertido, primeiraLetra, restoTexto;
	
        System.out.print("digite um texto: ");
        texto = input.nextLine();

        primeiraLetra = texto.substring(0, 1).toUpperCase();
        restoTexto = texto.substring(1).toLowerCase();
        
        textoConvertido = primeiraLetra + restoTexto;
        
        System.out.println("Texto convertido: " + textoConvertido);
        
        input.close();
	}
}
