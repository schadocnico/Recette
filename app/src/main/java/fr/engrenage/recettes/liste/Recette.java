package fr.engrenage.recettes.liste;

import java.util.List;

class Recette {
    private String nom, URI;
    private List<String> ingrediants;

    public Recette(String nom, String URI) {
        this.nom = nom;
        this.URI = URI;
    }

    public Recette(String nom, String URI, List<String> ingrediants) {
        this.nom = nom;
        this.URI = URI;
        this.ingrediants = ingrediants;
    }

    public String getNom() {
        return nom;
    }

    public List<String> getIngrediants() {
        return ingrediants;
    }

    public String getURI() {
        return URI;
    }
}
