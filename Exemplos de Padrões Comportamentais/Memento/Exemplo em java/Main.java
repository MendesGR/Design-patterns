public class Main {

    public static void main(String[] args) {

        EditorTexto editor = new EditorTexto();
        Historico historico = new Historico();

        editor.setTexto("Primeira versão do texto.");
        historico.addMemento(editor.salvar());

        editor.setTexto("Segunda versão do texto.");
        historico.addMemento(editor.salvar());

        editor.setTexto("Terceira versão do texto.");

        System.out.println("Texto atual: " + editor.getTexto());

        editor.restaurar(historico.getMemento(0));

        System.out.println("Texto restaurado: " + editor.getTexto());

    }

}