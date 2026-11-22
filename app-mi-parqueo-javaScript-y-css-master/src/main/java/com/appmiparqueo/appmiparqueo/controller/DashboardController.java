package com.appmiparqueo.appmiparqueo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DashboardController {

    @GetMapping("/dashboard")
    public String showDashboard(Model model) {
        model.addAttribute("title", "Dashboard");
        model.addAttribute("description", "Resumen general de la operación del parqueadero.");
        // TODO: Add metrics and data for the dashboard
        return "dashboard";
    }
}
