public class FactoryFiat implements FactoryDeCarro{
    
    @Override
    public Carro criarCarro(){
        return new Palio();
    }

}