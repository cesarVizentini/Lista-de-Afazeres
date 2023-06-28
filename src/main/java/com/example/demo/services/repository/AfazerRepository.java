package com.example.demo.services.repository;

import com.example.demo.entities.Afazer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AfazerRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void salvar(Afazer afazer) {
        String query = "INSERT INTO afazer (descricao, concluido) VALUES (?, ?)";
        jdbcTemplate.update(query, afazer.getDescricao(), afazer.isConcluido());
    }

    public void atualizar(Afazer afazer) {
        String query = "UPDATE afazer SET descricao = ?, concluido = ? WHERE id = ?";
        jdbcTemplate.update(query, afazer.getDescricao(), afazer.isConcluido(), afazer.getId());
    }

    public void excluir(Afazer afazer) {
        String query = "DELETE FROM afazer WHERE id = ?";
        jdbcTemplate.update(query, afazer.getId());
    }

    public Afazer buscarPorId(int id) {
        String query = "SELECT * FROM afazer WHERE id = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{id}, new AfazerRowMapper());
    }

    public List<Afazer> buscarTodos() {
        String query = "SELECT * FROM afazer";
        return jdbcTemplate.query(query, new AfazerRowMapper());
    }
}

