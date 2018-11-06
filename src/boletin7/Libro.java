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

import javax.swing.JOptionPane;

/**
 *
 * @author finfanterodal
 */
public class Libro {
    //Atributos

    private String titulo;
    private String autor;
    private int numExemplares;
    private int numExPrestados;
    private boolean estado;

    //Constructos
    public Libro() {       
    }

    //Métodos
    //Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumExemplares(int numExemplares) {
        this.numExemplares = numExemplares;
    }

    public void setNumExPrestados(int numExPrestados) {
        this.numExPrestados = numExPrestados;
    }
    //Getters

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumExemplares() {
        return numExemplares;
    }

    public int getNumExPrestados() {
        return numExPrestados;
    }
    //Método Préstamo

    public Boolean prestamo() {
        if (numExemplares > numExPrestados) {
            numExPrestados += 1;
            numExemplares  -=1;
            /*JOptionPane.showMessageDialog(null, "O préstamo pode realizarse"
                    + "\nNúmero de ejemplares prestados = " + numExPrestados
                    + "\nNúmero de ejemplares = " + numExemplares);*/
            estado=true;
            return estado;
        } else {
            /*JOptionPane.showMessageDialog(null, "No se puede realizar el préstamo");*/
            estado=false;
            return estado;
        }
    }

    //Método devolución
    public Boolean devolucion() {
        if (numExPrestados > 0) {
            numExPrestados -= 1;
            numExemplares  +=1;
            //Sin toString
            /*JOptionPane.showMessageDialog(null, "A devolución pode realizarse"
                    + "\nNúmero de ejemplares prestados = " + numExPrestados
                    + "\nNúmero de ejemplares = " + numExemplares);*/
            estado=true;
            return estado;
        } else {
            //Sin toString
            /*JOptionPane.showMessageDialog(null, "No se puede realizar la devolución");*/
            estado=false;
            return estado;
        }

    }

    //Método toString
    public String toString(){
        if (estado==true){
              String mensaje= ( "La operación ha sido realizada"
                    +"\nTitulo: "+titulo 
                    +"\nAutor: "+autor   
                    + "\nNúmero de ejemplares prestados = " + numExPrestados
                    + "\nNúmero de ejemplares = " + numExemplares); 
      return mensaje;
        }else{
                  String mensaje= ( "La operación no ha sido realizada"
                    +"\nTitulo: "+titulo
                    +"\nAutor: "+autor    
                    + "\nNúmero de ejemplares prestados = " + numExPrestados
                    + "\nNúmero de ejemplares = " + numExemplares); 
      return mensaje;
        }        
    }
}
 