package bo.edu.ucb.est;

public class Lista {
    private int tamanio;
    private Alumno primerElemento;

    public void setPrimerElemento(Alumno primerElemento) {
        this.primerElemento = primerElemento;
    }

    public Lista() {
        tamanio = 0;
        primerElemento = null;
    }

    public void agregar(Alumno alumno) {
        tamanio++;
        if (primerElemento == null) {
            primerElemento = alumno;
        } else {
            // Buscamos el ultimo elemento de la lista
            Alumno nodoActual = primerElemento;
            do {
                // Verificamos si estamos al final de la lista.
                if (nodoActual.getApuntadorASiguiente() != null) {
                    nodoActual = nodoActual.getApuntadorASiguiente();
                    if(nodoActual.getApuntadorASiguiente() == null){
                        nodoActual.setApuntadorASiguiente(alumno);
                        break;
                    }
                }else{
                    // Agregamos el alumno al final
                    nodoActual.setApuntadorASiguiente(alumno);
                    break;
                }
            } while (nodoActual.getApuntadorASiguiente() != null);
            // Itero mientras no este en el ultimo nodo.
        }
    }

    public void imprimir() {
        Alumno nodoActual = primerElemento;
        while (nodoActual != null) {
            System.out.print( nodoActual.getNombreCompleto() + " -> ");
            nodoActual = nodoActual.getApuntadorASiguiente();
        }
        System.out.println( " |. ");
    }

    public int getTamanio() {
        return tamanio;
    }

    public Alumno obtener(int posicion){
        Alumno nodoActual = primerElemento;
        Alumno nodoAObtener = null;
        for(int i=0; i<getTamanio();i++){
            if(i==posicion){
                nodoAObtener = nodoActual;
                break;
            }
            nodoActual = nodoActual.getApuntadorASiguiente();
        }
        return nodoAObtener;
    }
    public void eliminar(int posicion){
        Alumno nodoActual = primerElemento;
        for(int i=1; i<=getTamanio();i++){
            if(posicion==0){
                setPrimerElemento(primerElemento.getApuntadorASiguiente());
                break;
            }else{
                if(i==posicion){
                    nodoActual.setApuntadorASiguiente(nodoActual.getApuntadorASiguiente().getApuntadorASiguiente());
                    break;
                }else{
                    nodoActual = nodoActual.getApuntadorASiguiente();
                }
            }
        }
    }
    
}
