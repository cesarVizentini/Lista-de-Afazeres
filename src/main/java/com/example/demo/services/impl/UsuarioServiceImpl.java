package com.example.demo.services.impl;

import com.example.demo.services.UsuarioService;
import com.example.demo.entities.Usuario;
import com.example.demo.services.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public void salvarUsuario(Usuario usuario) {
        // Realiza validações e lógica de negócio, se necessário
        usuarioRepository.salvar(usuario);
    }

    @Override
    public void atualizarUsuario(Usuario usuario) {
        // Realiza validações e lógica de negócio, se necessário
        usuarioRepository.atualizar(usuario);
    }

    @Override
    public void excluirUsuario(Usuario usuario) {
        // Realiza validações e lógica de negócio, se necessário
        usuarioRepository.excluir(usuario);
    }

    @Override
    public Usuario buscarUsuarioPorId(int id) {
        return usuarioRepository.buscarPorId(id);
    }

    @Override
    public List<Usuario> buscarTodosUsuarios() {
        return usuarioRepository.buscarTodos();
    }
}

