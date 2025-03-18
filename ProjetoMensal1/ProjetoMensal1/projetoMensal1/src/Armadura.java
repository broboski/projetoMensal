public class Armadura extends Item {
    private int defesa;

    // Construtores
    public Armadura() {} // Construtor padrão

    public Armadura(int codigo, String nome, int preco, int defesa) { // Construtor parametrizado
        super(codigo, nome, preco, TipoItem.ARMADURA);
        this.defesa = defesa;
    }

    public Armadura(Armadura outraArmadura) { // Construtor de cópia
        super(outraArmadura);
        this.defesa = outraArmadura.defesa;
    }

    // Método abstrato sobrescrito
    @Override
    public void usar() {
        System.out.println("Você equipou " + getNome() + " e ganhou " + defesa + " de defesa!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Defesa: " + defesa + "]";
    }
}






