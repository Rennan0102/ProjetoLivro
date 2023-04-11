package projetolivro;

public class ProjetoLivro{
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];
        
        p[0] = new Pessoa("Nanner", "Masculino", 18);
        p[1] = new Pessoa("Nanneia", "Feminino", 19);
        
        l[0] = new Livro("Como ler livros", "Nemli das Dores", 200, p[0]);
        l[1] = new Livro("As aventuras de Raposo Numpegue", "Dora da Silva", 100, p[1]);
        l[2] = new Livro("Programação do Zero em 4 dias", "Cleiton", 400, p[1]);
        
        l[0].abrir();
        l[0].folhear(100);
        l[0].avancarPag();
        
        System.out.println(l[0].detalhes());
        System.out.println();
        System.out.println(l[1].detalhes());
    } 
}
