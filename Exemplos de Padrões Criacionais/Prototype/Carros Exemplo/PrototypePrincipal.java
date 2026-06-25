public class PrototypePrincipal{
    public static void main(String[] args) {
        FiestaPrototype prototipoFiesta = new FiestaPrototype();
        FiestaPrototype prototipo2 = new FiestaPrototype();
        UnoPrototype prototipoUno = new UnoPrototype();
        UnoPrototype prototipoUno2 = new UnoPrototype();

        CarroBasePrototype fiestaNovo = prototipoFiesta.clonar();
        CarroBasePrototype fiestaUsado = prototipo2.clonar();
        CarroBasePrototype unoNovo = prototipoUno.clonar();
        CarroBasePrototype unoUsado = prototipoUno2.clonar();

        fiestaNovo.setValorCompra(30000.0);
        fiestaUsado.setValorCompra(18500.0);
        unoNovo.setValorCompra(20000);
        unoUsado.setValorCompra(13500);

        System.out.println();
        System.out.println(fiestaNovo.exibirInfo() + "\n");
        System.out.println(fiestaUsado.exibirInfo() + "\n");
        System.out.println(unoNovo.exibirInfo() + "\n");
        System.out.println(unoUsado.exibirInfo() + "\n");
    }

}