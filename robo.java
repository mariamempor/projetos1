package brinquedosj;

public class Robo {
    
   private String nome;
   private int bateria;
   private  String dat_fab;
  
   public Robo(){
       this.bateria = 10;
       this.nome = "robosj";
       this.dat_fab = "16-04-2024";
   }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the bateria
     */
    public int getBateria() {
        return bateria;
    }

    /**
     * @param bateria the bateria to set
     */
    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    /**
     * @return the dat_fab
     */
    public String getDat_fab() {
        return dat_fab;
    }

    /**
     * @param dat_fab the dat_fab to set
     */
    public void setDat_fab(String dat_fab) {
        this.dat_fab = dat_fab;
    }
    
    
    
}
