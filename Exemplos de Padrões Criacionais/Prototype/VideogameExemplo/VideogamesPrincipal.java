public class VideogamesPrincipal {
    public static void main(String[] args) {
        XboxPrototype prototipoXbox = new XboxPrototype();
        PlaystationPrototype prototipoPlaystation = new PlaystationPrototype();
        NintendoPrototype prototipoNintendo = new NintendoPrototype();

        VideogameBase xboxNovo = prototipoXbox.clonar();
        VideogameBase playstationNovo = prototipoPlaystation.clonar();
        VideogameBase nintendoNovo = prototipoNintendo.clonar();

        xboxNovo.setValorCompra(2500);
        playstationNovo.setValorCompra(3000);
        nintendoNovo.setValorCompra(2000);

        System.out.println(xboxNovo.exibirInformacoes() + "\n");
        System.out.println(playstationNovo.exibirInformacoes() + "\n");
        System.out.println(nintendoNovo.exibirInformacoes());
    }

}