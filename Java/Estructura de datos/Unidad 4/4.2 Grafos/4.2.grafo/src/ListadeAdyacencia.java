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

    public void AgregarArista(char x,char y,int peso){
        NodoVertice a =BuscarVertice(x);
        NodoVertice b = BuscarVertice(y);
        if (a==null||b==null){
            System.out.println("no exsiste dato a buscar");
            return;
        }
        a.PrimerA=InsertarArista(b,peso);




    }
    public NodoArista InsertarArista(NodoVertice x,int peso){
        if (x.PrimerA==null){
            return x.PrimerA=new NodoArista(x,peso);
        }
        else{
            NodoArista aux=x.PrimerA;
            while (aux.SigA!=null){
                aux=aux.SigA;
            }
            return aux.SigA=new NodoArista(x,peso);
        }
    }



}
