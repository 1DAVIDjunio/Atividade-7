public class NumerosModel {
    private int[] numeros;

    public NumerosModel() {
        numeros = new int[10];
    }

    public int[] getNumeros() {
        return numeros;
    }

    public void setNumero(int index, int numero) {
        numeros[index] = numero;
    }
}
