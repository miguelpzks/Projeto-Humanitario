package models;


public class Necessidade {
    private String nome;       // Nome da necessidade (ex.: "Arroz", "Cobertor")
    private int quantidade;    // Quantidade necessária
    private String descricao;  // Detalhes adicionais
    private Voluntario voluntario; // Voluntário responsável pela necessidade

    // Construtor
    public Necessidade(String nome, int quantidade, String descricao) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.descricao = descricao;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Voluntario getVoluntario() {
        return voluntario;
    }

    public void setVoluntario(Voluntario voluntario) {
        this.voluntario = voluntario;
    }

    // Método útil para exibir informações da necessidade
    @Override
    public String toString() {
        return "Necessidade{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
