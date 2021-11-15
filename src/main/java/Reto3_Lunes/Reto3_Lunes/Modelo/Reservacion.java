package Reto3_Lunes.Reto3_Lunes.Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "reservacion")
public class Reservacion implements Serializable{
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Integer idReservation;
    private Integer starDate;
    private String description;
    private Integer devolutionDate;
    private String state;

    public Integer getIdReservation() {
        return idReservation;
    }

    public void setIdReservation(Integer idReservation) {
        this.idReservation = idReservation;
    }

    public Integer getStarDate() {
        return starDate;
    }

    public void setStarDate(Integer starDate) {
        this.starDate = starDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getDevolutionDate() {
        return devolutionDate;
    }

    public void setDevolutionDate(Integer devolutionDate) {
        this.devolutionDate = devolutionDate;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }  
}
