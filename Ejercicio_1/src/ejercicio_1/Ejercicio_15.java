
package ejercicio_1;


public class Ejercicio_15 {
    
    private String titulo;
    private String autor;
    private int numeroPaginas;

    public Ejercicio_15(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + ", Autor: " + autor + ", Número de Páginas: " + numeroPaginas;
    }
    
    
}
