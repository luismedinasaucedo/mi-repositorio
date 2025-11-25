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

    public void ADJ(char o){
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
        int contador=0;
        while (auxv!=null){
            TDJ[contador++]=new TablaDJ(auxv);
            auxv=auxv.SigV;
        }
        TDJ[0]=new TablaDJ(PrimerVertice,String.valueOf(PrimerVertice.Id),0);
        TDJ[0].setEncontrado(true);
        System.out.println(Encontrar(TDJ[0]).camino);




    }

    public TablaDJ Encontrar(TablaDJ nodo){
        TablaDJ base;
        TablaDJ nuevo;
        NodoArista arista=nodo.vertice.PrimerA;
        base=new TablaDJ(arista.VD,nodo.camino+arista.VD.Id,nodo.distancia+arista.Peso);

        if (arista.SigA==null){
            base.setEncontrado(true);
            return base;
        }
        arista=arista.SigA;
        while (arista!=null){
            nuevo=new TablaDJ(arista.VD,nodo.camino+arista.VD.Id,nodo.distancia+arista.Peso);
            arista=arista.SigA;
            if (base.distancia> nuevo.distancia){
                base=nuevo;
            }

        }
        return base;

    }

    public void EncontrarA(char inicio,char dato){
        NodoVertice inicial=PrimerVertice;
        while (inicial!=null){
            if (inicial.Id==inicio){
                break;
            }
            inicial=inicial.SigV;
        }
        if (inicial==null)return ;
        NodoArista aris=inicial.PrimerA;
        if (aris.VD.Id==dato){
            inicial.PrimerA=inicial.PrimerA.SigA;
            return;
        }//es la primera arista
        while (aris.SigA!=null){
            if (aris.SigA.VD.Id==dato){
                aris.SigA=aris.SigA.SigA;
                return;
            }
            aris=aris.SigA;
        }

    }

    




}
