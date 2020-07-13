
package alunolista;

public class Aluno {
    
    private int nota;
    private Aluno proximo;
    
    public void setNota(int nota){
        this.nota = nota;
    }
    public int getNota(){
    return this.nota;
    }
    public void setProximo(Aluno proximo){
        this.proximo = proximo;
        
    }
    public Aluno getAluno(){
        return this.proximo;
    }

   
   
}

