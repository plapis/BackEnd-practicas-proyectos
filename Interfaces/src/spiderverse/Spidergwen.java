package spiderverse;

public class Spidergwen extends Personaje{

    void run(){
        Setter();
        Mensaje();
        SpidergwenAtaque poderes = new SpidergwenAtaque();
    }

    void Mensaje() {
        System.out.println("Hola! soy  " + nombre);
        System.out.println("sin duda yo soy " + especialidad);
        System.out.println("pertenezco al universo " + universo);
        System.out.println("y mi edad ronda los " + edad + " pero abra consecuencias si les dices a alguien.");
        System.out.println();
        System.out.println();
    }

    void Setter(){
        this.nombre = "Spider-Gwen";
        this.especialidad = "la novia de spiderman, ademas de su mejor amiga";
        this.universo = "65";
        this.edad = 18;
    }

}


class SpidergwenAtaque implements Ataque{

    public void Ataques() {
        System.out.println("mi fortaleza mas grande es mi agilidad");
        System.out.println("y ademas que cuento con una gran inteligencia.");
    }
}