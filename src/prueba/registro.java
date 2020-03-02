package prueba;

import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import static jdk.nashorn.internal.runtime.Debug.id;

public class registro {
    
    private ObjectContainer db = null;
    private persona I;
    
    private void abrirRegistro()
    {
            db= Db4oEmbedded.openFile("RegistroUusuario");
    }
    
    private void cerrarRegistro()
    {
        db.close();
    }
    
    public void insertarRegistro(persona p)
    {
        abrirRegistro();
        db.store(p);
        cerrarRegistro();
    }
    
    //seleciona a una persona
    public persona selecionarPersona(persona p)
    {
        abrirRegistro();
        ObjectSet resultado = db.queryByExample(p);
        persona persona = (persona) resultado.next();
        cerrarRegistro();
        return persona;
        
    }
    
    public  void actualizacionPersona(int id, String nomP, String apeP, String aprM, int edad)
    {
        abrirRegistro();
        persona p = new persona();
        p.setId(id);
        ObjectSet resultado = db.queryByExample(p);
        persona preresultado = (persona) resultado.next();
        preresultado.setNombreP(nomP);
        preresultado.setApellidoP(apeP);
        preresultado.setApellidoM(aprM);
        db.store(preresultado);
        cerrarRegistro();
                
    }
    
    public void eliminarPersona(int id)
    {
        abrirRegistro();
        persona p = new persona();
        p.setId(id);
        ObjectSet resultado = db.queryByExample(p);
        persona preresultado = (persona) resultado.next();
        db.delete(preresultado);
        cerrarRegistro();
    }
    
}
