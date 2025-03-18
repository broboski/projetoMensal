import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private String nome;
    private int gold;
    private List<Item> inventario;

    // Construtor
    public Jogador(String nome) {
        this.nome = nome;
        this.gold = 90; // qnt inicial
        this.inventario = new ArrayList<>();
    }

    // Adicionar item ao inventário
    public void adicionarItem(Item item) {
        inventario.add(item);
        System.out.println(item.getNome() + " foi adicionado ao inventário.");
    }

    // Listar itens do inventário
    public void listarInventario() {
        System.out.println("Inventário de " + nome + ":");
        if (inventario.isEmpty()) {  // Verifica se o inventário está vazio
            System.out.println("Você não comprou nenhum item ainda.");
        } else {
            for (Item item : inventario) {
                System.out.println(item);
            }
        }
    }

    // Verificar se o jogador tem gold suficiente para comprar um item
    public boolean verificarGold(int preco) {
        if (this.gold >= preco) {
            this.gold -= preco; // Subtrai o valor do gold do jogador
            System.out.println("Item comprado. Quantidade atual de gold: " + this.gold);
            return true; // Retorna verdadeiro se a compra foi bem-sucedida
        } else {
            System.out.println("Gold insuficiente. Você possui " + this.gold + ", e este item custa " + preco);
            return false; // Retorna falso se o jogador não tem gold suficiente
        }
    }
    void mostrarGold(){
        System.out.printf("Você possui %d moedas!\n", gold);
    }
    // Getter para o valor de gold
    public int getGold() {
        return this.gold;
    }
}
