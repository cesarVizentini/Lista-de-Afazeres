package com.example.demo.services.impl;

import com.example.demo.entities.Afazer;
import com.example.demo.services.AfazerService;
import com.example.demo.services.repository.AfazerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AfazerServiceImpl implements AfazerService {

    @Autowired
    private AfazerRepository afazerRepository;

    public void salvarAfazer(Afazer afazer) {
        // Realiza validações e lógica de negócio, se necessário
        afazerRepository.salvar(afazer);
    }

    public void atualizarAfazer(Afazer afazer) {
        // Realiza validações e lógica de negócio, se necessário
        afazerRepository.atualizar(afazer);
    }

    public void excluirAfazer(Afazer afazer) {
        // Realiza validações e lógica de negócio, se necessário
        afazerRepository.excluir(afazer);
    }

    public Afazer buscarAfazerPorId(int id) {
        return afazerRepository.buscarPorId(id);
    }

    public List<Afazer> buscarTodosAfazeres() {
        return afazerRepository.buscarTodos();
    }
}

