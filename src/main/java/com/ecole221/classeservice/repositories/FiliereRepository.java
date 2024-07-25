package com.ecole221.classeservice.repositories;

import com.ecole221.classeservice.models.Classe;
import com.ecole221.classeservice.models.Filiere;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FiliereRepository extends JpaRepository <Filiere,Long> {
}
