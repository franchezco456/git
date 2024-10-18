/**
 * ListaSimple
 */
public class ListaDoble {

    
    public static void main(String[] args) {
        Lista l = new Lista();
        l.insertarInicio(new Nodo("pedro pablo perez peña"));
        l.insertarFinal(new Nodo("lui"));
        l.insertarInicio(new Nodo("joder tio"));
        l.insertarFinal(new Nodo("waos"));
        l.eliminarInicio();
        l.eliminarFinal();
        l.insertarDespues(new Nodo("puta"), "lui");
        l.recorrer();
        l.recorrernt();
       }
}