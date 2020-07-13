
package projeto;


public class No {
    Object valor;
    No anterior;
    
    public No(Object valor, No anterior){
        this.valor=valor;
        this.anterior=anterior;
    }
    public void setValor(Object valor){
        this.valor=valor;
    }
    public Object getValor(){
        return valor;
    }
    public void setAnterior(No anterior){
        this.anterior = anterior;
   }
    public No getAnterior(){
        return anterior;
    }
}

