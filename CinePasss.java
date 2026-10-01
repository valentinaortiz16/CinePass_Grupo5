
import java.util.Scanner;

public class CinePass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int id, edad, sala, dia;
        double precio, total, recaudo = 0, menor = 0;
        int imax = 0;
        boolean primero = true;

        System.out.print("ID del boleto (0 para salir): ");
        id = sc.nextInt();

        while (id != 0) {

            System.out.print("Edad: ");
            edad = sc.nextInt();

            while (edad < 1 || edad > 110) {
                System.out.print("Edad inválida. Ingrese una edad entre 1 y 110: ");
                edad = sc.nextInt();
            }

            System.out.print("Sala (1-Normal $5, 2-3D $7, 3-IMAX $10): ");
            sala = sc.nextInt();

            while (sala < 1 || sala > 3) {
                System.out.print("Sala inválida. Ingrese 1, 2 o 3: ");
                sala = sc.nextInt();
            }

            switch (sala) {
                case 1 -> precio = 5;
                case 2 -> precio = 7;
                case 3 -> {
                    precio = 10;
                    imax++;
                }
                default -> precio = 0;
            }

            System.out.print("Día (1-7, miércoles=3): ");
            dia = sc.nextInt();

            while (dia < 1 || dia > 7) {
                System.out.print("Día inválido. Ingrese un valor entre 1 y 7: ");
                dia = sc.nextInt();
            }

            double descuento = 0;

            if (edad < 12 || edad >= 65) {
                descuento += 0.20;
            }

            if (dia == 3) {
                descuento += 0.10;
            }

            total = precio * (1 - descuento);
            recaudo += total;

            if (primero || total < menor) {
                menor = total;
                primero = false;
            }

            System.out.printf("Total: $%.2f%n", total);

            System.out.print("ID del siguiente boleto (0 para salir): ");
            id = sc.nextInt();
        }

        System.out.printf("%nRecaudo: $%.2f%n", recaudo);
        System.out.println("Boletos IMAX: " + imax);
        System.out.printf("Boleto de menor valor: $%.2f%n", menor);

        sc.close();
    }
}
