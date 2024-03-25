import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);

    int qntNotas = 0;
    double soma = 0; 
    double nota = 0;
    
    do {
        System.out.println("digite a sua n1, logo em seguida, digite a n2 e depois n3: ");
        nota = input.nextDouble();
        
        if (nota < 0 || nota > 10){
        System.out.println("digite uma nota valida!");
        nota = 0;
        }
        else{
            qntNotas = qntNotas + 1;
            soma = soma + nota;
        }
       }  while(qntNotas != 3);
   
    double media = soma/3;
    System.out.print("sua nota é: " + media + " e ");
    
    if (media>5){
        System.out.print("você está acima da media. Parabéns!");
    }
    else if (media==5){
        System.out.print("você está na media!");
    }
    else {
        System.out.print("você está abaixo da media. Estude mais da proxima!");
    }
	}
}
