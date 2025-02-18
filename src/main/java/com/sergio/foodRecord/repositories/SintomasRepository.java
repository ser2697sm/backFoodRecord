package com.sergio.foodRecord.repositories;

import com.sergio.foodRecord.entities.SintomasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public interface SintomasRepository extends JpaRepository<SintomasEntity,Long> {

    @Query("SELECT s FROM SintomasEntity s WHERE s.fechaSintoma BETWEEN :inicio AND :fin")
    List<SintomasEntity> findByFechaSintoma(@Param("inicio") LocalDate inicio, @Param("fin") LocalDate fin);
}
