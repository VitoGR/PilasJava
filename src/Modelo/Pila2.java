package Modelo;

public class Pila2 {

    private Nodo ultimoValorIngresado;
    String Lista;

    public Pila2() {

        ultimoValorIngresado = null;

    }

    /*
    
    las pilas tienen 4 metodos basicos
    
    peek = cima
    push = insertar
    pop = eliminar
    empty = pila vacia
    
     */
    public boolean pilaVacia() {

        return ultimoValorIngresado == null;
    }

    public String insertar(String valor) {

        Nodo nuevo = new Nodo(valor);
        nuevo.siguiente = ultimoValorIngresado;
        ultimoValorIngresado = nuevo;

        return valor;

    }

    public String eliminar() {

        String aux = ultimoValorIngresado.informacion;

        ultimoValorIngresado = ultimoValorIngresado.siguiente;

        return aux;

    }

    public String cima() {
        return ultimoValorIngresado.informacion;

    }

    public String mostrarValores() {

        Lista = "";

        Nodo recorrido = ultimoValorIngresado;
        while (recorrido != null) {
            Lista += recorrido.informacion + "\n ";
            recorrido = recorrido.siguiente;
        }

        return Lista;
    }

    public void vaciar() {

        while (pilaVacia() == false) {
            eliminar();

        }

    }

}
