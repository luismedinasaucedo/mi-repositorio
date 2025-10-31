package com.mycompany.proyecto.caf;
public class ListaPlatillos {
    private Platillo cabecera;

    public ListaPlatillos() {
        this.cabecera = null;
    }

    public boolean ListaVacia(){
    return cabecera == null;
    }

    public void IngresarPlatillo(String nombre){
        Platillo nuevo = new Platillo(nombre);
        if (ListaVacia()) {
            cabecera = nuevo;
            return;
        }
        
        
        Platillo auxplatillo=cabecera;
    while(auxplatillo!=null){
        if (cabecera.getNombre().compareTo(nombre)<0) {
            cabecera.setSig(nuevo);
            nuevo.setAnt(cabecera);
            cabecera=nuevo;
            return;
        }
        if (auxplatillo.getAnt()==null) {
            auxplatillo.setAnt(nuevo);
            nuevo.setSig(auxplatillo);
            return;
        }
        auxplatillo=auxplatillo.getAnt();
    }
        
        
        //else{
        //cabecera.setSig(nuevo);
        //nuevo.setAnt(cabecera);
        //cabecera = nuevo;
        //}
    }

    public void IngresarIngrediente(String nombreplatillo,String nombreingrediente,String cantidadingrediente){
            Ingrediente ingr = new Ingrediente(nombreingrediente,cantidadingrediente);
            Platillo auxplatillo=cabecera;

            while(auxplatillo!=null){
                if (auxplatillo.getNombre().equals(nombreplatillo)) {
                    break;
                }
                auxplatillo=auxplatillo.getAnt();
            }


            if (auxplatillo.getIngrediente_head()==null) {
                auxplatillo.setIngrediente_head(ingr);
            }
            else{
                ingr.setSig(auxplatillo.getIngrediente_head());
                auxplatillo.setIngrediente_head(ingr);
            }
    }

    public void mostrar(String nombre){
        Platillo auxplatillo=cabecera;


        while(auxplatillo!=null){
            if (auxplatillo.getNombre().equals(nombre)) {
                System.out.println(auxplatillo.getNombre());
                System.out.println("ingredientes");
                Ingrediente auxingrediente=auxplatillo.getIngrediente_head();
                while(auxingrediente!=null){
                    System.out.println("ingrediente: "+auxingrediente.getNombre()+" cantidad: "+auxingrediente.getCantidad());
                    auxingrediente=auxingrediente.getSig();
                }
                return;
            }

            auxplatillo=auxplatillo.getAnt();
        }
        System.out.println("no se encontro el platillo");
    }

    public void eliminar(String nombre){

        Platillo auxplatillo=cabecera;

        while(auxplatillo!=null){
            if (auxplatillo.getNombre().equals(nombre)) {
                if (auxplatillo.getAnt()==null) {
                    auxplatillo.getSig().setAnt(null);
                    return;
                }
                if (auxplatillo==cabecera) {
                    cabecera=cabecera.getAnt();
                    cabecera.setSig(null);
                    return;
                }
                auxplatillo.getAnt().setSig(auxplatillo.getSig());
                auxplatillo.getSig().setAnt(auxplatillo.getAnt());
            }

            auxplatillo=auxplatillo.getAnt();
        }
    }

    public void buscaringredientes(String nombre){
        Platillo auxplatillo=cabecera;
        while(auxplatillo!=null){
            Ingrediente auxingrediente=auxplatillo.getIngrediente_head();

            while(auxingrediente!=null){
                if (auxingrediente.getNombre().equals(nombre)) {
                    System.out.println(auxplatillo.getNombre());
                }
                auxingrediente=auxingrediente.getSig();
            }
            auxplatillo=auxplatillo.getAnt();

        }
    }
    public void mostrartodo(){
    Platillo auxplatillo=cabecera;
    while(auxplatillo!=null){
        System.out.println(auxplatillo.getNombre());
        auxplatillo=auxplatillo.getAnt();
    }
    }
}
