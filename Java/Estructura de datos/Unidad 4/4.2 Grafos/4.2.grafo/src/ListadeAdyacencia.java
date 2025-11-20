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
        NodoVertice a = BuscarVertice(x);
        NodoVertice b = BuscarVertice(y);
        if (a==null||b==null){
            System.out.println("no exsiste dato a buscar");
            return;
        }
        a.InsertarArista(b,peso);
    }

    public void MOstrar(){
        NodoVertice auxv=PrimerVertice;
        NodoArista auxa=null;
        while (auxv!=null){
            IO.println("vetice "+auxv.Id+"\t");
            auxa=auxv.PrimerA;
            while (auxa!=null){
                System.out.println(auxa.VD.Id+"|"+auxa.Peso);
                auxa=auxa.SigA;
            }
            auxv=auxv.SigV;
        }

    }

    public void CaminoCorto(char o){
        int NVertices=0;
        NodoVertice auxv=PrimerVertice;
        int IVO=-1;

        while (auxv!=null){
            NVertices++;
            auxv=auxv.SigV;
        }

        System.out.println("en "+NVertices +" vertices\n");

        TablaDJ TDJ[]=new TablaDJ[NVertices];
        auxv=PrimerVertice;


    }




}
