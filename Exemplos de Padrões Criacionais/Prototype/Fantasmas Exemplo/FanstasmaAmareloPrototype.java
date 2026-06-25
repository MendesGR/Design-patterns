public class FanstasmaAmareloPrototype extends FantasmaBase{
    protected FanstasmaAmareloPrototype(FanstasmaAmareloPrototype FanstasmaAmareloPrototype){
        this.cor = FanstasmaAmareloPrototype.getCor();
    }

    public FanstasmaAmareloPrototype(){
        this.cor = "amarelo";
    }

    @Override
    public String exibirInformacoes() {
        return "Joana, o fantasma " + getCor() + "!";
    }

    @Override
    public FantasmaBase clonar() {
        return new FanstasmaAmareloPrototype(this);
    }
   
}