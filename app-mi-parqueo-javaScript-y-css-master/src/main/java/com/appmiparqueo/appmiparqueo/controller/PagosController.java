package com.appmiparqueo.appmiparqueo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class PagosController {

    @GetMapping("/pagos")
    public String showPagos(Model model) {
        model.addAttribute("title", "Pagos");
        model.addAttribute("description", "Gestiona los pagos, recaudos y transacciones de los vehículos.");
        // TODO: Add data for payments
        return "pagos";
    }
}
