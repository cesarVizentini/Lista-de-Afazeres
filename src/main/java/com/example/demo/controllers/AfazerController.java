package com.example.demo.controllers;

import com.example.demo.entities.Afazer;
import com.example.demo.entities.Usuario;
import com.example.demo.services.AfazerService;
import com.example.demo.services.repository.AfazerRepository;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class AfazerController {

    @Autowired
    private AfazerService afazerService;

    @Autowired
    private AfazerRepository afazerRepository;

    @GetMapping("/afazeres")
    public String listarAfazeres(Model model, HttpSession session) {
        Usuario usuarioLogado = (Usuario) session.getAttribute("usuarioLogado");
//        if (usuarioLogado == null) {
//            return "redirect:/login";
//        }
//
//        List<Afazer> afazeres = afazerRepository.findByUsuario(usuarioLogado);
//        model.addAttribute("afazeres", afazeres);
        return "afazeres";
    }

    @PostMapping("/afazeres")
    public String adicionarAfazer(@RequestParam("descricao") String descricao, HttpSession session) {
        Usuario usuarioLogado = (Usuario) session.getAttribute("usuarioLogado");
        if (usuarioLogado == null) {
            return "redirect:/login";
        }

//        Afazer afazer = new Afazer();
//        afazer.setDescricao(descricao);
//        afazer.setUsuario(usuarioLogado);
//        afazerRepository.save(afazer);
        return "redirect:/afazeres";
    }
}


