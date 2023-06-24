/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);
        List<Prestamo> lista = new ArrayList<>();
        int op;
        do {
            System.out.print("\nselecione una opcion:\n"
                    + "prestamo para un automovil ----[1]\n"
                    + "prestamo educativo ------------[2]\n"
                    + "salir -------------------------[0]\n");
            op = scanner.nextInt();

            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Ingrese el nombre del beneficiario: ");
                    String nombreBeneficiario = scanner.nextLine();
                    
                    System.out.print("Ingrese el apellido del beneficiario: ");
                    String apellidoBeneficiario = scanner.nextLine();
                    
                    System.out.print("Ingrese el usuario del beneficiario: ");
                    String usuarioBeneficiario = scanner.nextLine();
                    
                    System.out.print("Ingrese los meses del prestamo: ");
                    int tiempoPrestamo = scanner.nextInt();
                    
                    scanner.nextLine();
                    System.out.print("Ingrese la ciudad donde se realizara el"
                            + " prestamo: ");
                    String ciudadPrestamo = scanner.nextLine();
                    
                    System.out.print("Ingrese el tipo de auto: ");
                    String tipoAuto = scanner.nextLine();
                    
                    System.out.print("Ingrese la marca del auto: ");
                    String marcaAuto = scanner.nextLine();
                    
                    System.out.print("Ingrese el valor del auto: ");
                    double valorAuto = scanner.nextDouble();
                    
                    scanner.nextLine();
                    System.out.print("Ingrese el nombre del garante: ");
                    String nombreGarante = scanner.nextLine();
                    
                    System.out.print("Ingrese el apellido del garante: ");
                    String apellidoGarante = scanner.nextLine();
                    
                    System.out.print("Ingrese el usuario del garante: ");
                    String usuarioGarante = scanner.nextLine();

                    Persona datosBeneficiario
                            = new Persona(
                                    nombreBeneficiario,
                                    apellidoBeneficiario,
                                    usuarioBeneficiario);
                    Persona datosGarante = new Persona(nombreGarante,
                            apellidoGarante, usuarioGarante);

                    PrestamoAutomovil prestamoAutomovil
                            = new PrestamoAutomovil(tipoAuto,
                                    marcaAuto, datosGarante,
                                    valorAuto, valorAuto,
                                    datosBeneficiario,
                                    tiempoPrestamo,
                                    ciudadPrestamo);
                    prestamoAutomovil.calcularValorMensual();

                    lista.add(prestamoAutomovil);
                    break;
                case 2:
                    System.out.print("Ingrese el nombre del beneficiario: ");
                    nombreBeneficiario = scanner.nextLine();
                    
                    System.out.print("Ingrese el apellido del beneficiario: ");
                    apellidoBeneficiario = scanner.nextLine();
                    
                    System.out.print("Ingrese el usuario del beneficiario: ");
                    usuarioBeneficiario = scanner.nextLine();
                    
                    System.out.print("Ingrese los meses del prestamo: ");
                    tiempoPrestamo = scanner.nextInt();
                    
                    scanner.nextLine();
                    System.out.print("Ingrese la ciudad donde se realizara el"
                            + " prestamo: ");
                    ciudadPrestamo = scanner.nextLine();
                    
                    System.out.print("Ingrese el nivel de estudio: ");
                    String nivelEstudio = scanner.nextLine();
                    
                    System.out.print("Ingrese el valor de la carrera: ");
                    double valorCarrera = scanner.nextDouble();

                    Persona datosBeneficiario2
                            = new Persona(
                                    nombreBeneficiario,
                                    apellidoBeneficiario,
                                    usuarioBeneficiario);

                    PrestamoEducativo prestamoEducativo = new PrestamoEducativo(
                            nivelEstudio, valorCarrera,
                            datosBeneficiario2, tiempoPrestamo,
                            ciudadPrestamo);
                    prestamoEducativo.calcularValorMensual();

                    lista.add(prestamoEducativo);
                    break;
                case 0:
                    op = 0;
                    System.out.println("gracias por usar nuestro sistema,"
                            + " hasa luego :).");
                    break;
                default:
                    System.out.println("\nopcion fuera de rango, "
                            + "intene de nuevo.\n");
                    break;
            }
        } while (op != 0);

        for (Prestamo prestamo : lista) {
            System.out.println(prestamo);
        }
    }
}
