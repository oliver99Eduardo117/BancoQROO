package prueba;

/**
 *
 * @author olive
 */
public class persona {

    private int id;
    private String nombreP;
    private String apellidoP;
    private String apellidoM;
    private String Tutor;
    private int dia;
    private int mes;
    private int año;
    private String NTJ;
    private String nip;
    private int FondoIn;

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

    public String getTutor() {
        return Tutor;
    }

    public void setTutor(String Tutor) {
        this.Tutor = Tutor;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNTJ() {
        return NTJ;
    }

    public void setNTJ(String NTJ) {
        this.NTJ = NTJ;
    }

    public String getNip() {
        return nip;
    }

    public void setNip(String nip) {
        this.nip = nip;
    }

    public int getFondoIn() {
        return FondoIn;
    }

    public void setFondoIn(int FondoIn) {
        this.FondoIn = FondoIn;
    }

    @Override
    public String toString() {
        return "persona{" + "id=" + id + 
                ", nombreP=" + nombreP + 
                ", apellidoP=" + apellidoP + 
                ", apellidoM=" + apellidoM + 
                ", Tutor=" + Tutor + 
                ", dia=" + dia + 
                ", mes=" + mes + 
                ", a\u00f1o=" + año + 
                ", NTJ=" + NTJ + 
                ", nip=" + nip + 
                ", FondoIn=" + FondoIn + '}';
    }
    
    
    
    
    
}