package com.appmiparqueo.appmiparqueo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/main")
public class MainController {

    @GetMapping
    public String redirectToLogin() {
        return "redirect:/view/login"; // Redirige al login al acceder a la raíz
    }

    @PostMapping("/login")
    public String handleLogin(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes) {
        // Aquí puedes agregar lógica de autenticación
        if ("admin".equals(username) && "password".equals(password)) {
            return "redirect:/view/dashboard"; // Redirige al dashboard si las credenciales son correctas
        }
        redirectAttributes.addFlashAttribute("error", "Credenciales inválidas");
        return "redirect:/view/login"; // Redirige de nuevo al login si las credenciales son incorrectas
    }
}
