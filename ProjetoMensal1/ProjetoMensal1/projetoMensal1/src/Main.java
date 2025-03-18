public class Main {
    public static void main(String[] args) {
        // Criando a loja e o jogador
        Loja loja = new Loja();
        Jogador jogador = new Jogador("Herói");
        Menu menu = new Menu(loja, jogador);

        // Adicionando itens à loja
        loja.adicionarItem(new Arma(1, "Espada de Ferro", "Espada", 50, TipoItem.ARMA, 10));
        loja.adicionarItem(new Armadura(2, "Armadura de Couro", 30, 5));
        loja.adicionarItem(new Pocao(3, "Poção de Cura", 20, 15));

        // Exibindo o menu
        menu.exibirMenu();
    }
}