package listamanipulaçao;

import java.util.ArrayList;
import java.util.Iterator;

public class ListaManipulaçao {

   
    public static void main(String[] args) {
       
        //Criando uma lista vazia
        ArrayList lista = new ArrayList();
        System.out.println("Display da Lista vazio"+ lista);   
        
        //Adicionando elemento a lista
        lista.add("Cassio");
        lista.add("Maria");
        System.out.println(lista);
        
        //Adicionar "Ana" à posição 1 lista
        lista.add(1,"Ana");
        System.out.println(lista);
        
        //Obter o tamanho da Lista
        System.out.println("Tamanho da lista é ->" + lista.size());
        
       //Aceder ao elemento "Ana"
       System.out.println("Aceder à posição 1 ->" +lista.get(1));
       
       //Verificar se tem alguem na lista
       if(lista.contains("Cassio")){
           System.out.println("Cassio existe");
       }else{
           System.out.println("Não existe");
       }
       
       //Descobir o indice de um elemento na lista
       int indice=lista.indexOf("CASTRO");
       System.out.println("O indice de CASTRO é:"+indice);
       
       //remover um elemento da lista
        lista.remove("CASTRO");
        
        // Ver lista
        System.out.println(lista);
        
         //remover um elemento da lista
        lista.remove("Ana");
        System.out.println("Remoção de Ana ->"+lista);
        
        //Adicionando elemento a lista
       
        lista.add("João");
        lista.add("Caio");
        System.out.println(lista);
    
        //Organizar lista
        Iterator it = lista.iterator();
        System.out.println("Organizado");
        while(it.hasNext())
            System.out.println(it.next());
        System.out.println("----------------------------");
        
        //remover um da elemento da lista
        lista.remove(lista.size()-4);
        System.out.println(lista);
        
    
        
        
        
       
        
               

        
        
       
    }
    
}
