
public class Cronometro {
    public static void main(String[] args) {
        int hor = 0;
        int min = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++)
                System.out.println();
            System.out.println("Cronometro...");
            if (hor < 10)
                System.out.println("0" + hor + ":");
            else
                System.out.println(hor + ":");
            if (min < 10)
                System.out.println("0" + min + ":");
            else
                System.out.println(min + ":");
            if (i < 10)
                System.out.println("0" + i);
            else
                System.out.println(i);
            if (i == 59) {
                min++;
                i = -1;
                if (min == 60) {
                    hor++;
                    min = 0;
                }
            }
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            ;
        }
    }
}