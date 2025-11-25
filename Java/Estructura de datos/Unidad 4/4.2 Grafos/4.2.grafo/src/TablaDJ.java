public class TablaDJ {
    NodoVertice vertice;
    boolean encontrado;
    String camino;
    int distancia;

    public TablaDJ(NodoVertice vertice) {
        this.camino=String.valueOf(vertice.Id);
        this.vertice=vertice;
        this.encontrado=false;
        this.distancia=Integer.MAX_VALUE;
    }

    public TablaDJ(NodoVertice vertice,String camino,int distancia) {
        this.camino=camino;
        this.vertice=vertice;
        this.encontrado=false;
        this.distancia=distancia;
    }


    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public String getCamino() {
        return camino;
    }

    public void setCamino(String camino) {
        this.camino = camino;
    }

    public boolean isEncontrado() {
        return encontrado;
    }

    public void setEncontrado(boolean encontrado) {
        this.encontrado = encontrado;
    }

    public NodoVertice getVertice() {
        return vertice;
    }

    public void setVertice(NodoVertice vertice) {
        this.vertice = vertice;
    }

}

