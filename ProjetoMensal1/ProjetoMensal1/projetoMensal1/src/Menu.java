import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    private Loja loja;
    private Jogador jogador;
    private Scanner scanner;
    // Construtor
    public Menu(Loja loja, Jogador jogador) {
        this.loja = loja;
        this.jogador = jogador;
        this.scanner = new Scanner(System.in);
    }
    // Método para exibir o menu
    public void exibirMenu() {
        int escolha;
        do {
            System.out.println("\nBem-vindo à Loja de Itens de RPG!");
            jogador.mostrarGold();
            System.out.println("1. Listar itens da loja");
            System.out.println("2. Adicionar um item à loja");
            System.out.println("3. Comprar item");
            System.out.println("4. Ver inventário");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    loja.listarItens();
                    break;
                case 2:
                    loja.addItem();
                    break;
                case 3:
                    comprarItem();
                    break;
                case 4:
                    jogador.listarInventario();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (escolha != 0);
    }
    // Método para comprar um item
    private void comprarItem() {
        System.out.print("Digite o código do item que deseja comprar: ");
        int codigo = scanner.nextInt();
        // Recupera o item da loja usando o código
        Item item = loja.buscarItem(codigo);
        if (item != null) {
            // Verifica se o jogador tem gold suficiente
            if (jogador.verificarGold(item.getPreco())) {
                jogador.adicionarItem(item); // Se o jogador tem gold, o item é adicionado ao inventário
            } else {
                System.out.println("Compra não realizada devido a gold insuficiente.");
            }
        } else {
            System.out.println("Item não encontrado!");
        }
    }
}
