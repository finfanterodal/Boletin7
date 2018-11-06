/*
  Crea unha clase chamada Libro que garde a información de cada un dos libros dunha biblioteca.
 A clase debe gardar o título do libro, autor, número de exemplares do libro e número de exemplares prestados.
 A clase conterá os seguintes métodos:
Constructor por defecto.
Constructor con parámetros.
Métodos Setters/getters
Método préstamo que incremente o atributo correspondente cada vez que se realice un préstamo do libro. 
Non se poderán prestar libros dos que non queden exemplares dispoñibles para prestar.
Devolve true se pudo realizar a operación e false en caso contrario.

Método devolución que decremente o atributo correspondente cando se produza a devolución dun libro.
Non se poderán devolver libros que non se prestaron. 
Devolve true si púidose realizar a operación e false en caso contrario.

Método toString para mostrar os datos dos libros..
 */
package boletin7;

/**
 *
 * @author finfanterodal
 */
public class Boletin7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.setAutor("George Orwell");
        libro1.setTitulo("1984");
        libro1.setNumExPrestados(1);
        libro1.setNumExemplares(10);
        libro1.devolucion();
        System.out.println("\n"+libro1.toString());
        libro1.devolucion();
        System.out.println("\n"+libro1.toString());
        libro1.prestamo();
        System.out.println("\n"+libro1.toString());
    }

}
