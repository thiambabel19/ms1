package com.groupeisi.Service;

import com.groupeisi.domain.EtudiantDTO;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EtudiantService {

    // Ceci est juste un exemple pour simuler des données en l'absence de base de données
    private List<EtudiantDTO> etudiants = new ArrayList<>();

    public EtudiantService() {
        // Ajouter quelques étudiants de démonstration
        etudiants.add(new EtudiantDTO(1L, "John", "Doe"));
        etudiants.add(new EtudiantDTO(2L, "Jane", "Doe"));
    }

    public List<EtudiantDTO> findAll() {
        // Ici, vous récupéreriez normalement les étudiants depuis une base de données ou un autre service
        return etudiants;
    }

    // D'autres méthodes pour la gestion des étudiants pourraient être ajoutées ici
}
