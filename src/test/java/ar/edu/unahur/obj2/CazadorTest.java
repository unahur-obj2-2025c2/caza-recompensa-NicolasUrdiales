package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.entrenamientos.ArtesMarcialesAvanzadas;
import ar.edu.unahur.obj2.entrenamientos.EntrenamientoElite;
import ar.edu.unahur.obj2.entrenamientos.ProteccionLegal;
import ar.edu.unahur.obj2.profugos.IProfugo;
import ar.edu.unahur.obj2.profugos.Profugo;

public class CazadorTest {
    IProfugo profugoComun = new Profugo(20,50,Boolean.FALSE);
    IProfugo profugoConProteccionLegal = new ProteccionLegal(profugoComun);
    IProfugo profugoConProteccionLegalYArtesMarciales = new ArtesMarcialesAvanzadas(profugoConProteccionLegal);
    IProfugo profugoEntrenamientoCompleto = new EntrenamientoElite(profugoConProteccionLegalYArtesMarciales);

    @BeforeEach
    void setUp(){

    }


    @Test
    void testCazar() {
        assertTrue(Boolean.TRUE);
    }

    @Test
    void pruebaProfugo(){
        assertEquals(40, profugoConProteccionLegalYArtesMarciales.getInociencia());
        assertEquals(100, profugoConProteccionLegalYArtesMarciales.getHabilidad());
    }
    @Test
    void pruebaProfugo2(){
        assertEquals(40, profugoEntrenamientoCompleto.getInociencia());
        assertEquals(100, profugoEntrenamientoCompleto.getHabilidad());
        profugoEntrenamientoCompleto.volverseNervioso();
        assertFalse(profugoEntrenamientoCompleto.esNervioso());

    }
}
