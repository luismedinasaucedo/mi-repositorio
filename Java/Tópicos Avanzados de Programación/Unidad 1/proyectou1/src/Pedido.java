public class Pedido {
    int Costo,Iva;
    double Total;
    String Cliente,pedido,Imagen;

    public Pedido(int costo, int iva, double total, String cliente, String pedido,String imagen) {
        Costo = costo;
        Iva = iva;
        Total = total;
        Cliente = cliente;
        Imagen=imagen;
        this.pedido = pedido;
    }

    public void setCosto(int costo) {
        Costo = costo;
    }

    public void setIva(int iva) {
        Iva = iva;
    }

    public void setTotal(double total) {
        Total = total;
    }

    public void setCliente(String cliente) {
        Cliente = cliente;
    }

    public void setPedido(String pedido) {
        this.pedido = pedido;
    }

    public int getCosto() {
        return Costo;
    }

    public int getIva() {
        return Iva;
    }

    public double getTotal() {
        return Total;
    }

    public String getCliente() {
        return Cliente;
    }

    public String getPedido() {
        return pedido;
    }
}
