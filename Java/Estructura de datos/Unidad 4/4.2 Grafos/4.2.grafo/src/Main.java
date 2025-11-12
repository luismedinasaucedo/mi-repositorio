void main() {
    Scanner leer=new Scanner(System.in);
    ListadeAdyacencia objGrafo=new ListadeAdyacencia();

int menu;

do {
    System.out.println("1.- agregar vertice\n2.- agregar arista\n3.-terminar");
    menu=leer.nextInt();
    switch (menu){
        case 1->{objGrafo.AñadirV(leer.next().charAt(0));}
        case 2->{objGrafo.AgregarArista('a','b',10);}
        case 3->{objGrafo.MOstrar();}

    }
}while (menu!=3);


}
