
package singleton;


public class Janela {
    private String nomeJanela;
    private String cor;
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
       
        System.out.println("Abrindo janela");
}
    public void fechar(){
        System.out.println("Fechando janela");
    }

    
    public String getNomeJanela() {
        return nomeJanela;
    }

    
    public void setNomeJanela(String nomeJanela) {
        this.nomeJanela = nomeJanela;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
    
}