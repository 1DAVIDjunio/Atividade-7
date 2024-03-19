import javax.swing.JOptionPane;


public class Main {
    public static void main(String[] args) {
        FilaDeEstudantes fila = new FilaDeEstudantes(5); // Fila com tamanho máximo de 5

        // Interface com o usuário usando JOptionPane
        while (true) {
            String opcao = JOptionPane.showInputDialog("Escolha uma opção:\n1. Enfileirar estudante\n2. Desenfileirar estudante\n3. Sair");
            if (opcao == null) {
                break; // Se o usuário clicar em Cancelar ou Fechar, sai do loop
            }
            switch (opcao) {
                case "1":
                    String nome = JOptionPane.showInputDialog("Digite o nome do estudante:");
                    int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do estudante:"));
                    Estudante novoEstudante = new Estudante(nome, idade);
                    if (fila.enfileirar(novoEstudante)) {
                        JOptionPane.showMessageDialog(null, "Estudante enfileirado com sucesso!");
                    } else {
                        JOptionPane.showMessageDialog(null, "Fila cheia! Não é possível enfileirar mais estudantes.");
                    }
                    break;
                case "2":
                    Estudante estudanteDesenfileirado = fila.desenfileirar();
                    if (estudanteDesenfileirado != null) {
                        JOptionPane.showMessageDialog(null, "Estudante desenfileirado: \nNome: " + estudanteDesenfileirado.getNome() + "\nIdade: " + estudanteDesenfileirado.getIdade());
                    } else {
                        JOptionPane.showMessageDialog(null, "Fila vazia! Não há estudantes para desenfileirar.");
                    }
                    break;
                case "3":
                    return; // Sai do programa
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida!");
            }
        }
    }
}