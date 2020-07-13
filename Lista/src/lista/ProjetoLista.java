package lista;
 
import java.util.Scanner;

public class ProjetoLista {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String resposta;
        Lista l = new Lista();
        
        for (int i = 0; i < 4; i++) {
            System.out.println("informe o nome do produto");
            l.inserirNoFIm(i, input.nextLine() );
        }
        System.out.println("Deseja imprimir a lista? ");
        resposta = input.nextLine();
        
        if(resposta.equalsIgnoreCase("sim")){
            l.imprimir();
        }else{
            System.out.println("Lista incrementada com sucesso");
        }
    }
    
}
