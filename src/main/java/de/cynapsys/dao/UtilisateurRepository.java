package de.cynapsys.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import de.cynapsys.entities.Utilisateur;

public interface UtilisateurRepository extends JpaRepository<Utilisateur, Long>{

}
