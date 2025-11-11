public class NodoVertice {
    char Id;
    NodoVertice SigV;
    NodoArista PrimerA;

    public NodoVertice(char id) {
        this.Id=id;
        this.SigV=null;
        this.PrimerA=null;
    }
}
