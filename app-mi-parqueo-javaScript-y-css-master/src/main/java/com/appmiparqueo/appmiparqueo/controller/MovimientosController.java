package com.appmiparqueo.appmiparqueo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MovimientosController {

    @GetMapping("/movimientos")
    public String showMovimientos(Model model) {
        model.addAttribute("title", "Movimientos Recientes");
        model.addAttribute("description", "Consulta el historial de ingresos, salidas, reservas y actividades del parqueadero.");
        // TODO: Add data for recent movements
        return "movimientos";
    }
}
