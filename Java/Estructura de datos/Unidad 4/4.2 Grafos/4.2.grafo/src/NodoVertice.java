public class NodoVertice {
    char Id;
    NodoVertice SigV;
    NodoArista PrimerA;

    public NodoVertice(char id) {
        this.Id=id;
        this.SigV=null;
        this.PrimerA=null;
    }

    public NodoArista InsertarArista(NodoVertice x,int peso){
        if (PrimerA==null){
            return PrimerA=new NodoArista(x,peso);
        }
        else{
            NodoArista aux=PrimerA;
            while (aux.SigA==null){
                if (aux.VD==x){
                    System.out.println("ya existe este arista");
                    return null;
                }
                aux=aux.SigA;
            }
            return aux.SigA=new NodoArista(x,peso);
        }
    }


}
