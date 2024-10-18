public class Nodo {
    private String dato;
    private Nodo sig;
    private Nodo prev;

    public Nodo(String dato){
        this.dato = dato;
        this.sig=null;
        this.prev=null;
    }

    public String getDato() {
        return this.dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public Nodo getSig() {
        return this.sig;
    }

    public void setSig(Nodo sig) {
        this.sig = sig;
    }

    public Nodo getPrev() {
        return this.prev;
    }

    public void setPrev(Nodo prev) {
        this.prev = prev;
    }

}
