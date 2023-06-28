package com.example.demo.services;

import com.example.demo.entities.Usuario;

import java.util.List;

public interface UsuarioService {
    void salvarUsuario(Usuario usuario);
    void atualizarUsuario(Usuario usuario);
    void excluirUsuario(Usuario usuario);
    Usuario buscarUsuarioPorId(int id);
    List<Usuario> buscarTodosUsuarios();
}
