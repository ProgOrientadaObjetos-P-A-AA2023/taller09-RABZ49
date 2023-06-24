/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Prestamo;
import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private String tipoAuto;
    private String marcaAuto;
    private Persona garante;
    private double valorAuto;
    private double valorMensual;

    public PrestamoAutomovil(String tipoAu, String marcaAu, Persona garan,
            double valorAu, double valorMen, Persona benefi,
            int tiempoPre, String ciudadPre) {
        super(benefi, tiempoPre, ciudadPre);
        
        tipoAuto = tipoAu;
        marcaAuto = marcaAu;
        garante = garan;
        valorAuto = valorAu;

    }

    public String obtenerTipoAuto() {
        return tipoAuto;
    }

    public void establecerTipoAuto(String x) {
        tipoAuto = x;
    }

    public String obtenerMarcaAuto() {
        return marcaAuto;
    }

    public void establecerMarcaAuto(String x) {
        marcaAuto = x;
    }

    public Persona obtenerGarante() {
        return garante;
    }

    public void establecerGarante(Persona x) {
        garante = x;
    }

    public double obtenerValorAuto() {
        return valorAuto;
    }

    public void establecerValorAuto(double x) {
        valorAuto = x;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    public void calcularValorMensual() {
        valorMensual = valorAuto / tiempoPrestamo;
    }

    @Override
    public String toString() {
        String m = String.format("%s Ciudad del prestamo: %s\n\n"
                + "Prestamo Automovil\n"
                + " Tipo de auto: %s\n"
                + " Marca de auto: %S\n"
                + " Valor del auto: $%.2f\n"
                + " Valor mensual a pagar: $%.2f\n"
                + " Garante\n"
                + " Nombre: %s %s\n"
                + " Username: %s\n"
                + "|--------------------------------|\n",
                super.toString(),
                ciudadPrestamo.toLowerCase(),
                tipoAuto,
                marcaAuto,
                valorAuto,
                valorMensual,
                garante.obtenerNombre(),
                garante.obtenerApellido(),
                garante.obtenerUsername());
        return m;
    }
}
