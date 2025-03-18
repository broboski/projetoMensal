public class Pocao extends Item implements InterfaceConsumivel {
    private int cura;

    // Construtores
    public Pocao() {} // Construtor padrão

    public Pocao(int codigo, String nome, int preco, int cura) { // Construtor parametrizado
        super(codigo, nome, preco, TipoItem.POCAO);
        this.cura = cura;
    }

    public Pocao(Pocao outraPocao) { // Construtor de cópia
        super(outraPocao);
        this.cura = outraPocao.cura;
    }

    // Método abstrato sobrescrito
    @Override
    public void usar() {
        System.out.println("Você usou " + getNome() + " e recuperou " + cura + " de vida!");
    }

    // Método da interface
    @Override
    public void consumir() {
        System.out.println(getNome() + " foi consumida!");
    }

    @Override
    public String toString() {
        return super.toString() + ", Cura: " + cura + "]";
    }
}
