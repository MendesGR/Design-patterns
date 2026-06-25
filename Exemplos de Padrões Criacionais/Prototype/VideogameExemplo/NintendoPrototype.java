public class NintendoPrototype extends VideogameBase{
    
    protected NintendoPrototype(NintendoPrototype nintendoPrototype){
        this.valorCompra = nintendoPrototype.getValorCompra();
    }

    public NintendoPrototype(){
        valorCompra = 0.0;
    }

    @Override
    public String exibirInformacoes(){
        return "Modelo: Nintendo Switch \nFabricante: Nintendo \nValor: R$ " + getValorCompra();
    }

    @Override
    public VideogameBase clonar(){
        return new NintendoPrototype(this);
    }
    
}