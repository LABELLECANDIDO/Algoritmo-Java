import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
	  Scanner input = new Scanner(System.in);
	    
	    double valorGalosina = 5.30, valorGnv = 3.90, valorEtanol = 4.80;
	    
    System.out.println("Informe o valor abastecido em etanol: ");
	double qtdEtanol = input.nextDouble();
	
	System.out.println("Informe o valor abastecido em gasolina: ");
	double qtdGasolina = input.nextDouble();
	
	System.out.print("Informe o valor abastecido em GNV: ");
	double qtdGnv = input.nextDouble();
	
    double totalAbastecido = (qtdEtanol * valorEtanol) + (qtdGnv * valorGnv) + (qtdGasolina * valorGalosina);
    
    System.out.println("O total abastecido foi: " + (totalAbastecido));
		
		
	input.close();
	}
}

