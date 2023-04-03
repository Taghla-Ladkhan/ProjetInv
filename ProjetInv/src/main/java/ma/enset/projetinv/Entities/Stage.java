package ma.enset.projetinv.Entities;

import jakarta.persistence.*;
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
    @OneToMany(mappedBy = "stage")
    private Collection<Livrable> livrables;
    @OneToMany(mappedBy = "stage")
    private Collection<Projet> projets;
    @OneToOne
    private Etudiant etudiant;
    @OneToOne
    private Entreprise entreprise;
    @OneToOne
    private Annee_universitaire annee_univ;
    //Methodes
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitre() {
        return titre;
    }
    public void setTitre(String titre) {
        this.titre = titre;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getUtite_d_accueil() {
        return utite_d_accueil;
    }
    public void setUtite_d_accueil(String utite_d_accueil) {
        this.utite_d_accueil = utite_d_accueil;
    }
    public Date getDate_debut() {
        return date_debut;
    }
    public void setDate_debut(Date date_debut) {
        this.date_debut = date_debut;
    }
    public Date getDate_fin() {
        return date_fin;
    }
    public void setDate_fin(Date date_fin) {
        this.date_fin = date_fin;
    }
    public Collection<Livrable> getLivrables() {
        return livrables;
    }
    public void setLivrables(Collection<Livrable> livrables) {
        this.livrables = livrables;
    }
    public Collection<Projet> getProjets() {
        return projets;
    }
    public void setProjets(Collection<Projet> projets) {
        this.projets = projets;
    }
    public Etudiant getEtudiant() {
        return etudiant;
    }
    public void setEtudiant(Etudiant etudiant) {
        this.etudiant = etudiant;
    }
    public Entreprise getEntreprise() {
        return entreprise;
    }
    public void setEntreprise(Entreprise entreprise) {
        this.entreprise = entreprise;
    }
    public Annee_universitaire getAnnee_univ() {
        return annee_univ;
    }
    public void setAnnee_univ(Annee_universitaire annee_univ) {
        this.annee_univ = annee_univ;
    }
}