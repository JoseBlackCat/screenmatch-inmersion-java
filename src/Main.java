import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenidos a la inmersión en Java");
        // System.out.println("Película Matrix");

//        DECLARACION DE VARIABLES

        int fechaDeLanzamiento = 1999;
        double evaluacion = 4.5;
        boolean incluidoEnELPlanBasico = true;
        String nombreDePelicula = "Matrix";
        String sinopsis = """
                La mejor película del fin del milenio
                """;
        double mediaEvaluacionesUsuario = 0;

        System.out.println("Película: " + nombreDePelicula);
        System.out.println("Fecha de lanzamiento: " + fechaDeLanzamiento);
        System.out.println("Evaluación: " + evaluacion);
        System.out.println("Habilitado: " + incluidoEnELPlanBasico);

        double mediaEvaluacion = (4.5 + 4.8 + 3) / 3;
        System.out.println("Media de la evaluación de " + nombreDePelicula + ": " + mediaEvaluacion);

        if (fechaDeLanzamiento > 2023) {
            System.out.println("La más reciente");
        } else {
            System.out.println("Antigua pero digna de ver");
        }

        for (int i = 0; i < 3; i++) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Ingresa tu calificación a la película: ");
            double calificacionPelicula = teclado.nextDouble();
            mediaEvaluacionesUsuario = mediaEvaluacionesUsuario + calificacionPelicula;
        }

        System.out.println("Media de la película " + nombreDePelicula + " es " + mediaEvaluacionesUsuario / 3);
    }
}