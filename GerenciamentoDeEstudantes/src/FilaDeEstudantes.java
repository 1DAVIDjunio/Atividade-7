class FilaDeEstudantes {
    private Estudante[] fila;
    private int tamanhoMaximo;
    private int tamanhoAtual;
    private int inicio;
    private int fim;

    public FilaDeEstudantes(int tamanhoMaximo) {
        this.tamanhoMaximo = tamanhoMaximo;
        this.fila = new Estudante[tamanhoMaximo];
        this.tamanhoAtual = 0;
        this.inicio = 0;
        this.fim = -1;
    }

    public boolean enfileirar(Estudante estudante) {
        if (tamanhoAtual == tamanhoMaximo) {
            return false; // Fila cheia
        }
        fim = (fim + 1) % tamanhoMaximo;
        fila[fim] = estudante;
        tamanhoAtual++;
        return true;
    }

    public Estudante desenfileirar() {
        if (tamanhoAtual == 0) {
            return null; // Fila vazia
        }
        Estudante estudante = fila[inicio];
        inicio = (inicio + 1) % tamanhoMaximo;
        tamanhoAtual--;
        return estudante;
    }
}