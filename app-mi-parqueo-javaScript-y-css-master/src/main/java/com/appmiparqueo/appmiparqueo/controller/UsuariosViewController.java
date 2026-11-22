package com.appmiparqueo.appmiparqueo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.appmiparqueo.appmiparqueo.model.Usuarios;
import com.appmiparqueo.appmiparqueo.repository.UsuariosRepository;
import javax.validation.Valid;
import org.springframework.validation.BindingResult;

@Controller
@RequestMapping("/view/usuarios")
public class UsuariosViewController {

    @Autowired
    private UsuariosRepository usuariosRepository;

    @GetMapping("/list")
    public String listUsuarios(Model model) {
        model.addAttribute("usuarios", usuariosRepository.findAll());
        return "Usuarios/list";
    }

    @GetMapping("/form")
    public String formUsuario(Model model) {
        model.addAttribute("usuario", new Usuarios());
        return "Usuarios/form";
    }

    @PostMapping("/save")
    public String saveUsuario(@Valid @ModelAttribute("usuario") Usuarios usuario, BindingResult result, Model model) {
        if (result.hasErrors()) {
            return "Usuarios/form";
        }
        usuariosRepository.save(usuario);
        return "redirect:/view/usuarios/list";
    }

    @PostMapping("/delete/{id}")
    public String deleteUsuario(@PathVariable Long id) {
        usuariosRepository.deleteById(id);
        return "redirect:/view/usuarios/list";
    }

    @GetMapping("/update/{id}")
    public String updateUsuario(@PathVariable Long id, Model model) {
        Usuarios usuario = usuariosRepository.findById(id).orElse(null);
        if (usuario == null) {
            return "redirect:/view/usuarios/list";
        }
        model.addAttribute("usuario", usuario);
        return "Usuarios/form";
    }
}
