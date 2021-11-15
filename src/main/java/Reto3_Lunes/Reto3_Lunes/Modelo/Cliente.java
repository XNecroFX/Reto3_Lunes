package Reto3_Lunes.Reto3_Lunes.Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "client")
public class Cliente implements Serializable{
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    
    private Integer idClient;
    private String emailClient;
    private String passwordClient;
    private String nameClient;
    private Integer yearClient;

    public Integer getIdClient() {
        return idClient;
    }

    public void setIdClient(Integer idClient) {
        this.idClient = idClient;
    }

    public String getEmailClient() {
        return emailClient;
    }

    public void setEmailClient(String emailClient) {
        this.emailClient = emailClient;
    }

    public String getPasswordClient() {
        return passwordClient;
    }

    public void setPasswordClient(String passwordClient) {
        this.passwordClient = passwordClient;
    }

    public String getNameClient() {
        return nameClient;
    }

    public void setNameClient(String nameClient) {
        this.nameClient = nameClient;
    }

    public Integer getYearClient() {
        return yearClient;
    }

    public void setYearClient(Integer yearClient) {
        this.yearClient = yearClient;
    }
}   