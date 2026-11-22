package com.appmiparqueo.appmiparqueo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UbicacionVehiculosController {

    @GetMapping("/ubicacion-vehiculos")
    public String showUbicacionVehiculos(Model model) {
        model.addAttribute("title", "Ubicación de Vehículos");
        model.addAttribute("description", "Encuentra rápidamente la ubicación registrada de un vehículo.");
        // TODO: Add data for vehicle location
        return "ubicacion-vehiculos";
    }
}
