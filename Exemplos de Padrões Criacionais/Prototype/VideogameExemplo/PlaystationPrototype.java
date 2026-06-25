public class PlaystationPrototype extends VideogameBase{
    
    protected PlaystationPrototype(PlaystationPrototype playstationPrototype){
        this.valorCompra = playstationPrototype.getValorCompra();
    }

    public PlaystationPrototype(){
        valorCompra = 0.0;
    }

    @Override
    public String exibirInformacoes(){
        return "Modelo: Playstation 5 \nFabricante: Sony \nValor: R$ " + getValorCompra();
    }

    @Override
    public VideogameBase clonar(){
        return new PlaystationPrototype(this); 
    }
}