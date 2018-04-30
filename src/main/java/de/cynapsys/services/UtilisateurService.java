package de.cynapsys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import de.cynapsys.entities.Utilisateur;
import de.cynapsys.metier.UtilisateurMetier;
@RestController
public class UtilisateurService {

	@Autowired
	private UtilisateurMetier utilisateurMetier;
	
	@RequestMapping(value="/utilisateurs",method=RequestMethod.GET)
	public List<Utilisateur> listUtilisateur(){
		return utilisateurMetier.getAllUtilisateur();
	}
}
