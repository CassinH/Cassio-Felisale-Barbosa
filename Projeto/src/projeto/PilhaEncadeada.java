
package projeto;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class PilhaEncadeada {
      No topo;
    int qtd=0;
    
    //isEmpty
    boolean isEmpty(){
        return qtd==0;
    }
    //empilhar  
    public void push(Object valor){
        No novoNo = new No(valor,topo);
        topo = novoNo;
        qtd++;
    }
    //desempilhar
    public Object pop(){
        if(!isEmpty()){
            Object temp =topo.getValor();
            topo=topo.getAnterior();
            qtd--;
            return temp;
        }else{
            JOptionPane.showMessageDialog(null,"Pilha vazia!");
            return null;
        }
    }
   //topo pilha
    public Object top(){
        return topo.getValor();
    }
    //qauntidade na pilha 
    public int size(){
        return qtd;
    }
    public void imprimir(){
        No aux = topo;
        while(aux!=null){
            System.out.println(aux.getValor()+"");
            aux=aux.getAnterior();
        }
        
    }
}


/*    
public String salvar(){
        
        try {
            FileWriter fw = new FileWriter("Clientes.txt",true);
            PrintWriter pw = new PrintWriter(fw);
            pw.println("Codigo: "+this.codigo);
            pw.println("Nome: "+this.nome);
            pw.println("Email: "+this.Email);
            pw.println("CPF: "+this.cpf);
            pw.println("\n");            
            codigo++;
            pw.flush();
            pw.close();
            fw.close();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Clientes.class.getName()).log(Level.SEVERE, null, ex);
        }
      
          return null;
*/
