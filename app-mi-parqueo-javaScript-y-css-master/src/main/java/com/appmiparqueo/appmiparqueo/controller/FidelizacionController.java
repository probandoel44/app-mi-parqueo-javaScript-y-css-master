package com.appmiparqueo.appmiparqueo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FidelizacionController {

    @GetMapping("/fidelizacion")
    public String showFidelizacion(Model model) {
        model.addAttribute("title", "Fidelización");
        model.addAttribute("description", "Gestiona los puntos, beneficios y promociones de los clientes frecuentes.");
        // TODO: Add data for loyalty program
        return "fidelizacion";
    }
}
