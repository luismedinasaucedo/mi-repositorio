public class NodoArista {
    NodoVertice VD;
    int Peso;
    NodoArista SigA;

    public NodoArista(NodoVertice VD,int Peso) {
        this.VD = VD;
        this.Peso=Peso;
        this.SigA=null;
    }




}
