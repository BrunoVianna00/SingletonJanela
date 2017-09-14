
package singleton;


public class Janela {
    private boolean x;
    private static Janela instancia; 
    
    private Janela(){
        
    }
    public static Janela getInstance(){
        if (instancia == null){
            
            instancia = new Janela();
        }
        return instancia;
    }

    
    public void abrir() {
       x = true;
        System.out.println("Abrindo janela " + x);
}
    public void fechar(){
        x=false;
        System.out.println("Fechando janela " + x);
    }

}