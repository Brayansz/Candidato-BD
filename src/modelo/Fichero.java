/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Brayan
 */
public class Fichero {
    
    private File fichero;

    public Fichero(File fichero) {
        this.fichero = fichero;
    }
  
    public File getFichero() {
        return fichero;
    }

    public void setFichero(File fichero) {
        this.fichero = fichero;
    }
    
    
    
    public void escribir (String datos){
        
        FileWriter fr = null;
        
        try {
            fr = new FileWriter(this.fichero, true);
        } catch (IOException ex) {
            Logger.getLogger(Fichero.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try(PrintWriter pr = new PrintWriter(fr)){
            pr.write(datos);
        }
        
    }
    
    
    
}
