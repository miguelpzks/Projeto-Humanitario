import java.util.*;
import java.util.stream.Collectors;

public class ConectaVoluntario{
    // Map para prganizar voluntarios pelo ID
    private Map<String, Voluntario> voluntarios = new HashMap<>();

    // Map para armazenar as tarefas
    private Map<String, Tarefa> tarefas = new HashMap<>();

    // Contrutor
    public ConectaVoluntario(){}

    // GERENCIAMENTO

    // Metodo de cadastro de voluntario
    public void CadastrarVoluntario(Voluntario v) {
        voluntarios.put(v.getContato(), v);
    }

    public void CadastrarTarefa(Tarefa t) {
        tarefas.put(t.getTitulo(), t);
    }

    public boolean inscreverVoluntario(String email, String titulo) {
        Voluntario v = voluntarios.get(email);
        Tarefa t = tarefas.get(titulo);
        if (v != null && t != null && t.getVoluntarios().size() < t.getCapacidadeMaxima()) {
            return t.getVoluntarios().add(v);
        }
        return false;
    }

    public List<Tarefa> listaTarefasDisponivel() {
        return tarefas.values().stream().filter(t -> t.getVoluntarios().size() < t.getCapacidadeMaxima()).collect(Collectors.toList());
    }

    public Set<Voluntario> listarVoluntariosDisponiveis(String titulo) {
        Tarefa t = tarefas.get(titulo);
        if (t != null) {
            return t.getVoluntarios();
        }
        return new HashSet<>();
    }
}