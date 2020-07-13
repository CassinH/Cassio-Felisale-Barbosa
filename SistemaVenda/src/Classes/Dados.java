package Classes;

public class Dados {
    
    private Usuarios Musuario[]=new Usuarios[50];
    
    private int contusuario=0;
    
   
    
    public Dados(){
        Usuarios Musuario = new Usuarios("cassio","cassio","cassio","1010","1");
       
        contusuario++;
    }
    public Usuarios[]getUsuarios(){
        return Musuario;
    }
    public boolean validarUsuarios(String usuario,String senha){
        boolean x=false;
        for(int i=0;i<contusuario;i++){
            if(Musuario[i].getCodusuario().equals(usuario)&&Musuario[i].getSenha().equals(senha)){
                return true;
            }
        }
        return false;
     
  }
}