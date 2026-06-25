public class XboxPrototype extends VideogameBase{
    
    protected XboxPrototype(XboxPrototype xboxPrototype){
        this.valorCompra = xboxPrototype.getValorCompra();
    }

    public XboxPrototype(){
        valorCompra = 0.0;
    }

    @Override
    public String exibirInformacoes(){
        return "Modelo: Xbox One \nFabricante: Microsoft \nValor: R$ " + getValorCompra();
    }

    @Override
    public VideogameBase clonar(){
        return new XboxPrototype(this);
    }

}