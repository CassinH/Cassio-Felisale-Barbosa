package alunolista;

public class AlunoLista {
 
    int qtdElementos;
    Aluno primeiro,ultimo;
    
    //Inicializando uma lista vazia
    
    public AlunoLista(){
        this.qtdElementos =0;
        this.primeiro=null;
        this.ultimo=null;
    }
    public void inserirNoComeco(int Nota){
        
       if(this.qtdElementos==0){
           //lista vazia
           Aluno novo = new Aluno();
           novo.setNota(Nota);
           novo.setProximo(primeiro);
           this.primeiro=novo;
       }else{
           Aluno novo2 = new Aluno();
           novo2.setNota(Nota);
           novo2.setProximo(primeiro);
           primeiro=novo2;
       }
       this.qtdElementos++;
    }
   
    public void imprimir(){
        if( this.qtdElementos==0){
            System.out.println("[]");
        }else{
            System.out.println();
            Aluno aux =this.primeiro;
            for(int i=0;1<this.qtdElementos-1;i++){
                System.out.println(aux.getNota()+" ,");
                aux=aux.getAluno();
            }
            System.out.println(aux.getNota()+"");
        }
    }
    
    public static void main(String[]args){
        AlunoLista a = new AlunoLista();
        a.inserirNoComeco(3);
        a.inserirNoComeco(2);
        a.imprimir();
        
       
    }


}

