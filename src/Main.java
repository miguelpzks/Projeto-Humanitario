import models.Necessidade;
import models.Tarefa;
import models.Voluntario;
import service.ConectaVoluntarioService;

public class Main {
    public static void main(String[] args) {
        ConectaVoluntarioService conecta = new ConectaVoluntarioService();

        Voluntario v1 = new Voluntario("João Silva", "joao@email.com", "11999999999");
        Voluntario v2 = new Voluntario("Maria Souza", "maria@email.com", "11888888888");

        // Criando tarefas
        Tarefa tarefa1 = new Tarefa("Limpeza de Parque", "Limpeza geral do parque municipal", "Parque Central",
                "2023-10-15", 20);
        Tarefa tarefa2 = new Tarefa("Doação de Sangue", "Campanha de doação de sangue no hospital local",
                "Hospital Municipal", "2023-10-20", 15);

        // Cadastrando voluntários e tarefas
        conecta.CadastrarVoluntario(v1);
        conecta.CadastrarVoluntario(v2);
        conecta.CadastrarTarefa(tarefa1);
        conecta.CadastrarTarefa(tarefa2);

        // Conectando voluntários às tarefas
        conecta.inscreverVoluntario("joao@email.com", "Limpeza de Parque");
        conecta.inscreverVoluntario("maria@email.com", "Limpeza de Parque");

        // Exibir voluntários na tarefa
        System.out.println("Voluntários na tarefa " + tarefa1.getTitulo() + ":");
        for (Voluntario v : tarefa1.getVoluntarios()) {
            System.out.println("- " + v.getNome());
        }

        // Criando necessidades
        Necessidade n1 = new Necessidade("Luvas", 50, "Equipamento de proteção");
        n1.setVoluntario(v1); // associando responsável

        System.out.println("\nNecessidades registradas:");
        System.out.println("- " + n1.getDescricao() + " | Quantidade: " + n1.getQuantidade() + " | Responsável: "
                + n1.getVoluntario().getNome());
    }
}
