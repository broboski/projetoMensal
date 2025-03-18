class Arma extends Item {
    String tipoArma; // Tipo da arma, como "Espada", "Arco", etc.
    int dano;

    // Construtor da classe Armas, que chama o construtor da classe pai (Item)
    public Arma(int codigo, String nome, String tipoArma, int preco,TipoItem tipoItem , int dano) {
        super(codigo, nome, preco, tipoItem); // Chama o construtor da classe pai (Item)
        this.tipoArma = tipoArma; // Define o tipoArma da arma
        this.dano = dano; // Define o dano da arma
    }

    // Getter para o tipoArma da arma
    public String getTipoArma() {
        return tipoArma;
    }

    @Override
    public void usar() {

    }

    public int getDano() {
        return dano;
    }

    // Sobrescreve o método toString() para incluir o tipoArma da arma e o dano
    @Override
    public String toString() {
        return super.toString() + ", Tipo: " + tipoArma + ", Dano: " + dano + "]";
    }
}



