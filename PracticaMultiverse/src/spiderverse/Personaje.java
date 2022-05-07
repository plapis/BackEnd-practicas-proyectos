package spiderverse;

public abstract class Personaje {
    String nombre;
    String universo;
    String especialidad;
    int edad;

    abstract void Mensaje();
    abstract void Setter();
}

interface Ataque{
    public void Ataques();
}
