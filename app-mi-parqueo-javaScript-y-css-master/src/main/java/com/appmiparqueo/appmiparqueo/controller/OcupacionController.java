package com.appmiparqueo.appmiparqueo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class OcupacionController {

    @GetMapping("/ocupacion")
    public String showOcupacion(Model model) {
        model.addAttribute("title", "Estado de Ocupación");
        model.addAttribute("description", "Consulta en tiempo real la disponibilidad de cupos del parqueadero.");
        // TODO: Add data for parking occupancy
        return "ocupacion";
    }
}
