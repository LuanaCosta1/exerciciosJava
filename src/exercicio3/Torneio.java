package exercicio3;

public class Torneio {
    private String nome;
    private int idade;
    
    public Torneio(String nome, int idade){
        this.setNome(nome);
        this.setIdade(idade);
        this.verificaCategoria();
        this.imprimeDados();
    }
    
    private String verificaCategoria(){
        String categoria;
        if(this.idade >= 5 && this.idade <= 7){
            categoria = "Infantil";
        }
        else if(this.idade >= 8 && this.idade <= 10){
            categoria = "Juvenil";
        }
        else if(this.idade >= 11 && this.idade <= 15){
            categoria = "Adolescente";
        }
        else if(this.idade >= 16 && this.idade <= 30){
            categoria = "Adulto";
        }
        else if(this.idade > 30){
            categoria = "Sênior";
        }
        else{
            categoria = "Idade não é válida";
        }
        return categoria;
    }
    
    private void imprimeDados(){
        System.out.println("\nNome: " + this.getNome()+
                           "\nIdade: " + this.getIdade()+
                           "\nCategoria: " + this.verificaCategoria());
    }

    public String getNome() {
        return nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }
}
