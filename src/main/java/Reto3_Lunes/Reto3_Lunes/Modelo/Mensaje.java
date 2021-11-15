package Reto3_Lunes.Reto3_Lunes.Modelo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "message")
public class Mensaje implements Serializable{
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    private Integer idMessage;
    private String mesaggeText;

    @ManyToOne
    @JoinColumn(name ="id,year")
    @JsonIgnoreProperties("machine")
    private Gymmachine machine;
    
    @ManyToOne
    @JoinColumn(name ="id")
    @JsonIgnoreProperties("client")
    private Cliente client;

    public Integer getIdMessage() {
        return idMessage;
    }

    public void setIdMessage(Integer idMessage) {
        this.idMessage = idMessage;
    }

    public String getMesaggeText() {
        return mesaggeText;
    }

    public void setMesaggeText(String mesaggeText) {
        this.mesaggeText = mesaggeText;
    }

    public Gymmachine getMachine() {
        return machine;
    }

    public void setMachine(Gymmachine machine) {
        this.machine = machine;
    }

    
}
