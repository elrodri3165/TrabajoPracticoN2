package Persistencia;
import java.util.logging.Level;
import java.util.logging.Logger;
import trabajopracticon2.Logica.Mascota;


public class ControladoraPersistencia {
    
    MascotaJpaController MascotaJPA = new MascotaJpaController();
    
    public void crearMascota (Mascota masc){
        
        try {
            MascotaJPA.create(masc);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
