package com.sergio.foodRecord.repositories;

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

    List<AlimentoEntity> findAllByIngestaAndFechaDeToma(String ingesta, LocalDate fechaToma);
}
