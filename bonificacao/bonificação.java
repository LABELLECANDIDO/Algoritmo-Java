import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor do salário do funcionário: ");
        double salario = input.nextDouble();

        double bonificacao;

        if (salario <= 5000) {
            bonificacao = 1000;
        } else {
            bonificacao = 2000;
        }

        double salarioComBonificacao = salario + bonificacao;

        System.out.printf("O valor que o funcionário irá receber com a bonificação é de R$ %.2f", salarioComBonificacao);

        input.close();
    }
}
