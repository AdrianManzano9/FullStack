package Ej.POO;

public class Libro {

    public String Título,Autor;
    public int ISBN,Número_de_páginas;

    public Libro(int ISBN, String Título, String Autor, int Número_de_páginas) {
        this.ISBN = ISBN;
        this.Título = Título;
        this.Autor = Autor;
        this.Número_de_páginas = Número_de_páginas;
    }
    public Libro(){
        
    }

    @Override
    public String toString() {
        return "Libro{" + "T\u00edtulo=" + Título + ", Autor=" + Autor + ", ISBN=" + ISBN + ", N\u00famero_de_p\u00e1ginas=" + Número_de_páginas + '}';
    }

}
