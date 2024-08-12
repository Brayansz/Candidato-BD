package bbdd;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import modelo.Administracion;
import modelo.Almacen;

public class conexion {

    static Connection conn;

    public static void conectar() {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://145.14.151.1/u812167471_candidatos", "u812167471_usercandidatos", "5n&BKAL9");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    

    ///////////////////////////////////////////////////////////////////////////////////////////
    public static void cerrarconexion(){
        try {
            conn.close();
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    ///////////////////////////////////////////////////////////////////////////////////////////
    
    public static boolean acceder(String user, String pass){
        
        String SQL = "SELECT usuario,contrasenya FROM usuarios WHERE usuario=? AND contrasenya =?";
        PreparedStatement pst;
        ResultSet rs;
        
        try {
            pst = conn.prepareStatement(SQL);
            pst.setString(1, user);
            pst.setString(2, pass);
            rs = pst.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean registrarAdministracion(Administracion a){
        String consulta= "INSERT INTO candidatoadministracion (nombre, apellidos, dni, fechaNacimiento, direccion, cp, localidad, telefono, rutaCv, "
                + "nivelEstudios, nivelInformaticaTexto, nivelInformaticaHojaCalculo, nivelInformaticaInternet, observaciones, fechaAlta, registrador)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst = conn.prepareStatement(consulta);
            
            pst.setString(1, a.getNombre());
            pst.setString(2, a.getApellidos());
            pst.setString(3, a.getDni());
            pst.setString(4, a.getFechaNacimiento());
            pst.setString(5, a.getDireccion());
            pst.setInt(6, a.getCp());
            pst.setString(7, a.getLocalidad());
            pst.setInt(8, a.getTelefono());
            pst.setString(9, a.getRutaCv());
            pst.setString(10, a.getnivelEstudios());
            pst.setString(11, a.getNivelInformaticaTexto());
            pst.setString(12, a.getNivelInformaticaHojaCalculo());
            pst.setString(13, a.getNivelInformaticaInternet());
            pst.setString(14, a.getObservaciones());
            pst.setString(15, a.getFechaAlta());
            pst.setString(16, a.getUsuarioRegistrador());
            pst.close();
            return true;
            
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public static boolean registrarAlmacen(Almacen a){
        
        String consulta="INSERT INTO candidatoalmacen (nombre, apellidos, dni, fechaNacimiento, direccion, cp, localidad, telefono, rutaCv, "
                + "nivelEstudios, carnetConducir, carnetCarretilla, carnetCamion, observaciones, fechaAlta, registrador)"
                + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        
        try {
            PreparedStatement pst = conn.prepareStatement(consulta);
            pst.setString(1, a.getNombre());
            pst.setString(2, a.getApellidos());
            pst.setString(3, a.getDni());
            pst.setString(4, a.getFechaNacimiento());
            pst.setString(5, a.getDireccion());
            pst.setInt(6, a.getCp());
            pst.setString(7, a.getLocalidad());
            pst.setInt(8, a.getTelefono());
            pst.setString(9, a.getRutaCv());
            pst.setString(10, a.getnivelEstudios());
            pst.setString(11, a.getCarnetConducir());
            pst.setString(12, a.getCarnetCarretilla());
            pst.setString(13, a.getCarnetCamion());
            pst.setString(14, a.getObservaciones());
            pst.setString(15, a.getFechaAlta());
            pst.setString(16, a.getUsuarioRegistrador());
            pst.close();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    //////////////////////////////////////////////////////////////////////////////////
    
    public static void tablaalmacen(JTable a) {

        Object[] datos = new Object[5];

        String consulta = "SELECT nombre, apellidos, localidad, cp, telefono FROM candidatoalmacen";
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("nombre");
        model.addColumn("apellidos");
        model.addColumn("localidad");
        model.addColumn("cp");
        model.addColumn("telefono");
        a.setModel(model);
        
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString("nombre");
                datos[1] = rs.getString("apellidos");
                datos[2] = rs.getString("localidad");
                datos[3] = rs.getString("cp");
                datos[4] = rs.getString("telefono");
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public static void tablaadministracion(JTable xd) {


        String consulta = "SELECT nombre, apellidos, localidad, cp, telefono FROM candidatoadministracion";

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("nombre");
        model.addColumn("apellidos");
        model.addColumn("localidad");
        model.addColumn("cp");
        model.addColumn("telefono");
        xd.setModel(model);
        
        String[] datos = new String[5];
        
        try {
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(consulta);
            while (rs.next()) {
                datos[0] = rs.getString(1);
                datos[1] = rs.getString(2);
                datos[2] = rs.getString(3);
                datos[3] = rs.getString(4);
                datos[4] = rs.getString(5);
                model.addRow(datos);
            }
        } catch (SQLException ex) {
            Logger.getLogger(conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}//ultimo

