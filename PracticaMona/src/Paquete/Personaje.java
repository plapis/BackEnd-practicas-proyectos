package Paquete;

public class Personaje {
        String nombre;
        String oficio;
        String disfraz;

        public void Mostrar(){
                System.out.println("Nombre: " + nombre);
                System.out.println("Oficio: " + oficio);
                System.out.println("Tiene disfraz: " + disfraz);
        }
}


class Dinosaurio extends Personaje{
        String maldad;

        public Dinosaurio() {
                nombre = "Octo Dinosaurio";
                oficio = "Destrozar cosas";
                disfraz = "Si";
                maldad = "101%";
        }

        public void MostrarDino(){
                Mostrar();
                System.out.println("Nivel de Maldad: " + maldad);
                System.out.println();
        }
}

class Libertad extends Personaje{
        String justicia;

        public Libertad() {
                nombre = "Octo Libertad";
                oficio = "Representar la libertad";
                disfraz = "Si";
                justicia = "Totalmente";
        }

        public void MostrarLibertad(){
                Mostrar();
                System.out.println("Nivel de justicia: " + justicia);
                System.out.println();
        }
}

class Princesa extends Personaje{
        String princesa;

        public Princesa() {
                nombre = "Octo Princesa";
                oficio = "Es una artista";
                disfraz = "Si";
                princesa = "Hasta los huesos";
        }

        public void MostrarPrincesa(){
                Mostrar();
                System.out.println("Nivel de culto: " + princesa);
                System.out.println();
        }
}

class Santa extends Personaje{
        String santa;

        public Santa() {
                nombre = "Octo Santa Clous";
                oficio = "Es un tipo que nos ilusiona tristemente";
                disfraz = "NO!";
                santa = "A Veces";
        }

        public void MostrarSanta(){
                Mostrar();
                System.out.println("Nivel de generosidad: " + santa);
                System.out.println();
        }
}

class Dj extends Personaje{
        String dj;

        public Dj() {
                nombre = "OctoDj";
                oficio = "Es una artista";
                disfraz = "No";
                dj = "Si, incluso cuando duerme";
        }

        public void MostrarDj(){
                Mostrar();
                System.out.println("Nivel de ritmo: " + dj);
                System.out.println();
        }
}

class HolaPeter extends Personaje{
        String holapeter;

        public HolaPeter() {
                nombre = "Octo Hola Peter";
                oficio = "Es un malvado";
                disfraz = "No, es un super poder!";
                holapeter = "102%";
        }

        public void MostrarHolaPeter(){
                Mostrar();
                System.out.println("Nivel de multiverso: " + holapeter);
                System.out.println();
        }
}