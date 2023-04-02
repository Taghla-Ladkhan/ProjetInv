package ma.enset.projetinv.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;
import java.util.Date;
import java.util.List;

@Table
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stage {
    //Attributs
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String titre;
    private String description;
    private String utite_d_accueil;
    private Date date_debut;
    private Date date_fin;
    private Collection<Livrable> livrables;
    private Collection<Projet> projets;
    private Etudiant etudiant;
    private Entreprise entreprise;
    private Annee_universitaire annee_univ;
    //Methodes

}