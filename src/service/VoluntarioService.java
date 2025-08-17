package service;

import java.util.ArrayList;
import java.util.List;

import models.Voluntario;

public class VoluntarioService {
    private List<Voluntario> voluntarios = new ArrayList<>();

    // Cadastrar voluntário
    public void cadastrarVoluntario(Voluntario voluntario) {
        voluntarios.add(voluntario);
        System.out.println("✅ Voluntário cadastrado: " + voluntario.getNome());
    }

    // Listar voluntários
    public List<Voluntario> listarVoluntarios() {
        return voluntarios;
    }
}
