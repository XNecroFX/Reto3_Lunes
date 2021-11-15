package Reto3_Lunes.Reto3_Lunes.Modelo;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "message")
public class Mensaje implements Serializable{
    @Id
    @GeneratedValue (strategy =GenerationType.IDENTITY)
    
    private Integer idMessage;
    private String mesaggeText;

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
}
