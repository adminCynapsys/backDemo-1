package de.cynapsys.metier;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import de.cynapsys.dao.UtilisateurRepository;
import de.cynapsys.entities.Utilisateur;
@Service
public class UtilisateurMetierImpl implements UtilisateurMetier {

	@Autowired
	private UtilisateurRepository utilisateurRep;
	@Override
	public Utilisateur saveUtilisateur(Utilisateur u) {
		
		return utilisateurRep.saveAndFlush(u);
	}

	@Override
	public List<Utilisateur> getAllUtilisateur() {
		
		return utilisateurRep.findAll();
	}

}
