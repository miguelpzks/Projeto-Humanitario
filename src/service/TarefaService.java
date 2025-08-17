package service;

import models.Tarefa;

import java.util.*;

public class TarefaService {
    private List<Tarefa> tarefas = new ArrayList<>();

    // Criar tarefa
    public void criarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("✅ Tarefa criada: " + tarefa.getTitulo());
    }

    // Listar tarefas
    public List<Tarefa> listarTarefas() {
        return tarefas;
    }
}
