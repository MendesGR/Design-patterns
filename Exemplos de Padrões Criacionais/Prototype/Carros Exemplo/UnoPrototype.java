public class UnoPrototype extends CarroBasePrototype{
    
    protected UnoPrototype(UnoPrototype unoPrototype){
        this.valorCompra = unoPrototype.getValorCompra();
    }

    public UnoPrototype(){
        valorCompra = 0.0;
    }

    @Override
    public String exibirInfo(){
        return "Modelo: Uno \nFabricante: Fiat \nValor: R$" + getValorCompra();
    }

    @Override
    public CarroBasePrototype clonar(){
        return new UnoPrototype(this);
    }
}