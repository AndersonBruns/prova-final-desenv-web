package com.ads.ProvaFinal.controller;

import com.ads.ProvaFinal.entity.ContaPagar;
import com.ads.ProvaFinal.repository.ContaPagarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping("/pagar")
public class ContaPagarController {

    @Autowired
    private ContaPagarRepository repository;

    @PostMapping
    public ResponseEntity<ContaPagar> save(@RequestBody ContaPagar contaPagar) {
        ContaPagar cp = repository.save(contaPagar);
        return ResponseEntity.ok(cp);
    }

    @GetMapping
    public List<ContaPagar> findAll() {
        return repository.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ContaPagar> getById(@PathVariable("id") Long id) {
        Optional<ContaPagar> m = repository.findById(id);
        if (m.isPresent()) {
            return ResponseEntity.ok(m.get());
        }
        return ResponseEntity.badRequest().build();
    }
    
    //@Autowired
    //private TipoDespesaRepository tpRepository;

    //@GetMapping("/despesatotal")
    //public List<TotalByDespesa> getTotalDespesa() {
        //return tpRepository.findTotalDespesa();
    //}
}
