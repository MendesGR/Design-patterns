public abstract class VideogameBase {
    protected double valorCompra;

    public abstract String exibirInformacoes();

    public abstract VideogameBase clonar();

    public double getValorCompra(){
        return valorCompra;
    }

    public void setValorCompra(double valorCompra){
        this.valorCompra = valorCompra;
    }

}