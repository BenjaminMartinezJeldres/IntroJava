
/*
-Ciclos en java
-Definicion de FOR, While, DO-WHILE y el uso de TRY-catch
 */

public class Ciclos {

    public static void main(String[] args) {
        for (int i = 0; i < 300; i++) {
            System.out.println(i);
        }
        System.out.println("Finaluza FOR");
        try { // traduccion literal:. lo que hace es aquellos emtodos que presentas
              // excepciones, las ejecuta y si ocurre algun problema
            Thread.sleep(3000);// Pausa la ejecucion, recibe como parametro un int que representa el tiempo en
                               // milisegundos.
        } catch (Exception e) { // catch recibe las excepciones, en este caso, se definio" excepciones
                                // e",tambien existe "IOException e"
            System.exit(1);// Finaliza el programa.
        }

        int i = 0;
        while (i < 300) { // hara lo mismo que el for
            System.out.println(i);
            i++;
        }
        System.out.println("Finaliza WHILE");
        try {
            Thread.sleep(3000);
        } catch (Exception e) {
            System.exit(1);
        }
        i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 300);
        System.out.println("Finaliza DO-WHILE");
    }

}
