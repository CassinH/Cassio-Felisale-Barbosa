package lista;

public class Produto {
    int codigo;
    String nome;
    
    public Produto(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }
    @Override
    public String toString(){
        return "Código: "+ codigo + " - Nome: " + nome;
    }
            
}
