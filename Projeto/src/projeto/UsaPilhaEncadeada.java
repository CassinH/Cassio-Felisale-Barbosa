package projeto;

import javax.swing.JOptionPane;

public class UsaPilhaEncadeada {

    public static void main(String[] args) {

        PilhaEncadeada p1 = new PilhaEncadeada();
        boolean continuar = true;

        while (continuar) {
            String escolha = JOptionPane.showInputDialog("1:Inserir \n 2:Excluir \n 3:Imprimir \n 4: Topo \n 5:Quantidade \n 6:Sair");
            switch (escolha) {
                case "1":
                    String valor = JOptionPane.showInputDialog("Insera um membro?");
                    p1.push(valor);
                    break;
                case "2":
                    JOptionPane.showMessageDialog(null, "Excluindo:" + p1.pop());
                    break;
                case "3":
                    p1.imprimir();
                    break;
                case "4":
                    JOptionPane.showMessageDialog(null, "O topo é:" + p1.top());
                    break;
                case "5":
                    JOptionPane.showMessageDialog(null, "Quantidade:" + p1.size());
                case "6":
                    JOptionPane.showMessageDialog(null, "Obrigado!");
                    continuar=false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Por favor,informe opção valida");
                    break;

            }
        }
    }
}
