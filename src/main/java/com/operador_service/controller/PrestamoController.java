package com.operador_service.controller;

import com.operador_service.entity.Prestamo;
import com.operador_service.entity.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {

    @Autowired
    private PrestamoRepository prestamoRepository;

    @PostMapping
    public Prestamo crearPrestamo(@RequestBody Prestamo prestamo) {
        prestamo.setFechaPrestamo(LocalDate.now());
        return prestamoRepository.save(prestamo);
    }
}

