package com.ads.ProvaFinal.controller;


import com.ads.ProvaFinal.entity.Pessoa;
import com.ads.ProvaFinal.repository.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pessoa")
public class PessoaController {

    @Autowired
    private PessoaRepository repository;

    @PostMapping
    public ResponseEntity<Pessoa> save(@RequestBody Pessoa pessoa) {
        Pessoa p = repository.save(pessoa);
        return ResponseEntity.ok(p);
    }

    @GetMapping
    public List<Pessoa> findAll() {
        return repository.findAll();
    }
}
