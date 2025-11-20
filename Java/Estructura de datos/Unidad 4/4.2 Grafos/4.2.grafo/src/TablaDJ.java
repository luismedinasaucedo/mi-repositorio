public class TablaDJ {
    NodoVertice vertice;
    boolean encontrado;
    int anterior;
    int distancia;

    public TablaDJ(NodoVertice vertice) {
        this.anterior=0;
        this.vertice=vertice;
        this.encontrado=false;
        this.distancia=0;
    }

    public TablaDJ(NodoVertice vertice,boolean encontrado,int anterior) {
        this.anterior=anterior;
        this.vertice=vertice;
        this.encontrado=encontrado;
        this.distancia=distancia;
    }




}
