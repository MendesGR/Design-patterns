public class FactoryChevrolet implements FactoryDeCarro{
    
    @Override
    public Carro criarCarro(){
        return new Celta();
    }

}