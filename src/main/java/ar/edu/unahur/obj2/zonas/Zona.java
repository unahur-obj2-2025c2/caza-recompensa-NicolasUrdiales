package ar.edu.unahur.obj2.zonas;
import ar.edu.unahur.obj2.profugos.IProfugo;
import java.util.ArrayList;
import java.util.List;

public class Zona {
    private final List<IProfugo> profugos = new ArrayList<>();

    public List<IProfugo> getProfugos() {
        return profugos;
    }
}
