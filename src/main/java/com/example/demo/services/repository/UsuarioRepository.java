package com.example.demo.services.repository;

import com.example.demo.entities.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void salvar(Usuario usuario) {
        String query = "INSERT INTO usuario (nome, email, senha) VALUES (?, ?, ?)";
        jdbcTemplate.update(query, usuario.getNome(), usuario.getEmail(), usuario.getSenha());
    }

    public void atualizar(Usuario usuario) {
        String query = "UPDATE usuario SET nome = ?, email = ?, senha = ? WHERE id = ?";
        jdbcTemplate.update(query, usuario.getNome(), usuario.getEmail(), usuario.getSenha(), usuario.getId());
    }

    public void excluir(Usuario usuario) {
        String query = "DELETE FROM usuario WHERE id = ?";
        jdbcTemplate.update(query, usuario.getId());
    }

    public Usuario buscarPorId(int id) {
        String query = "SELECT * FROM usuario WHERE id = ?";
        return jdbcTemplate.queryForObject(query, new Object[]{id}, new UsuarioRowMapper());
    }

    public List<Usuario> buscarTodos() {
        String query = "SELECT * FROM usuario";
        return jdbcTemplate.query(query, new UsuarioRowMapper());
    }
}
