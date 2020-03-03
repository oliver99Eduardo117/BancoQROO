package prueba;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.query.Predicate;
import java.awt.List;
import static jdk.nashorn.internal.runtime.Debug.id;

public class registro {
    
    private ObjectContainer db = null;
    private Persona I;
    
    private void abrirRegistro()
    {
            db= Db4oEmbedded.openFile("RegistroUusuario");
    }
    
    private void cerrarRegistro()
    {
        db.close();
    }
    
    public void insertarRegistro(Persona p)
    {
        abrirRegistro();
        db.store(p);
        cerrarRegistro();
    }
    
    //seleciona a una Persona
    public Persona selecionarPersona(Persona p)
    {
        abrirRegistro();
        ObjectSet resultado = db.queryByExample(p);
        Persona persona = (Persona) resultado.next();
        cerrarRegistro();
        return persona;
        
    }
    
    public  void actualizacionPersona(int id, String nomP, String apeP, String aprM, int edad)
    {
        abrirRegistro();
        Persona p = new Persona();
        p.setId(id);
        ObjectSet resultado = db.queryByExample(p);
        Persona preresultado = (Persona) resultado.next();
        preresultado.setNombreP(nomP);
        preresultado.setApellidoP(apeP);
        preresultado.setApellidoM(aprM);
        db.store(preresultado);
        cerrarRegistro();
                
    }
    
    public void eliminarPersona(int id)
    {
        abrirRegistro();
        Persona p = new Persona();
        p.setId(id);
        ObjectSet resultado = db.queryByExample(p);
        Persona preresultado = (Persona) resultado.next();
        db.delete(preresultado);
        cerrarRegistro();
    }
    
     //Metodo para iniciar secion
   
    public void iniciarSecion( String NT, String nip)
    {
      
    }
    
}
