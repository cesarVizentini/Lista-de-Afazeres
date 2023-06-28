package com.example.demo.controllers;


import com.example.demo.entities.Usuario;
import com.example.demo.services.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @GetMapping("/login")
    public String exibirFormularioLogin(Usuario usuario) {
        return "login";
    }

    @PostMapping("/signup")
    public String realizarLogin(Usuario usuario, BindingResult result, Model model) {
//        if (result.hasErrors()) {
//            return "add-user";
//        }

        usuarioService.salvarUsuario(usuario);
        return "redirect:/index";
    }
}

