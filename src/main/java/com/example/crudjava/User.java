package com.example.crudjava;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import BDD.Bdd;

public class User {
    private int idUser;
    private String nom;
    private String prenom;
    private String mail;
    private String mdp;
    private boolean estAdmin;
    private int code;


    public String Connexion(String mail, String mdp) throws SQLException {
        Bdd connexion = new Bdd();
        PreparedStatement requete = connexion.getBdd().prepareStatement("SELECT * FROM `user` WHERE mail=? AND mdp=?");
        requete.setString(1, mail);
        requete.setString(2, mdp);
        ResultSet resultat = requete.executeQuery();
        return getMail();
    }


        public int inscription(String nom, String prenom, String mail, String mdp) throws SQLException {
            Bdd inscription = new Bdd();
            PreparedStatement requete = inscription.getBdd().prepareStatement("INSERT INTO `user` (`nom`, `prenom`, `mail`, `mdp`) VALUES ?,?;?,?");
            requete.setString(1, nom);
            requete.setString(2, prenom);
            requete.setString(3, mail);
            requete.setString(4, mdp);
            requete.executeUpdate();
            return requete.executeUpdate();
        }

        public int modifier(String nom, String prenom, String mail, String mdp) throws SQLException {
                Bdd Connexion = new Bdd();
                PreparedStatement requete = Connexion.getBdd().prepareStatement("UPDATE `user` (`nom`, `prenom`, `mail`, `mdp`) VALUES (?,?,?,?)");
                requete.setString(1, nom);
                return requete.executeUpdate();
            }

            public int supprimer(String mail, String mdp) throws SQLException {
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
                    return mail;
                }
                public void setMail(String mail) {
                    this.mail = mail;
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
                    return "User [id=" + idUser + ", nom=" + nom + ", prenom=" + prenom + ", mail=" + mail + ", mdp="
                            + mdp + ", estAdmin=" + estAdmin + ", code=" + code+"]";
                }
            }