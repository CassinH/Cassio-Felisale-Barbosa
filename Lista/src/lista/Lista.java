package lista;

public class Lista {
    private final int MAX_TAM = 1000;
    private int primeiro, ultimo;
    private Produto item[];
    
    public Lista(){
        primeiro = ultimo = 0;
        item = new Produto[MAX_TAM];
    }
    public boolean vazia(){
        return primeiro == ultimo;
    }
    public boolean cheia (){
        return ultimo == MAX_TAM;
    }
    public void inserirNoFIm(int codigo, String nome){
        if(cheia()){
            System.out.println("Lista cheia");
        }
        else{
            Produto p = new Produto(codigo, nome);
            item[ultimo] = p; 
            ultimo++;
        }
    }
    public void imprimir(){
        if(vazia()){
            System.out.println("Lista vazia");
        }
        else{
            for (int i = primeiro; i < ultimo; i++) {
                System.out.println(item[i]);
            }
        }
    }
    public void inseriNoComeco(int codigo, String nome){
        if(cheia()){
            System.out.println("Lista cheia");
        }
        else{ 
            Produto p = new Produto(codigo , nome);
            for (int i = ultimo ; i > primeiro; i--) {
                item[i] = item[i-1];
                item [primeiro] = p;
                ultimo++;
            }
          
            
        }     
        
    }
}
