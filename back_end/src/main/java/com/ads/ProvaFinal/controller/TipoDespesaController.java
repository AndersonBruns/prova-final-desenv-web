package com.ads.ProvaFinal.controller;

import com.ads.ProvaFinal.entity.TipoDespesa;
import com.ads.ProvaFinal.repository.TipoDespesaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/tipodespesa")
public class TipoDespesaController {
    @Autowired
    private TipoDespesaRepository repository;

    @PostMapping
    public ResponseEntity<TipoDespesa> save(@RequestBody TipoDespesa tipoDespesa) {
        TipoDespesa td = repository.save(tipoDespesa);
        return ResponseEntity.ok(td);
    }

    @GetMapping
    public List<TipoDespesa> findAll() {
        return repository.findAll();
    }
}
