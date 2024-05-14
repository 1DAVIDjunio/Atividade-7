public class Main {
    public static void main(String[] args) {
        NumerosModel model = new NumerosModel();
        NumerosView view = new NumerosView();
        NumerosController controller = new NumerosController(model, view);

        controller.adicionarNumeros();
        controller.ordenarNumeros();
        controller.exibirNumeros();
    }
}
