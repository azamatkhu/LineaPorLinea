import java.io.*;
import java.util.*;

public class MainLineaPorLinea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contadorLineas = 0;

        System.out.println("Escribe el nombre de fichero: ");
        String fichero = sc.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(fichero))) {
            String linea;

            System.out.println("Escribe la palabra secreta: ");
            String palabraSecreta = sc.nextLine();

            while ((linea = reader.readLine()) != null) {
                List<String> palabras = Arrays.asList(linea.split(" "));

                for (String palabra : palabras) {
                    if (palabra.equals(palabraSecreta)) {
                        contadorLineas++;
                    }
                }
            }
            System.out.println("El numero de lineas de fichero que contienen palabra secreta: " + contadorLineas);
        } catch (IOException e) {
                System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
    }
}