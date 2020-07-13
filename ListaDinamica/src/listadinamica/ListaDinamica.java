
package listadinamica;

public class ListaDinamica {
    
        Lista Primeiro;
        Lista Ultimo;
        int Tamanho = 0;
        
        public ListaDinamica(){
            Primeiro = null;
            Ultimo = Primeiro;
            
        }
        public void add(String Nome){
                if(Primeiro ==null){
                   Primeiro = new Lista();
                   Ultimo = Primeiro;
                   Lista Novo = new Lista();
                   Novo.setNome(Nome);
                   Novo.setProx(null);
                   Ultimo.setProx(Novo);
                   Ultimo=Novo;
                   Tamanho++;
                }else{
                   Lista Novo = new Lista();
                   Novo.setNome(Nome);
                   Novo.setProx(null);
                   Ultimo.setProx(Novo);
                   Ultimo=Novo;
                   Tamanho++;
                    
                }
            
        }
    
        public void ImprimiLista(){
            Lista Percorre = Primeiro.getProx();
            while(Percorre != null){
                System.err.println(Percorre.getNome());
                Percorre = Percorre.getProx();
            }
        }
        public void RemoveItem(String NomeParaRemover){
           Lista Remove = Primeiro.getProx();
           Lista Sentinela = Primeiro;
           if(!(Primeiro==null)){
            while(Remove!= null){
               if(Remove.getNome().equals(NomeParaRemover)){
                   Ultimo = Sentinela;
                   Ultimo.setProx(null);
                   Remove = null;
                   Tamanho--;
               }
               
               else{
                   Sentinela.setProx(Remove.getProx());
                   Remove.setProx(null);
                   Remove = null;
                   Tamanho--;
                   break;
                   
        }
          Remove = Remove.getProx();
          Sentinela = Sentinela.getProx();
          
        }
            System.gc();
        }
        }
        public static void main(String []args){
            ListaDinamica Adicionar = new ListaDinamica();
            Adicionar.add("Joao");
            Adicionar.add("Maria");
            Adicionar.add("Ana");
            Adicionar.add("Ju"); 
            Adicionar.ImprimiLista();
           
            
           
            
            
            Adicionar.RemoveItem("Maria,Joao,Ju");
            System.out.println("_________________");
            Adicionar.ImprimiLista();
             
             
            
                       

          
           
           
           
           
           
          
           
           
            
            
        }
}
