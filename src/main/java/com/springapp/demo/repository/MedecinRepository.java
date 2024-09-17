package com.springapp.demo.repository;

import com.springapp.demo.entities.Medecin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    Medecin findByName(String name);
}
