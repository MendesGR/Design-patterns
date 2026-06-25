public abstract class FantasmaBase {
    protected String cor;
    
    public abstract String exibirInformacoes();

    public abstract FantasmaBase clonar();

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }
}
