public class ListadeAdyacencia {
    NodoVertice PrimerVertice;

    public ListadeAdyacencia() {
        PrimerVertice = null;
    }

    public void AñadirV(char x){
        if (PrimerVertice==null){
            PrimerVertice=new NodoVertice(x);
            return;
        }
        else {
            NodoVertice b=BuscarVertice(x);
            if (b.Id==x){
                System.out.println("error el vertice ya existe");
            }
            else{
                b.SigV=new NodoVertice(x);

            }

        }

    }
    public NodoVertice BuscarVertice(char x){
        NodoVertice aux=PrimerVertice;
        while (aux!=null){
            if (aux.Id==x||aux.SigV==null){
                return aux;
            }
            aux=aux.SigV;
        }
        return null;
    }

    public void AgregarArista(NodoVertice x,NodoVertice y,int peso){


    }



}
