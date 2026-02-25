import javax.swing.*;
import java.awt.*;

public class Campo extends JTextField {
    int x,y;

    public Campo(int x, int y) {
        this.setBounds(x, y, 200, 50);
        this.setForeground(Color.red);
        this.setFont(new java.awt.Font("Arial",1,20));
}}
