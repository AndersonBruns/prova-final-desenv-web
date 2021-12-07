package com.ads.ProvaFinal.repository;

import com.ads.ProvaFinal.entity.TipoDespesa;
import com.ads.ProvaFinal.functions.TotalDespesa;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface TipoDespesaRepository extends JpaRepository<TipoDespesa, Long> {
    //Não consegui usar o JPQL para trazer as despesas.
    //@Query("SELECT tipo_despesa.nome, SUM(conta_pagar.valor) FROM tipo_despesa INNER JOIN conta_pagar ON conta_pagar.tipo_despesa_id = tipo_despesa.id GROUP BY tipo_despesa.nome")
    //List<TotalByDespesa> findTotalDespesa();
   
}
