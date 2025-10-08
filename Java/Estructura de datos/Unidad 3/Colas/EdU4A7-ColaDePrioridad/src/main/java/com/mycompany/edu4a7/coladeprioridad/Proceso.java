
package com.mycompany.edu4a7.coladeprioridad;

public class Proceso {
    private String Dato;
    private Proceso sig;
    private int prio;

    public Proceso(String Dato, int prio) {
        this.Dato = Dato;
        this.sig =null;
        this.prio = prio;
    }

    public String getDato() {
        return Dato;
    }

    public void setDato(String Dato) {
        this.Dato = Dato;
    }

    public Proceso getSig() {
        return sig;
    }

    public void setSig(Proceso sig) {
        this.sig = sig;
    }
    public int getPrio() {
        return prio;
    }

    public void setPrio(int prio) {
        this.prio = prio;
    }
    
}
