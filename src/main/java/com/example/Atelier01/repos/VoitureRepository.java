package com.example.Atelier01.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Atelier01.entities.Voiture;

public interface VoitureRepository extends JpaRepository<Voiture, Long> {

}
