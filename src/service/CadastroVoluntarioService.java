package service;

import java.util.ArrayList;
import java.util.List;

import models.Voluntario;

public class CadastroVoluntarioService {

    private List<Voluntario> voluntarios;

    public CadastroVoluntarioService() {
        this.voluntarios = new ArrayList<>();
    }

    // Cadastrar um novo voluntário
    public void cadastrarVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
        System.out.println("✅ Voluntário cadastrado: " + voluntario.getNome());
    }

    // Listar todos os voluntários cadastrados
    public void listarVoluntarios() {
        System.out.println("\n📋 Lista de voluntários cadastrados:");
        for (Voluntario v : voluntarios) {
            System.out.println("- " + v.getNome() + " (" + v.getContato() + ")");
        }
    }

    // Buscar voluntário por email
    public Voluntario buscarPorEmail(String email) {
        for (Voluntario v : voluntarios) {
            if (v.getContato().equalsIgnoreCase(email)) {
                return v;
            }
        }
        return null;
    }

    // Retorna a lista de todos os voluntários (se precisar em outros services)
    public List<Voluntario> getVoluntarios() {
        return voluntarios;
    }
}
