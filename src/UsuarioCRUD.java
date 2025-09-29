/**
 *
 * @author rflor
 */
import java.sql.*;


public class UsuarioCRUD {
    
    private int id_usuario;
    private String nombre;
    private String apellido_Paterno;
    private String apellido_Materno;
    private String celular;
    private String telefono;
    private String curp;
    private Date fechaN;
    
    public UsuarioCRUD(){} // Como una función general
    
    public UsuarioCRUD(int id_usuario, String nombre, String apellido_Paterno, String apellido_Materno, String celular, String telefono, String curp, Date fechaN) {
        this.id_usuario = id_usuario;
        this.nombre = nombre;
        this.apellido_Paterno = apellido_Paterno;
        this.apellido_Materno = apellido_Materno;
        this.celular = celular;
        this.telefono = telefono;
        this.curp = curp;
        this.fechaN = fechaN;
    }

    public int getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(int id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido_Paterno() {
        return apellido_Paterno;
    }

    public void setApellido_Paterno(String apellido_Paterno) {
        this.apellido_Paterno = apellido_Paterno;
    }

    public String getApellido_Materno() {
        return apellido_Materno;
    }

    public void setApellido_Materno(String apellido_Materno) {
        this.apellido_Materno = apellido_Materno;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

    public Date getFechaN() {
        return fechaN;
    }

    public void setFechaN(Date fechaN) {
        this.fechaN = fechaN;
    }
    
    
    
}
