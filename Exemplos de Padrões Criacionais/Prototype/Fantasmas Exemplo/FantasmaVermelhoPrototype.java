public class FantasmaVermelhoPrototype extends FantasmaBase{
    protected FantasmaVermelhoPrototype(FantasmaVermelhoPrototype FantasmaVermelhoPrototype){
        this.cor = FantasmaVermelhoPrototype.getCor();
    }

    public FantasmaVermelhoPrototype(){
        this.cor = "vermelho";
    }

    @Override
    public String exibirInformacoes() {
        return "Josh, o fantasma " + getCor() + "!";
    }

    @Override
    public FantasmaBase clonar() {
        return new FantasmaVermelhoPrototype(this);
    }
    
}