import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    private List<Item> itens;
    private static int contadorCodigo = 4; // gera o código dos itens da loja - o valor inicial deve ser igual ao núm de itens já adicionados + 1
    Scanner scanner = new Scanner(System.in);

    // Construtor
    public Loja() {
        this.itens = new ArrayList<>();
    }

    // Adicionar item à loja
    public void adicionarItem(Item item) {
        itens.add(item);
        System.out.println(item.getNome() + " foi adicionado à loja.");
    }

    // Método para gerar o próximo código
    public static int gerarCodigoUnico() {
        return contadorCodigo++;  // Retorna o código atual e incrementa para o próximo
    }

    // Itens adicionados pelo terminal
    public void addItem() {
        System.out.println("Deseja adicionar seu item à loja?\n1. Sim\n2. Não");
        int escolha = scanner.nextInt();

        if (escolha == 1) {
            System.out.println("Digite o nome do item a ser adicionado: ");
            String nome = scanner.next();

            System.out.println("Escolha a classe do item a ser adicionado:");
            System.out.println("1. Arma\n2. Armadura\n3. Poção");
            int tipoItemEscolha = scanner.nextInt();

            System.out.println("Digite o preço do item: ");
            int preco = scanner.nextInt();

            switch (tipoItemEscolha) {
                case 1:  // Arma
                    System.out.println("Digite o tipo da arma (Espada, Arco, etc.): ");
                    String tipoArma = scanner.next();
                    System.out.println("Digite o dano da arma: ");
                    int dano = scanner.nextInt();
                    Arma novaArma = new Arma(gerarCodigoUnico(), nome, tipoArma, preco, TipoItem.ARMA, dano);
                    adicionarItem(novaArma);
                    break;

                case 2:  // Armadura
                    System.out.println("Digite o valor de defesa da armadura: ");
                    int defesa = scanner.nextInt();
                    Armadura novaArmadura = new Armadura(gerarCodigoUnico(), nome, preco, defesa);
                    adicionarItem(novaArmadura);
                    break;

                case 3:  // Poção
                    System.out.println("Digite o valor de cura da poção: ");
                    int cura = scanner.nextInt();
                    Pocao novaPocao = new Pocao(gerarCodigoUnico(), nome, preco, cura);
                    adicionarItem(novaPocao);
                    break;

                default:
                    System.out.println("Escolha uma opção válida!");
                    addItem();  // Chama novamente a função em caso de erro
                    break;
            }
        } else if (escolha == 2) {
            // Caso o jogador não queira adicionar um item
            System.out.println("Voltando ao menu...");
            //menu.exibirMenu();
        } else {
            System.out.println("Escolha uma opção válida.");
            addItem();  // Chama novamente a função em caso de erro
        }
    }

    // Listar itens da loja
    public void listarItens() {
        System.out.println("Itens disponíveis na loja:");
        for (Item item : itens) {
            System.out.println(item);
        }
    }
    // Método para buscar um item pelo código
    public Item buscarItem(int codigo) {
        for (Item item : itens) {
            if (item.getCodigo() == codigo) {
                return item;
            }
        }
        return null; // Se não encontrar, retorna null
    }
}
