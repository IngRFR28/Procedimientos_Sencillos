import java.sql.*;
import java.util.*;
/**
 *
 * @author Roberto Flores Reyes
 */
public class CRUD {
    
    private Connection conn;
    public CRUD(Connection conn){
        this.conn = conn;
    }
    
    public void insertarUsuarioP(UsuarioCRUD u) throws SQLException{
    
        String query = "call crearUsuario(?,?,?,?,?,?,?,?)";
        
        try(CallableStatement cs = conn.prepareCall(query)){
            
            cs.setString(1, u.getNombre());
            cs.setString(2, u.getApellido_Paterno());
            cs.setString(3, u.getApellido_Materno());
            cs.setString(4, u.getCelular());
            cs.setString(5, u.getTelefono());
            cs.setString(6, u.getCurp());
            cs.setDate(7, u.getFechaN());
            
            //Necesito atrapar al id que no está incluido 
            cs.registerOutParameter(8, java.sql.Types.INTEGER);
            
            
            cs.execute();
            
            int nuevoID = cs.getInt(8);
            
            u.setId_usuario(nuevoID);
            
        }
        
    }
    
    //Leer ahora por un id
    
    public UsuarioCRUD leerId(int id)throws SQLException{
        
        String query = "call leerUsuarioID(?)";
        
        try(CallableStatement cs = conn.prepareCall(query)){
        
            cs.setInt(1, id);
            
            try(ResultSet rs = cs.executeQuery()){
            
                if(rs.next()){
                    
                    UsuarioCRUD nuevo = new UsuarioCRUD();
                    
                    nuevo.setId_usuario(rs.getInt("id_usuario"));
                    nuevo.setNombre(rs.getString("nombre"));
                    nuevo.setApellido_Paterno(rs.getString("apellido_paterno"));
                    nuevo.setApellido_Materno(rs.getString("apellido_materno"));
                    nuevo.setCelular(rs.getString("celular"));
                    nuevo.setTelefono(rs.getString("telefono"));
                    nuevo.setCurp(rs.getString("curp"));
                    nuevo.setFechaN(rs.getDate("fecha_nacimiento"));
                    
                    return nuevo;
                }
                
            }
        }
        return null;
        
    }
    
    //Actualizar las cosas de un usuario
    
    public void actualizarUsuario(int id, String telefono, String celular)throws SQLException{ // Natrualmmente se puede expandir, pero acá se hace así
        
            
        String query = "call actualizarCelularTelefono(?,?,?)";
        try(CallableStatement cs = conn.prepareCall(query)){
            
            cs.setInt(1, id);
            cs.setString(2, telefono);
            cs.setString(3, celular);
            cs.execute();
        }
        
    
    }
    
    
    //Borrar a algún usuario de la BD
    
    public void borrarUsuario(int id)throws SQLException{
    
        String query = "call borrarUsuario(?)";
        
        try(CallableStatement cs = conn.prepareCall(query)){
            
            cs.setInt(1, id);
            cs.execute();
            
        }
    }
    
    
}
