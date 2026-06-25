public class FantasmaRosaPrototype extends FantasmaBase{
    protected FantasmaRosaPrototype(FantasmaRosaPrototype FantasmaRosaPrototype){
        this.cor = FantasmaRosaPrototype.getCor();
    }

    public FantasmaRosaPrototype(){
        this.cor = "rosa";
    }

    @Override
    public String exibirInformacoes(){
        return "Jessica, o fantasma " + getCor() + "!";
    }

    @Override
    public FantasmaBase clonar(){
        return new FantasmaRosaPrototype(this);
    }

}