import java.util.ArrayList;
import java.util.List;

public class Historico {
    private List<Memento> estados = new ArrayList<>();

    public void addMemento(Memento memento) {
        estados.add(memento);
    }

    public Memento getMemento(int indice) {
        return estados.get(indice);
    }

}