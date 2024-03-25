import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	  int candidato1, candidato2, candidato3;
	  
	  System.out.println("digite a quantidade de votos do candidato 1: ");
	  candidato1 = input.nextInt();
	  
	  System.out.println("digite a quantidade de votos do candidato 2: ");
	  candidato2 = input.nextInt();
	  
	  System.out.println("digite a quantidade de votos do candidato 3");
	  candidato3 = input.nextInt();
	  
	    if (candidato1>(candidato2+candidato3)){
	  System.out.println("o candidato 1 venceu o primeiro turno");
	  }
	    else if (candidato2>(candidato1+candidato3)){
	  System.out.println("o candidato 2 venceu no primeiro turno");
	  }
	    else if(candidato3>(candidato1 + candidato2)){
	 System.out.println("o candidato 3 venceu no primeiro turno");
	 }
        else {
    System.out.println("haverá segundo turno");
    }
	 input.close();
	}
}