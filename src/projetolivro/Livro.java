package projetolivro;

public class Livro implements Publicacao{
    private String titulo, autor;
    private int totPaginas, pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, int totPaginas, Pessoa leitor) {
        this.titulo = titulo;
        this.autor = autor;
        this.totPaginas = totPaginas;
        this.leitor = leitor;
        
        this.aberto = false;
        this.pagAtual = 0;
    }  // Fim do Construtor

    public String detalhes() {
        return "Livro{" + "Título = " + titulo + ", Autor = " + autor + ", Total de Páginas = " + 
                totPaginas + ", Página Atual = " + pagAtual + ", Aberto = " + aberto + ", Leitor = " 
                + this.leitor.getNome() + " de " + this.leitor.getIdade() + " anos" + '}';
    }  // Fim do Método detalhes
    
    // Métodos Getters e Setters
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getTotPaginas() {
        return totPaginas;
    }
    public void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    public int getPagAtual() {
        return pagAtual;
    }
    public void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    public boolean getAberto() {
        return aberto;
    }
    public void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
        this.aberto = false;
    }

    @Override
    public void folhear(int pag) {
        if (pag <= this.totPaginas && this.aberto == true){
            this.pagAtual = pag;
        } else{
            System.out.println("Excedeu o total de páginas ou o livro está fechado!"); 
            this.pagAtual = 0;
        }
    }

    @Override
    public void avancarPag() {
        if (this.pagAtual < this.totPaginas && this.aberto == true){
            this.pagAtual++;
        }
        else{System.out.println("Livro já esta na última página, não é possível avançar ou "
                + "livro está fechado!");}
    }

    @Override
    public void voltarPag() {
        if (this.pagAtual != 0 && this.aberto == true){
            this.pagAtual--;
        } else{System.out.println("Não existe páginas para voltar ou livro está fechado!");}
    }
}
