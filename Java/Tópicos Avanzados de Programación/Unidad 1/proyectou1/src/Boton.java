import javax.swing.*;
import java.awt.*;

public class Boton extends JButton {
    String n;
    int x,y;

    public Boton(String n, int x, int y) {
        super(n);
        this.setBounds(x, y, 200, 50);
        this.setForeground(Color.red);
        this.setFont(new java.awt.Font("Arial",1,20));
    }
}
