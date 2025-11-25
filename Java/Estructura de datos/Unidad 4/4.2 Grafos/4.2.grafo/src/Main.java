void main() {
    Scanner leer=new Scanner(System.in);
    ListadeAdyacencia objGrafo=new ListadeAdyacencia();

int menu;

    objGrafo.AñadirV('q');
    objGrafo.AñadirV('r');
    objGrafo.AñadirV('w');
    objGrafo.AñadirV('a');
    objGrafo.AñadirV('m');
    objGrafo.AñadirV('z');
    objGrafo.AgregarArista('q','r',5);
    objGrafo.AgregarArista('q','w',4);
    objGrafo.AgregarArista('r','w',2);
    objGrafo.AgregarArista('w','r',2);
    objGrafo.AgregarArista('r','a',2);
    objGrafo.AgregarArista('a','r',2);
    objGrafo.AgregarArista('w','m',3);
    objGrafo.AgregarArista('m','w',3);
    objGrafo.AgregarArista('r','m',6);
    objGrafo.AgregarArista('m','r',6);
    objGrafo.AgregarArista('m','z',6);
    objGrafo.AgregarArista('z','m',6);
    objGrafo.AgregarArista('r','z',7);
    objGrafo.AgregarArista('z','r',7);
    objGrafo.AgregarArista('a','z',5);
    objGrafo.AgregarArista('z','a',5);

    System.out.println();
    objGrafo.MOstrar();
    System.out.println();
    objGrafo.EncontrarA('z','a');
    objGrafo.MOstrar();
    System.out.println();

do {
    System.out.println("1.- agregar vertice\n2.- agregar arista\n3.-mostrar\n4.-Dijkstra\n5.- fin");
    menu=leer.nextInt();
    switch (menu){
        case 1->{objGrafo.AñadirV(leer.next().charAt(0));}
        case 2->{objGrafo.AgregarArista(leer.next().charAt(0),leer.next().charAt(0),leer.nextInt());}
        case 3->{objGrafo.MOstrar();}
        case 4->{objGrafo.ADJ('z');}
        case 5->{System.out.println("\neligio salir...");}

    }
}while (menu!=5);


}
