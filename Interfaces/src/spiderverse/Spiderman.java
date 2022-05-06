package spiderverse;

public class Spiderman extends Personaje{

    void run(){
        Setter();
        Mensaje();
        SpidermanAtaque poderes = new SpidermanAtaque();
    }

    void Mensaje() {
        System.out.println("Hola! soy  " + nombre);
        System.out.println("sin duda yo soy " + especialidad);
        System.out.println("pertenezco al universo " + universo);
        System.out.println("y mi edad ronda los " + edad + " pero no se lo digas a nadie.");
        System.out.println();
        System.out.println();
    }

    void Setter(){
        this.nombre = "Spiderman";
        this.especialidad = "el spiderman original";
        this.universo = "616";
        this.edad = 18;
    }

}


class SpidermanAtaque implements Ataque{

    public void Ataques() {
        System.out.println("mi ataque principal es mi telarana");
        System.out.println("y no hay que olvidar mi espectacular fuerza. \n\n");
    }
}