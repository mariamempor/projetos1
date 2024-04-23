package brinquedosj;



public class calculadora {
    private Robo robo;
    
    public calculadora(Robo robo){
        this.robo = robo;
        
    }

    /**
     * @return the robo
     */
    public Robo getRobo() {
        return robo;
    }

    /**
     * @param robo the robo to set
     */
    public void setRobo(Robo robo) {
        this.robo = robo;
    }
   public float Somar (float num1, float num2){
       return num1+num2;
   }
   public float Subtrair (float num1, float num2){
       return num1 - num2;
   }
   public float Multiplicar (float num1, float num2){
       return num1*num2;
   }
   
}
