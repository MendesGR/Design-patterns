public class FactoryMethod {
    public static void main(String[] args) {
        Carro carro = new Gol();
        Carro carro2 = new Celta();
        Carro carro3 = new Palio();
        Carro carro4 = new Uno();

        System.out.println("Carro 1.");
        carro.exibirInfo();
        System.out.println();

        System.out.println("Carro 2.");
        carro2.exibirInfo();
        System.out.println();

        System.out.println("Carro 3.");
        carro3.exibirInfo();
        System.out.println();

        System.out.println("Carro 4.");
        carro4.exibirInfo();
        System.out.println();
    }
}
