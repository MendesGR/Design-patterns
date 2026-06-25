public class FantasmaMain {
    public static void main(String[] args) {
        FantasmaAzulPrototype prototipoAzul =  new FantasmaAzulPrototype();
        FantasmaVermelhoPrototype prototipoRed = new FantasmaVermelhoPrototype();
        FanstasmaAmareloPrototype prototipoAmarelo = new FanstasmaAmareloPrototype();
        FantasmaRosaPrototype prototipoRosa = new FantasmaRosaPrototype();

        FantasmaBase fantasmaBlue = prototipoAzul.clonar();
        FantasmaBase fantasmaRed = prototipoRed.clonar();
        FantasmaBase fantasmaYellow = prototipoAmarelo.clonar();
        FantasmaBase fantasmaPink = prototipoRosa.clonar();

        System.out.println();
        System.out.println(fantasmaBlue.exibirInformacoes());
        System.out.println(fantasmaRed.exibirInformacoes());
        System.out.println(fantasmaYellow.exibirInformacoes());
        System.out.println(fantasmaPink.exibirInformacoes() + "\n");
    }

}