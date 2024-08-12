/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Brayan
 */
public class Administracion extends Candidato {

    private String nivelInformaticaTexto;
    private String nivelInformaticaHojaCalculo;
    private String nivelInformaticaInternet;

    public Administracion(String nivelInformaticaTexto, String nivelInformaticaHojaCalculo, String nivelInformaticaInternet, String nombre, String apellidos, String dni, String fechaNacimiento, String direccion, int cp, String localidad, int telefono, String rutaCv, String estudiosFinalizados, String observaciones, String fechaAlta, String usuarioRegistrador) {
        super(nombre, apellidos, dni, fechaNacimiento, direccion, cp, localidad, telefono, rutaCv, estudiosFinalizados, observaciones, fechaAlta, usuarioRegistrador);
        this.nivelInformaticaTexto = nivelInformaticaTexto;
        this.nivelInformaticaHojaCalculo = nivelInformaticaHojaCalculo;
        this.nivelInformaticaInternet = nivelInformaticaInternet;
    }

    public String getNivelInformaticaTexto() {
        return nivelInformaticaTexto;
    }

    public void setNivelInformaticaTexto(String nivelInformaticaTexto) {
        this.nivelInformaticaTexto = nivelInformaticaTexto;
    }

    public String getNivelInformaticaHojaCalculo() {
        return nivelInformaticaHojaCalculo;
    }

    public void setNivelInformaticaHojaCalculo(String nivelInformaticaHojaCalculo) {
        this.nivelInformaticaHojaCalculo = nivelInformaticaHojaCalculo;
    }

    public String getNivelInformaticaInternet() {
        return nivelInformaticaInternet;
    }

    public void setNivelInformaticaInternet(String nivelInformaticaInternet) {
        this.nivelInformaticaInternet = nivelInformaticaInternet;
    }

    @Override
    public String toString() {
                return super.toString()
                +"\nNivel de estudios: " + nivelEstudios
                +"\n\t\tTratamiento de textos: " + nivelInformaticaTexto
                +"\n\t\tTratamiento hoja de calculo: " + nivelInformaticaHojaCalculo
                +"\n\t\tTratamiento internet: " + nivelInformaticaInternet
                +"\nObservaciones: " + observaciones
                +"\nRegistrado por: " + usuarioRegistrador
                + "\n----------------------------------------------------------------------";
    }
}
