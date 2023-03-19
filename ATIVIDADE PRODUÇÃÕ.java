import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);

        // Ler a quantidade de peças produzidas no 1 turno
        System.out.println("Informe a quantidade de peças produzidas no 1º turno: ");
        int qtdTurno1 = input.nextInt();

        // Ler a quantidade de peças produzidas no 2 turno
        System.out.println("Informe a quantidade de peças produzidas no 2º turno: ");
        int qtdTurno2 = input.nextInt();

        // Calcula o total de peças produzidas no dia
        int totalProduzido = qtdTurno1 + qtdTurno2;

        // Exibe o resultado
        System.out.println("O total de peças produzidas no dia foi: " + totalProduzido);

        input.close();
    }
}

