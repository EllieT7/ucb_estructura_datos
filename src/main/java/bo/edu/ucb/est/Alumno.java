package bo.edu.ucb.est;

public class Alumno {
    private String nombreCompleto;
    private String cedulaItentidad;
    private Alumno apuntadorASiguiente;
    
    public Alumno(String nombreCompleto, String cedulaIdentidad) {
        this.nombreCompleto = nombreCompleto;
        this.cedulaItentidad = cedulaIdentidad;
        this.apuntadorASiguiente = null;
    }

    public Alumno getApuntadorASiguiente() {
        return apuntadorASiguiente;
    }
    
    public void setApuntadorASiguiente(Alumno apuntadorASiguiente) {
        this.apuntadorASiguiente = apuntadorASiguiente;
    }

    public String getCedulaItentidad() {
        return cedulaItentidad;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setCedulaItentidad(String cedulaItentidad) {
        this.cedulaItentidad = cedulaItentidad;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "Alumno {" +
                "nombreCompleto='" + nombreCompleto + '\'' +
                ", cedulaIdentidad='" + cedulaItentidad + '\'' +
                '}';
    }


}
