public class FiestaPrototype extends CarroBasePrototype {

    protected FiestaPrototype(FiestaPrototype fiestaPrototype){
        this.valorCompra = fiestaPrototype.getValorCompra();
    }

    public FiestaPrototype(){
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo(){
        return "Modelo: Fiesta \nFabricante: Ford\n" + "Valor: R$" + getValorCompra();
    }

    @Override
    public CarroBasePrototype clonar(){
        return new FiestaPrototype(this);
    }
}