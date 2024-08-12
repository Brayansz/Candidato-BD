/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author Brayan
 */
public class Almacen extends Candidato{
    
    private String carnetConducir;
    private String carnetCarretilla;
    private String carnetCamion;

    public Almacen(String carnetConducir, String carnetCarretilla, String carnetCamion, String nombre, String apellidos, String dni, String fechaNacimiento, String direccion, int cp, String localidad, int telefono, String rutaCv, String estudiosFinalizados, String observaciones, String fechaAlta, String usuarioRegistrador) {
        super(nombre, apellidos, dni, fechaNacimiento, direccion, cp, localidad, telefono, rutaCv, estudiosFinalizados, observaciones, fechaAlta, usuarioRegistrador);
        this.carnetConducir = carnetConducir;
        this.carnetCarretilla = carnetCarretilla;
        this.carnetCamion = carnetCamion;
    }

    public String getCarnetConducir() {
        return carnetConducir;
    }

    public void setCarnetConducir(String carnetConducir) {
        this.carnetConducir = carnetConducir;
    }

    public String getCarnetCarretilla() {
        return carnetCarretilla;
    }

    public void setCarnetCarretilla(String carnetCarretilla) {
        this.carnetCarretilla = carnetCarretilla;
    }

    public String getCarnetCamion() {
        return carnetCamion;
    }

    public void setCarnetCamion(String carnetCamion) {
        this.carnetCamion = carnetCamion;
    }

    @Override
    public String toString() {
        return super.toString()
                +"\nEstudios finalizados: " + nivelEstudios
                +"\n\tCarnet Conducir: " + carnetConducir 
                +"\n\tCarnet Carretilla: " + carnetCarretilla 
                +"\n\tCarnet Camion: " + carnetCamion
                +"\nObservaciones: " + observaciones
                +"\nRegistrado por: " + usuarioRegistrador
                +"\n------------------------------------------------------------";
    }
    
    
    
    
}
