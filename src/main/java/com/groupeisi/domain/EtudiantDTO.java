package com.groupeisi.domain;

public class EtudiantDTO {

    private Long id;
    private String firstName;
    private String lastName;

    // Constructeur par défaut
    public EtudiantDTO() {
    }

    // Constructeur avec paramètres
    public EtudiantDTO(Long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters et setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Méthode toString pour l'affichage des informations de l'étudiant
    @Override
    public String toString() {
        return "EtudiantDTO{" +
            "id=" + id +
            ", firstName='" + firstName + '\'' +
            ", lastName='" + lastName + '\'' +
            '}';
    }
}
