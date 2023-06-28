package com.example.demo.services;

import com.example.demo.entities.Afazer;

import java.util.List;

public interface AfazerService {
    void salvarAfazer(Afazer afazer);
    void atualizarAfazer(Afazer afazer);
    void excluirAfazer(Afazer afazer);
    Afazer buscarAfazerPorId(int id);
    List<Afazer> buscarTodosAfazeres();
}
