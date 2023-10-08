import java.util.Random;
import java.util.Scanner;

public class Devinette {
    boolean trouver = false;
    int test;

    public void devinette() {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();
        int rand = random.nextInt(100);
        System.out.println(rand);
        while (!trouver) {


            System.out.println("Saisissez un nombre :");
            test = scanner.nextInt(); 

            if (test > rand) {
                System.out.println("C'est moins");
            } else if (test < rand) {
                System.out.println("C'est plus");
            } else {
                trouver = true;
                System.out.println("C'est trouvé ! Bravo ! Voici le nombre saisi : " + test + " et voici le nombre du rand " + rand);
            }
        }
    }

    public static void main(String[] args) {
        Devinette dev = new Devinette();
        dev.devinette();
    }
}
