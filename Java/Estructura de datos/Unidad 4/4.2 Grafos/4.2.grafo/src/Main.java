void main() {
    Scanner leer=new Scanner(System.in);
    ListadeAdyacencia objGrafo=new ListadeAdyacencia();

int menu;

objGrafo.AñadirV('a');
objGrafo.AñadirV('b');
    objGrafo.AñadirV('c');
    objGrafo.AñadirV('d');


do {
    System.out.println("1.- agregar vertice\n2.- agregar arista\n3.-terminar");
    menu=leer.nextInt();
    switch (menu){
        case 1->{objGrafo.AñadirV(leer.next().charAt(0));}
        case 2->{objGrafo.AgregarArista(leer.next().charAt(0),leer.next().charAt(0),leer.nextInt());}
        case 3->{objGrafo.MOstrar();}

    }
}while (menu!=4);


}
