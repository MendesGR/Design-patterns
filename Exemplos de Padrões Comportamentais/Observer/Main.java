public class Main {

    public static void main(String[] args) {

        CanalYoutube canal = new CanalYoutube();

        Observer joao = new Inscrito("João");
        Observer maria = new Inscrito("Maria");
        Observer pedro = new Inscrito("Pedro");

        canal.adicionar(joao);
        canal.adicionar(maria);
        canal.adicionar(pedro);

        canal.publicarVideo("Novo vídeo sobre Observer Pattern");

    }

}