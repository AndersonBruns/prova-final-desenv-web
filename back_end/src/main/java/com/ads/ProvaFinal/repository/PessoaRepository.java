package com.ads.ProvaFinal.repository;

import com.ads.ProvaFinal.entity.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long> {
}
