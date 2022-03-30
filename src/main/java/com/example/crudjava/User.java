package com.example.crudjava;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import BDD.Bdd;

public class User {
    private int idUser;
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private boolean estAdmin;
    private int code;


    public String Connexion(String email, String mdp) throws SQLException {
        Bdd connexion = new Bdd();
        PreparedStatement requete = connexion.getBdd().prepareStatement("SELECT * FROM `user` WHERE email=? AND mdp=?");
        requete.setString(1, email);
        requete.setString(2, mdp);
        ResultSet resultat = requete.executeQuery();
        return getMail();
    }


        public int inscription(String nom, String prenom, String email, String mdp) throws SQLException {
            Bdd inscription = new Bdd();
            PreparedStatement requete = inscription.getBdd().prepareStatement("INSERT INTO `user` (`nom`, `prenom`, `email`, `mdp`) VALUES ?,?;?,?");
            requete.setString(1, nom);
            requete.setString(2, prenom);
            requete.setString(3, email);
            requete.setString(4, mdp);
            requete.executeUpdate();
            return requete.executeUpdate();
        }

        public int modifier(String nom, String prenom, String email, String mdp) throws SQLException {
                Bdd Connexion = new Bdd();
                PreparedStatement requete = Connexion.getBdd().prepareStatement("UPDATE `user` (`nom`, `prenom`, `email`, `mdp`) VALUES (?,?,?,?)");
                requete.setString(1, nom);
                return requete.executeUpdate();
            }

            public int supprimer() throws SQLException {
                    Bdd connexion = new Bdd();
                    PreparedStatement requete = connexion.getBdd().prepareStatement("DELETE * FROM `user` WHERE idUser");
                    requete.setInt(1,idUser);
                    requete.executeUpdate();
                    return requete.executeUpdate();
            }

                public int getIdUser() {
                    return idUser;
                }
                public void setIdUser(int idUser) {
                    this.idUser = idUser;
                }
                public String getNom() {
                    return nom;
                }
                public void setNom(String nom) {
                    this.nom = nom;
                }
                public String getPrenom() {
                    return prenom;
                }
                public void setPrenom(String prenom) {
                    this.prenom = prenom;
                }
                public String getMail() {
                    return email;
                }
                public void setMail(String mail) {
                    this.email = mail;
                }
                public String getMdp() {
                    return mdp;
                }
                public void setMdp(String mdp) {
                    this.mdp = mdp;
                }
                public boolean isEstAdmin() {
                    return estAdmin;
                }
                public void setEstAdmin(boolean estAdmin) {
                    this.estAdmin = estAdmin;
                }
                public int getCode() {
                    return code;
                }
                public void setCode(int code) {
                    this.code = code;
                }
                @Override
                public String toString()
                {
                    return "User [id=" + idUser + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", mdp="
                            + mdp + ", estAdmin=" + estAdmin + ", code=" + code+"]";
                }
            }