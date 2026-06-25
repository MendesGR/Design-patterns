public class FantasmaAzulPrototype extends FantasmaBase{
    protected FantasmaAzulPrototype(FantasmaAzulPrototype FantasmaAzulPrototype){
        this.cor = FantasmaAzulPrototype.getCor();
    }

    public FantasmaAzulPrototype(){
        this.cor = "azul";
    }

    @Override
    public String exibirInformacoes() {
        return "Jack, o fantasma " + getCor() + "!";
    }

    @Override
    public FantasmaBase clonar() {
        return new FantasmaAzulPrototype(this);
    }

}