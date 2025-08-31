import java.util.Scanner;

public class Lectura {

    private static Scanner scanner = new Scanner(System.in);

    public static String leerString(String mensaje) {
        System.out.print(mensaje);
        return scanner.nextLine();
    }

    public static int leerInt(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                int valor = Integer.parseInt(scanner.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número entero.");
            }
        }
    }

    public static double leerDouble(String mensaje) {
        while (true) {
            try {
                System.out.print(mensaje);
                double valor = Double.parseDouble(scanner.nextLine());
                return valor;
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida. Por favor, ingrese un número decimal.");
            }
        }
    }

    public static void cerrarScanner() {
        scanner.close();
    }
}