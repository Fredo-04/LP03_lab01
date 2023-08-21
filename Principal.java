import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int vida, rp;
        boolean fl = false;
        vida = 0;
        Scanner sc = new Scanner(System.in);
        do{
            vida ++;
            System.out.println("Vida: " + vida + "\t¿Cuál es el número secreto? ");
            rp = sc.nextInt();
            if (rp == 1234)
                fl = true;
        }while(vida < 2 && !fl);
        if (fl == true)
            System.out.println("ganaste un viaje a Cancún!!... ");
        else
            System.out.println("ups, perdiste... ");
    }
}
