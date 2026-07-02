import java.util.ArrayList;
import java.util.List;

public class CanalYoutube implements Canal {
    private List<Observer> inscritos = new ArrayList<>();

    private String ultimoVideo;

    public void publicarVideo(String video) {
        this.ultimoVideo = video;
        notificar(video);
    }

    @Override
    public void adicionar(Observer observer) {
        inscritos.add(observer);
    }

    @Override
    public void remover(Observer observer) {
        inscritos.remove(observer);
    }

    @Override
    public void notificar(String mensagem) {
        for (Observer obs : inscritos) {
            obs.atualizar("Novo video publicado: " + ultimoVideo);
        }
    }

}