package algoritimo;

import java.util.Scanner;


public class Main {
    
    public static Scanner digite = new Scanner(System.in);
     
    
    public static void main(String[]args){
        
        Lista listA = new Lista();
        listA.qtd=0;
        
       listar(listA);
       addObjeto(listA);
       addObjeto(listA);
       addObjeto(listA);
       addObjeto(listA);
       
       listar(listA);
       
       removeIni(listA);
       
       listar(listA);
       
       removeFim(listA);
       
       listar(listA);
       
       pesquisar(listA);
       
       listar(listA);
       
       System.out.println("Itens que tem na lista:"+listA.ultimo.num);
        
       
    }
    public static void removeFim(Lista listA){
        Elemento aux = listA.primeiro;
        Elemento ant = listA.primeiro;
        if(listA.qtd==0){
            System.out.println("Lista Vazia");
        }
        while (aux.proximo !=null){
            ant = aux;
            aux = aux.proximo;
            listA.qtd--;
        }
        ant.proximo = null;
        listA.ultimo = ant;
        
    }
    public static void removeIni(Lista listA){
        if(listA.qtd==0){
            System.out.println("Lista Vazia");
        }else{
            listA.primeiro = listA.primeiro.proximo;
            listA.qtd--;
        }
    }
    public static void pesquisar(Lista listA){
        System.out.println("Qual elemento você deseja encontrar?");
        int numero = digite.nextInt();
        Elemento aux = listA.primeiro;
        while(aux!=null && aux.num !=numero){
            aux=aux.proximo;
        }
        if(aux==null){
            System.out.println("Nada encontrado! ");
        }else{
             System.out.println("Encontrado Item :" + " "+ aux.num);
        }
    }
    public static void listar(Lista listA){
        Elemento aux=listA.primeiro;
        if(aux == null){ 
        System.out.println("Lista Vazia!");
        }else{
        while(aux !=null){
            System.out.print(aux.num+" ");
            aux = aux.proximo;
        }
        System.out.println();
      }
    }
    
    public static void addObjeto(Lista listA){
        Elemento novoObj = new Elemento();
        Elemento ObjAux = new Elemento();
        
        if(listA.qtd==0){
            System.out.println("Informe um Numero desejado?");
            novoObj.num = digite.nextInt();
            novoObj.proximo=null;
            
            listA.primeiro = novoObj;
            listA.ultimo = novoObj;
            listA.qtd++;
        }
        else{
            ObjAux = listA.primeiro;
            
            while(ObjAux.proximo !=null){
                ObjAux = ObjAux.proximo;
            }
            
            System.out.println("Informe um Item?");
            novoObj.num = digite.nextInt();
            novoObj.proximo=null;
            
            ObjAux.proximo=novoObj;
            
            listA.ultimo=novoObj;
            listA.qtd++;
            
            
            
        }
    }
}
 