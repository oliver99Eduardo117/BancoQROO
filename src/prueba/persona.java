package prueba;

/**
 *
 * @author olive
 */
public class persona {
    
    private int id;
    private String nombreP;
    private String  apellidoP;
    private String  apellidoM;
    private int edadP;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreP() {
        return nombreP;
    }

    public void setNombreP(String nombreP) {
        this.nombreP = nombreP;
    }

    public String getApellidoP() {
        return apellidoP;
    }

    public void setApellidoP(String apellidoP) {
        this.apellidoP = apellidoP;
    }

    public String getApellidoM() {
        return apellidoM;
    }

    public void setApellidoM(String apellidoM) {
        this.apellidoM = apellidoM;
    }

    public int getEdadP() {
        return edadP;
    }

    public void setEdadP(int edadP) {
        this.edadP = edadP;
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + ", nombreP=" + nombreP + ", apellidoP=" + apellidoP + ", apellidoM=" + apellidoM + ", edadP=" + edadP + '}';
    }
    
}
