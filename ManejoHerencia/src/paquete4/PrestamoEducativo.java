/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo {

    private String nivelEstudio;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(String nivelEs, double valorCa,
            Persona benefi, int tiempoPre, String ciudadPre) {
        super(benefi, tiempoPre, ciudadPre);
        nivelEstudio = nivelEs;
        valorCarrera = valorCa;

    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public void establecerNivelEstudio(String x) {
        nivelEstudio = x;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public void establecerValorCarrera(double x) {
        valorCarrera = x;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    public void calcularValorMensual() {
        double res = valorCarrera / tiempoPrestamo;
        double porciento = res * 0.10;
        valorMensual = res - porciento;
    }
@Override
    public String toString() {
        String x = String.format("%s Ciudad Prestamo: %s\n\n"
                + " Prestamo Educativo\n"
                + "\tNivel de estudio: %s\n"
                + "\tValor de la carrera: $%.2f\n"
                + "\tValor mensual a pagar: $%.2f\n"
                + "|--------------------------------|\n",
                super.toString(),
                ciudadPrestamo.toUpperCase(),
                nivelEstudio,
                valorCarrera,
                valorMensual);
        return x;
    }
}
