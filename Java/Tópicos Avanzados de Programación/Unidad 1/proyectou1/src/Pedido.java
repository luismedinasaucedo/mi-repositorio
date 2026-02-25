public class Pedido {
    int Costo,Iva,Total;
    String Cliente,pedido;

    public Pedido(int costo, int iva, int total, String cliente, String pedido) {
        Costo = costo;
        Iva = iva;
        Total = total;
        Cliente = cliente;
        this.pedido = pedido;
    }
}
