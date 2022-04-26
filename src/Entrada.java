import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        int numero;

        // Scanner-> classe com função de receber dados de entrada do teclado
        Scanner leitor = new Scanner(System.in);
        // Atribuição da variável com dados recebidos a partir da função Scanner
        numero = leitor.nextInt();
        // Impressão em tela do valor recebido
        System.out.println(" O numero é: " + numero);
        
    }    
}
