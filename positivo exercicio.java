import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double numero;

        System.out.println("Informe um numero: ");
        numero = input.nextDouble();

        if (numero > 0) {
            System.out.println("NUMERO POSITIVO.");
        } else {
            System.out.println("NUMERO NEGATIVO");
        }
        input.close();
    }
}