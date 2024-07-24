package ejemplo16;
import java.util.Scanner;

public class Descuento {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Bienvenido a la tienda!");
            System.out.println("Por favor, seleccione el color de la bolita que sacó:");
            System.out.println("1. Roja");
            System.out.println("2. Verde");
            System.out.println("3. Blanca");
            System.out.print("Ingrese el número correspondiente al color: ");
            int opcion = scanner.nextInt();

            double descuento = 0.0;
            String mensaje = "";

            switch (opcion) {
                case 1:
                    descuento = 0.10; // 10% de descuento
                    mensaje = "Se le aplica un descuento del 10% sobre su compra.";
                    break;
                case 2:
                    descuento = 0.05; // 5% de descuento
                    mensaje = "Se le aplica un descuento del 5% sobre su compra.";
                    break;
                case 3:
                    mensaje = "No tiene descuento. Gracias por participar.";
                    break;
                default:
                    System.out.println("Opción no válida. Seleccione un número del 1 al 3.");
                    break;
            }

            if (opcion == 1 || opcion == 2) {
                // Aquí se calcula y muestra el descuento aplicado
                System.out.println(mensaje);
                // Aquí iría la lógica para aplicar el descuento en la compra
                // Como ejemplo, supongamos que el total de la compra es $100
                double totalCompra = 100.0;
                double totalConDescuento = totalCompra * (1 - descuento);
                System.out.printf("Total a pagar después del descuento: $%.2f\n", totalConDescuento);
            } else if (opcion == 3) {
                // Mensaje para la bolita blanca (sin descuento)
                System.out.println(mensaje);
            }

            scanner.close();
        }
    }

