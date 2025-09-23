package ar.edu.unahur.obj2.profugos;

public interface IProfugo {
    Integer getInociencia();

    Integer getHabilidad();

    Boolean esNervioso();

    void volverseNervioso();

    void dejarDeEstarNervioso();

    void reducirHabilidad(Integer valor);

    void disminuirInociencia(Integer valor);
}
