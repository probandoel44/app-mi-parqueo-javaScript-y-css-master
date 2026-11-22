package com.appmiparqueo.appmiparqueo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AlertasController {

    @GetMapping("/alertas")
    public String showAlertas(Model model) {
        model.addAttribute("title", "Alertas");
        model.addAttribute("description", "Revisa las novedades y situaciones que requieren atención.");
        // TODO: Add data for alerts
        return "alertas";
    }
}
