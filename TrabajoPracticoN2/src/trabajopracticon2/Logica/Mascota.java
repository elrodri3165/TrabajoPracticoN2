package trabajopracticon2.Logica;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Rodrigo Gallo
 */
@Entity
public class Mascota implements Serializable {
    
    @Id
    private int num_cliente;
    @Basic
    private String nombre_perro;
    private String raza;
    private String Color;
    private String alergico;
    private String atencion_especial;
    private String nombre_duenio;
    private String celular_duenio;
    private String observaciones;

    public Mascota(int num_cliente, String nombre_perro, String raza, String Color, String alergico, String atencion_especial, String nombre_duenio, String celular_duenio, String observaciones) {
        this.num_cliente = num_cliente;
        this.nombre_perro = nombre_perro;
        this.raza = raza;
        this.Color = Color;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.nombre_duenio = nombre_duenio;
        this.celular_duenio = celular_duenio;
        this.observaciones = observaciones;
    }

    public int getNum_cliente() {
        return num_cliente;
    }

    public String getNombre_perro() {
        return nombre_perro;
    }

    public String getRaza() {
        return raza;
    }

    public String getColor() {
        return Color;
    }

    public String getAlergico() {
        return alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public String getNombre_duenio() {
        return nombre_duenio;
    }

    public String getCelular_duenio() {
        return celular_duenio;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setNum_cliente(int num_cliente) {
        this.num_cliente = num_cliente;
    }

    public void setNombre_perro(String nombre_perro) {
        this.nombre_perro = nombre_perro;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public void setNombre_duenio(String nombre_duenio) {
        this.nombre_duenio = nombre_duenio;
    }

    public void setCelular_duenio(String celular_duenio) {
        this.celular_duenio = celular_duenio;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    

    
}
