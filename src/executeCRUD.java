/**
 *
 * @author Roberto Flores Reyes
 */
import java.sql.SQLException;
public class executeCRUD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException{
        // TODO code application logic here
        ConexionCRUD conex = new ConexionCRUD();

        CRUD crud = new CRUD(conex.conectar());
        
        UsuarioCRUD nuevoUsuario = new UsuarioCRUD(0,"Roberto", "Flores","Reyes",
                                                  "45678234324","2321321",
                                                  "FORR000828HAMCLYBA7",
                                                  java.sql.Date.valueOf("2000-03-01"));
        
        crud.insertarUsuarioP(nuevoUsuario);
        //System.out.println("Hasta aca sale todo bien");
                
        //Ahora para leer algún usuario
        
        UsuarioCRUD usuario = crud.leerId(2);
        
        if(usuario != null){
            
            System.out.println("Nombre: " + usuario.getNombre() +"\n"
                               + "Apellido Paterno: " + usuario.getApellido_Paterno() + "\n"
                               + "Apellido Materno " + usuario.getApellido_Materno() + "\n"
                               + "Celular: " + usuario.getCelular() + "\n"
                               + "Telefono: " + usuario.getTelefono() + "\n"
                               + "CURP: " + usuario.getCurp() + "\n"
                               + "Fecha de nacimiento: " + usuario.getFechaN());
            
        }
        
        //Ahora vamos a actualizar los datos
        crud.actualizarUsuario(26, "54678909909090", "Lo modifiqué jejeje");
        System.out.println("Usuario modificado.");
        
        crud.borrarUsuario(28);
        System.out.println("Eliminamos al usuario");
    }
    
}
