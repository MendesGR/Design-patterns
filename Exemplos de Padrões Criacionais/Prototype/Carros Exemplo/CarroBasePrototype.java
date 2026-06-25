public abstract class CarroBasePrototype {
    protected double valorCompra;

    public abstract String exibirInfo();

    public abstract CarroBasePrototype clonar();

    public double getValorCompra(){
        return valorCompra;
    }

    public void setValorCompra(double valorCompra){
        this.valorCompra = valorCompra;
    }
}