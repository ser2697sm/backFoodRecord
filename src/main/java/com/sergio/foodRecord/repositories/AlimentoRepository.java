package com.sergio.foodRecord.repositories;

import com.sergio.foodRecord.entities.AlimentoEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlimentoRepository extends JpaRepository<AlimentoEntity,Long> {
}
