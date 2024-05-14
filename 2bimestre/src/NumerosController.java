public class NumerosController {
    private NumerosModel model;
    private NumerosView view;

    public NumerosController(NumerosModel model, NumerosView view) {
        this.model = model;
        this.view = view;
    }

    public void adicionarNumeros() {
        for (int i = 0; i < 10; i++) {
            int numero = view.lerNumero();
            model.setNumero(i, numero);
        }
    }

    public void ordenarNumeros() {
        int[] numeros = model.getNumeros();
        int n = numeros.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (numeros[j] > numeros[j+1]) {
                    int temp = numeros[j];
                    numeros[j] = numeros[j+1];
                    numeros[j+1] = temp;
                }
            }
        }
    }

    public void exibirNumeros() {
        view.exibirNumeros(model.getNumeros());
    }
}
