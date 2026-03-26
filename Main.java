public class Main {

    public static void main(String[] args) {

        System.out.println("=== Teste com BD ===");
        Implementador implBD = new PublicacaoImplBD();
        Publicacao livro = new Livro(implBD);

        livro.obterDados("Livro");
        livro.getTitulo();
        livro.getAutor(1);

        System.out.println("\n=== Teste com XML ===");
        Implementador implXML = new PublicacaoImplXML();
        Publicacao revista = new Revista(implXML);

        revista.obterDados("Revista");
        revista.getTitulo();
        revista.getAutor(2);
    }
}