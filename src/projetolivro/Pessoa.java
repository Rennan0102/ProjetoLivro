package projetolivro;

public class Pessoa{
    private String nome, sexo;
    private int idade;

    public Pessoa(String nome, String sexo, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
    }  // Fim do Construtor

    public void fazerAniver(){
        System.out.println("Parabéns, você completou " + (this.getIdade() + 1) + " anos");
        this.idade++;
    }  // Fim do Método fazerAniver
    
    // Métodos Getters e Setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
}
