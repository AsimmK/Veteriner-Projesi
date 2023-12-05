package com.veterinerprojesi.app.repositeries;


import com.veterinerprojesi.app.enteties.Hayvan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IHayvanRepo extends JpaRepository<Hayvan, Integer> {
}