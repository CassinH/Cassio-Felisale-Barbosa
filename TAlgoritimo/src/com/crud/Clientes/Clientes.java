
package com.crud.Clientes;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Clientes {
    
    private int codigo = 0;
    private String nome;
    private String Email;
    private String cpf;
    
    public int getCogigo() {
        return codigo;
    }

    public void setCogigo(int cogigo) {
        this.codigo = cogigo;
    }
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
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
    }
}
   
