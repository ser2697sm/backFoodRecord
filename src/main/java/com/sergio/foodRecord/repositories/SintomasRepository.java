package com.sergio.foodRecord.repositories;

import com.sergio.foodRecord.entities.SintomasEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SintomasRepository extends JpaRepository<SintomasEntity,Long> {
}
