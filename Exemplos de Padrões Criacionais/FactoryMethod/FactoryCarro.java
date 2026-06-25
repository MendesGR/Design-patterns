public abstract class FactoryCarro {

    public Carro criarCarro(ModeloCarro modelo) {
        switch (modelo) {

            case Celta:
                return new Celta();

            case Uno:
                return new Uno();

            case Gol:
                return new Gol();

            case Palio:
                return new Palio();

            default:
                break;
        }
        return null;
    }
}