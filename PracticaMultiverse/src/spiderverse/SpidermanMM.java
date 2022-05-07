package spiderverse;

public class SpidermanMM extends Personaje{
    void run(){
        Setter();
        Mensaje();
        SpidermanMMAtaque poderes = new SpidermanMMAtaque();
    }

    void Mensaje() {
        System.out.println("Hola! soy  " + nombre);
        System.out.println("sin duda yo soy " + especialidad);
        System.out.println("pertenezco al universo " + universo);
        System.out.println("y mi edad ronda los " + edad + " creo que soy uno de los spiders mas pequenos.");
        System.out.println();
        System.out.println();
    }

    void Setter(){
        this.nombre = "el Spiderman de Miles Morales";
        this.especialidad = "un spiderman diferente, pero divertido";
        this.universo = "1610";
        this.edad = 13;
    }

}


class SpidermanMMAtaque implements Ataque{

    public void Ataques() {
        System.out.println("mi ataque principal es mi electricidad");
        System.out.println("y ademas tengo la habilidad de camuflajearme.");
    }
}
