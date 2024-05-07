import modelo.Pelicula;

import java.util.Scanner;

public class Principal {
    public void muestraElMenu() {
        int opcion = 0;
        Scanner teclado = new Scanner(System.in);

        while (opcion != 9) {
            String menu = """
                    Bienvenido(a) a ScreenMatch
                    1) Registrar nueva película.
                    2) Registrar nueva serie.
                    
                    9) Salir.
                    """;
            System.out.println(menu);
            opcion = teclado.nextInt();
            teclado.nextLine();

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el nombre de la película: ");
                    String nombre = teclado.nextLine();
                    System.out.println("Ingrese el año de lanzamiento: ");
                    int fechaDeLanzamiento = teclado.nextInt();
                    teclado.nextLine();
                    System.out.println("Ingrese la duración en minutos: ");
                    int duracionEnMinutos = teclado.nextInt();
                    teclado.nextLine();
                    Pelicula peliculaUsuario = new Pelicula();
                    peliculaUsuario.setNombre(nombre);
                    peliculaUsuario.setFechaDeLanzamiento(fechaDeLanzamiento);
                    peliculaUsuario.setTiempoDeDuracionEnMinutos(duracionEnMinutos);
                    peliculaUsuario.muestraFichaTecnica();
                    break;
                case 9:
                    System.out.println("Gracias por su visita!");
                    break;
                default:
                    System.out.println("Opción no válida!");
            }
        }
    }
}
