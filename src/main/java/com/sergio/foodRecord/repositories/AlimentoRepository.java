package com.sergio.foodRecord.repositories;

import com.sergio.foodRecord.dto.AlimentoDTO;
import com.sergio.foodRecord.entities.AlimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface AlimentoRepository extends JpaRepository<AlimentoEntity,Long> {
    /*@Query("Select alimentos from alimentos where ingesta = :ingesta")
    AlimentoEntity findAlimentoByIngesta(@Param("ingesta") String ingesta);
     */
    @Query("Select a from AlimentoEntity a where a.fechaDeToma BETWEEN :inicio AND :fin AND a.ingesta IN :ingesta")
    List<AlimentoDTO> findAllByFechaDeTomaBetween(@Param("inicio") LocalDate inicio,
                                                  @Param("fin") LocalDate fin,
                                                  @Param("ingesta") String ingesta);
}
