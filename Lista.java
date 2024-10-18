public class Lista {
    private Nodo p;
    private Nodo u;

    public Lista(Nodo p, Nodo u) {
        this.p = p;
        this.u= u;
    }

    public Lista() {
        this.p = null;
        this.u=null;
    }
    public void recorrer(){
        Nodo aux=this.p;
        String d="";
        while (aux!=null){
            d+=("["+aux.getDato()+"]->");
            aux=aux.getSig();
        }
        System.out.println(d);

    }
    public void recorrernt(){
        Nodo aux=this.u;
        String d="";
        while (aux!=null){
            d+=("["+aux.getDato()+"]<-");
            aux=aux.getPrev();
        }
        System.out.println(d);
    }

    public void insertarInicio(Nodo nuevo){
        if(p==null && u==null){
            this.p=nuevo;
            this.u=nuevo;
        }else{
            nuevo.setSig(this.p);
            p.setPrev(nuevo);
            this.p=nuevo;
        }
    }
    public void insertarFinal(Nodo nuevo){
        Nodo aux=this.p;
        if(p==null && u==null){
            this.p=nuevo;
            this.u=nuevo;
        }else{
            while(aux.getSig()!=null){
                aux = aux.getSig();
            }
            nuevo.setPrev(u);
            u.setSig(nuevo);
            this.u=nuevo;
        }
    }
    public void insertarDespues(Nodo nuevo, String dato){
        Nodo aux=null;
        if(p==null && u==null){
            this.p=nuevo;
            this.u=nuevo;
        }else{
            aux=this.buscar(dato);
            if(aux==null){
              
              System.out.println("no existe sa monda");
            }else{
                if(aux.getSig()==null){
                    insertarFinal(new Nodo(dato));
                }else{
                    nuevo.setPrev(aux);
                    nuevo.setSig(aux.getSig());
                    aux.getSig().setPrev(nuevo);
                    aux.setSig(nuevo);
                }
              
            }
            
        }
    }
    public void eliminarInicio(){
        if(this.p==null && this.u==null){
            System.out.println("La lista está vacía");
        }else{
            if(p==u){
                this.p=null;
                this.u=null;
            }else{
                this.p=this.p.getSig();
                p.setPrev(null);
            }
            
        }
    }
    public void eliminarFinal(){
        if(this.p==null && this.u==null){
            System.out.println("Lista vacia");
        }else{
            if(p==u){
                p=null;
                u=null;
            }else{
                this.u=this.u.getPrev();
                u.setSig(null);
            }
        }
    }
    public Nodo buscar(String busqueda){
      Nodo aux = this.p;
      while(aux!=null){
       if(aux.getDato().equals(busqueda)){
        break;
       }
       aux=aux.getSig();
      }
      return aux;
    }



}