package models;

import java.util.ArrayList;
import java.util.List;

public class Tarefa {
    private String titulo;
    private String descricao;
    private String local;
    private String data;
    private int capacidadeMaxima;
    private List<Voluntario> voluntarios;

    // Construtor
    public Tarefa(String titulo, String descricao, String local, String data, int capacidadeMaxima) {        this.titulo = titulo;
        this.descricao = descricao;
        this.local = local;
        this.data = data;
        this.capacidadeMaxima = capacidadeMaxima; // Definindo uma capacidade máxima padrão
        this.voluntarios = new ArrayList<>();
    }

    // Getters e Setters
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getCapacidadeMaxima() { 
        return capacidadeMaxima; 
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
         this.capacidadeMaxima = capacidadeMaxima; 
    }


    public List<Voluntario> getVoluntarios() {
        return new ArrayList<>(voluntarios);
    }

    // Métodos auxiliares
    public void adicionarVoluntario(Voluntario voluntario) {
        this.voluntarios.add(voluntario);
    }

    @Override
    public String toString() {
        return "Tarefa {" +
                "Título='" + titulo + '\'' +
                ", Descrição='" + descricao + '\'' +
                ", Local='" + local + '\'' +
                ", Data='" + data + '\'' +
                ", Voluntários=" + voluntarios.size() +
                '}';
    }
}
