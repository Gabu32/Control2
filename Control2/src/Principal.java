import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);

        LibroAcademico libroAcademico = new LibroAcademico();
        LibroLiteratura libroLiteratura = new LibroLiteratura();
        ProyectoTitulo proyectoTitulo = new ProyectoTitulo();

        //MENU

        int opcion;

        System.out.println("1. Agregar libro academico");
        System.out.println("2. Agregar libro literatura");
        System.out.println("3. Agregar proyecto de titulo");
        System.out.println("0. Cerrar programa");

        System.out.print("Elija su opcion: ");

        while(true){
            opcion = validarEntero();

            switch (opcion){
                case 1:
                    libroAcademico.agregarLibro();
                    break;

                case 2:
                    libroLiteratura.agregarLibro();
                    break;

                case 3:
                    proyectoTitulo.agregarProyectoTitulo();
                    break;

                case 0:
                    return;
            }
        }

    }

    public static int validarEntero(){
        boolean inputValid = false;
        int choice = -1;

        while (!inputValid) {
            try {
                choice = input.nextInt();
                System.out.println("\n");
                inputValid = true;
            } catch (InputMismatchException e) {
                System.out.println("Entrada no válida. Por favor, ingrese un número válido.");
                input.nextLine();
            }
        }
        return choice;
    }
}