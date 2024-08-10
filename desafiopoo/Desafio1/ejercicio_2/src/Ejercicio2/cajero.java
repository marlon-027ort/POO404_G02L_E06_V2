package Ejercicio2;
import java.awt.*;
import java.util.HashMap;
import java.util.Scanner;
public class cajero {
    public static HashMap<Integer, Double> cuentas = new HashMap<>();
    public static void main(String[] args) {
        //cuentas y saldos. con el metodo put que es clave y valor que va junto con el metodo HashMap
        cuentas.put(1000001, 400.);
        cuentas.put(1000002, 200.);
        cuentas.put(1000004, 500.);

        Scanner scanner = new Scanner(System.in);

// se utiliza try catch a partir de este bloque de codigo ya que se le muestra al usuario cuando no ha ingresado numeros correctos
        try{
            System.out.print("Porfavor Ingrese su Numero de Cuenta:");
            int numeroCuenta = scanner.nextInt();

            if (cuentas.containsKey(numeroCuenta)){
                System.out.println("Bienvenido Estimado cliente"+ numeroCuenta);
                while (true) {
                    mostrarMenu();
                    try {
                        System.out.print("Porfavor Seleccione una Opcion:");
                        int opcion = scanner.nextInt();

                        switch (opcion){
                            case 1:
                                consultaSaldo(numeroCuenta);
                                break;
                            case 2:
                                retiroFondos(numeroCuenta, scanner);
                                break;
                            case 3:
                                consignarFondos(numeroCuenta, scanner);
                                break;
                            case 4:
                                transferirFondos(numeroCuenta, scanner);
                                break;
                            case 5:
                                System.out.println("Gracias por usar nuestros servicios");
                                return;
                            default:
                                System.out.println("Opcion no valida, por favor vuelva a intentar");
                        }

                    } catch (Exception e) {
                        System.out.println("Error: ingrese su numero valido.");
                        scanner.next();
                    }
                }

            } else {
                System.out.println("Error: EL numero de cuenta ni existe.");
            }
        } catch (Exception e) {
            System.out.println("Error:por favor ingrese un numero de cuenta valido.");
        } finally {
            scanner.close();
        }
        }
        //En esta parte del codigo se establece la impresion del menu a mostrar
        private  static void mostrarMenu() {
        System.out.println("Menu");
        System.out.println("1.  Consulta de Saldo");
        System.out.println("2.  Retiro de Fondos");
        System.out.println("3.  consignaciones");
        System.out.println("4.  Transferencias");
        System.out.println("5.  Salir");
        }
        // En esta parte del codigo se procede a dar instrucciones e imprimir los mensajes correspondientes de cada opcion
        private static void consultaSaldo(int cuenta) {
        double saldo = cuentas.get(cuenta);
        System.out.println("El Saldo actual de la cuenta" + cuenta + " es de $" + saldo);
        }
        private static void retiroFondos(int cuenta, Scanner scanner) {
        try {
            System.out.println("Ingrese la cantidad que desea retirar: $");
            double cantidad = scanner.nextDouble();
            if (cantidad <= 0 ) {
                System.out.println("La Cantidad debe de ser mayo a cero.");
            } else if (cantidad > cuentas.get(cuenta)) {
                System.out.println("Fondos Insuficientes.");
            } else {
                cuentas.put(cuenta, cuentas.get(cuenta) - cantidad);
                consultaSaldo(cuenta);
            }
        } catch (Exception e) {
            System.out.println("Error: por favor ingrese el valor numerico");
            scanner.next();
        }
    }
    private static void consignarFondos(int cuenta, Scanner scanner) {
        try {
            System.out.print("Ingrese la cantidad que desea consignar: $");
            double cantidad = scanner.nextDouble();
            if (cantidad <= 0) {
                System.out.println("La Cantidad debe de ser mayor que cerp");
            } else {
                cuentas.put(cuenta, cuentas.get(cuenta) + cantidad);
                consultaSaldo(cuenta);
            }
        } catch (Exception e) {
            System.out.println("Error: porfavor ingrese un valor numerico valido");
            scanner.next();
        }
    }
    private static void transferirFondos(int cuentaOrigen, Scanner scanner) {
        try {
            System.out.print("Ingrese el numero de cuenta al que desea transferir: ");
            int cuentaDestino = scanner.nextInt();
            if (cuentas.containsKey(cuentaDestino)) {
                System.out.println("La Cuenta de Destino no existe.");
                return;
            }
            System.out.print("Ingrese la Cantidad que desea Transferir: $");
            double cantidad = scanner.nextDouble();
            if (cantidad <= 0) {
                System.out.println("la cantidad debe de ser mayor que cero.");
            } else if (cantidad > cuentas.get(cuentaOrigen)) {
                System.out.println("sus fondos son insuficientes. ");
            } else {
                cuentas.put(cuentaOrigen, cuentas.get(cuentaOrigen) - cantidad);
                cuentas.put(cuentaDestino, cuentas.get(cuentaDestino) + cantidad);
                consultaSaldo(cuentaOrigen);
            }
        } catch (Exception e) {
            System.out.println("error: por favor ingrese el valor numerico valido. ");
            scanner.next();
        }
    }
        }