import java.util.HashSet;
import java.util.Set;

public class Tarefa {
    private String titulo;
    private String tipo;
    private String local;
    private int capacidadeMaxima;

    private Set<Voluntario> voluntarios = new HashSet<>();

    public Tarefa(String titulo, String tipo, String local, int capacidadeMaxima, int voluntarios) {
        this.titulo = titulo;
        this.tipo = tipo;
        this.local = local;
        this.capacidadeMaxima = capacidadeMaxima;
    }

    // Getters

    public String getTitulo() {
        return titulo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getLocal() {
        return local;
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    // Setters

    public String setTitulo() {
        return titulo;
    }

    public String setTipo() {
        return tipo;
    }

    public String setLocal() {
        return local;
    }

    public int setCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public Set<Voluntario> getVoluntarios() {
        return voluntarios;
    }
}
