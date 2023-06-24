/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

import paquete5.Persona;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected int tiempoPrestamo;
    protected String ciudadPrestamo;

    public Prestamo(Persona benefi, int tiempoPre, String ciudadPre) {
        beneficiario = benefi;
        tiempoPrestamo = tiempoPre;
        ciudadPrestamo = ciudadPre;
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public void establecerBeneficiario(Persona x) {
        beneficiario = x;
    }

    public int obtenerTiempoPrestamo() {
        return tiempoPrestamo;
    }

    public void establecerTiempoPrestamo(int x) {
        tiempoPrestamo = x;
    }

    public String obtenerCiudadPrestamo() {
        return ciudadPrestamo;
    }

    public void establecerCiudadPrestamo(String x) {
        ciudadPrestamo = x;
    }

    @Override
    public String toString() {
        String m = String.format("\n|--------------------------------|\n"
                + ""
                + "Beneficiario:\n"
                + "\tNombre: %s %s\n"
                + "\tUsername: %s\n\n"
                + "Tiempo del Prestamo: %d meses.\n",
                beneficiario.obtenerNombre(),
                beneficiario.obtenerApellido(),
                beneficiario.obtenerUsername(),
                tiempoPrestamo);
        return m;
    }

}
