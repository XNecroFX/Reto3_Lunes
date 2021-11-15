package Reto3_Lunes.Reto3_Lunes.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reservation")
public class Reservacion implements Serializable{
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Integer idReservation;
    private Integer starDate;
    private String description;
    private Integer devolutionDate;
    private String status;

    
    @ManyToOne
    @JoinColumn(name ="id,year")
    @JsonIgnoreProperties("machine")
    private Gymmachine machine;
    
    @ManyToOne
    @JoinColumn(name ="idCliente,year")
    @JsonIgnoreProperties("client")
    private Cliente client;

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
        return status;
    }

    public void setState(String state) {
        this.status = state;
    }

    public Gymmachine getMachine() {
        return machine;
    }

    public void setMachine(Gymmachine machine) {
        this.machine = machine;
    }
    
    
      
}
