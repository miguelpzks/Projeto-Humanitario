public class Voluntario {
    private String nome;
    private String contato;
    private String habilidade;

    public Voluntario(String nome, String contato, String habilidade) {
        this.nome = nome;
        this.contato = contato;
        this.habilidade = habilidade;
    }

    public String getNome() {
        return nome;
    }

    public String getContato() {
        return contato;
    }

    public String getHabilidade() {
        return habilidade;
    }

    // Setters
    public String setNome() {
        return nome;
    }

    public String setContato() {
        return contato;
    }

    public String setHabilidade() {
        return habilidade;
    }
}
