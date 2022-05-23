package com.inti.SpringSpringBootValidationThymeleaf.Repository;

import com.inti.SpringSpringBootValidationThymeleaf.model.Utilisateur;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UtilisateurRepository extends JpaRepository<Utilisateur, Integer>
{
	
}
