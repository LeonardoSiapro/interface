public class Livro implements Publicacao {
    public String titulo;
    public String autor;
    public int totalPaginas;
    public int paginaAtual = 1; // atributo
    public boolean aberto = false;

    Livro() {
        this.titulo = "A arte da guerra";
        this.autor = "Sun Tzu";
        this.totalPaginas = 160;
    }


    public void abrir() { // metodo
        aberto = true;
    }

    public void fechar() {
        aberto = false;
    }

    public void avancar() {
        if (paginaAtual < totalPaginas) {
            paginaAtual++;
        } else {
            System.out.println("Fim do livro");
        }
    }

    public void voltar() {
        if (paginaAtual > 1) {
            paginaAtual--;
        } else {
            System.out.println("Inicio do livro");
        }
    }

    public void estaAberto() {
        if (aberto) {
            System.out.println("Livro esta aberto e na pagina: " + paginaAtual);
        } else {
            System.out.println("Livro esta fechado com marcaçao na pagina: " + paginaAtual);
        }
    }

    public void voltarInicio() {
        paginaAtual = 1;
    }



}
