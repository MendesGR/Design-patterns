public class Principal {
    public static void main(String[] args) {
        Forma circulo = new Circulo();
        Forma quadrado = new Quadrado();
        Forma triangulo = new Triangulo();

        Forma circuloAzul = new AzulFormaDecorada(new Circulo());
        Forma quadradoAzul = new AzulFormaDecorada(new Quadrado());
        Forma trianguloAzul = new AzulFormaDecorada(new Triangulo());

        System.out.println("Circulo com borda normal"); 
        circulo.desenhar();
        System.out.println();
        System.out.println("Circulo com borda azul");
        circuloAzul.desenhar();
        System.out.println();

        System.out.println("Quadrado com borda normal");
        quadrado.desenhar();
        System.out.println();
        System.out.println("Quadrado com borda azul");
        quadradoAzul.desenhar();
        System.out.println();

        System.out.println("Triangulo com borda normal");
        triangulo.desenhar();
        System.out.println();
        System.out.println("Triangulo com borda azul");
        trianguloAzul.desenhar();
        System.out.println();
    }
}