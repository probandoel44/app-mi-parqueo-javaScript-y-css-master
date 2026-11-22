package com.appmiparqueo.appmiparqueo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/view")
public class LoginController {

    @GetMapping("/login")
    public String loginPage() {
        return "redirect:/login.html";
    }

    @GetMapping("/dashboard")
    public String dashboardPage() {
        return "redirect:/dashboard.html";
    }

    // Agregar redirección al dashboard desde el login
    @PostMapping("/login")
    public String handleLogin(@RequestParam String username, @RequestParam String password, RedirectAttributes redirectAttributes) {
        if ("admin".equals(username) && "password".equals(password)) {
            return "redirect:/view/dashboard"; // Redirige al dashboard si las credenciales son correctas
        }
        redirectAttributes.addFlashAttribute("error", "Credenciales inválidas");
        return "redirect:/view/login"; // Redirige de nuevo al login si las credenciales son incorrectas
    }
}
