import java.util.Scanner;

public class NumerosView {
    private Scanner scanner;

	public void exibirNumeros(int[] numeros) {
        System.out.println("Números:");
        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
        System.out.println();
    }

    public int lerNumero() {
        scanner = new Scanner(System.in);
        System.out.print("Digite um número: ");
        return scanner.nextInt();
    }
}
