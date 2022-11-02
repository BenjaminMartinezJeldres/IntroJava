
/* Programacion en java
*Como crear una clase, crear constructores, el concepto de polimorfismo.
 */

public class CrearClase {// Definicion de la clase principal, debe ser en un mismo nombre que el archivo
    public static void main(String[] args) {// Definicion de metodo principal "main"
        System.out.println("Hola mundo");// Forma de imprimir por pantalla
        HolaMundo[] clase = new HolaMundo[3]; // Se crea un arreglo de clase "HolaMundo",pero aun no esta instanciado
        clase[0] = new HolaMundo();// se crea un objeto de la clase HolaMundo con el constructor predeterminado
        clase[1] = new HolaMundo(true);// Se crea un objeto de la clase HolaMundo con el segundo constructor
        clase[2] = new HolaMundo(false);

        for (int i = 0; i < 3; i++) {
            System.out.println("Posicion" + (i + 1) + ":" + clase[i].toString());// Notar el (i+1), en este caso es
                                                                                 // importante las p ya que si no se
                                                                                 // colocan el signo"+" operara como
                                                                                 // String en ves de operar como suma

        }
    }
}

class HolaMundo {// Definicion de otra clase, notar que no es la principal, por lo que no lleva
                 // "public"
    String mensaje;

    HolaMundo() {// Constructor de la clase"HolaMundo" se sera llamada en otra clase por el
                 // operador "new"
        mensaje = "";
    }

    HolaMundo(boolean opcion) {
        if (opcion == true) {
            mensaje = "Hola verdadero mundo";
        } else {
            mensaje = "Hola falso mundo";
        }
    }

    public String toString() {// Metodo que retorna el contenido de mensaje
        return mensaje;
    }
}