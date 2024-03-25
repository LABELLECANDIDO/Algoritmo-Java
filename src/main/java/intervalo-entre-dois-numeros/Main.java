/******************************************************************************

Receber dois números inteiros positivos. Considerar que o usuário
sempre vai digitar números inteiros positivos. Criticar para só aceitar
os números se o primeiro número for menor que o segundo número.
Mostrar todos os números ímpares do primeiro ao último número informado.
*******************************************************************************/
import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	    
	 int primeiroNum, segundoNum;
	 
	 do{
	     System.out.print("Digite o primeiro numero: ");
	     primeiroNum = input.nextInt();
	     
	     System.out.print("Digite o segundo numero: ");
	     segundoNum = input.nextInt();
	 
	 if (primeiroNum >= segundoNum){
	     System.out.println("O primeiro numero deve ser menor que o segundo numero. Tente novamente!");
	 }} 
	 while(primeiroNum>=segundoNum);
	    System.out.print("Números ímpares entre " + primeiroNum + " e " + segundoNum + " são: "); 
	 
	  for (int i = primeiroNum; i <= segundoNum; i++) {
            if (i % 2 != 0) {
            System.out.print(i + " ");
	}
}
input.close();
}
}
