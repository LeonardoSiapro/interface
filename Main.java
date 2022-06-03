class Main {
    public static void main(String[] args) {
        Livro livro1 = new Livro();
        livro1.estaAberto();

        livro1.abrir();

        livro1.avancar();
        livro1.voltar();
        livro1.voltar();
        livro1.voltar();
        livro1.voltar();
        livro1.voltar();
        livro1.estaAberto();
    }
}
