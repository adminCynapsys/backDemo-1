package de.cynapsys.metier;

import java.util.List;

import de.cynapsys.entities.Utilisateur;

public interface UtilisateurMetier {
 public Utilisateur saveUtilisateur(Utilisateur u);
 public List<Utilisateur> getAllUtilisateur();
}
