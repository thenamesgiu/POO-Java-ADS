package aluno;

public class Aluno {
    private String Ra, Nome;
    private float AC1, AG, AC2, AF;
    
    //Set
    public void setRA(String Ra){
        this.Ra = Ra;
    }
    
    public void setNome(String Nome){
        this.Nome = Nome;
    }
     
    public void setAC1(float AC1){
        this.AC1 = AC1;
    }
     
    public void setAC2(float AC2){
        this.AC2 = AC2;
    }
    
    public void setAG(float AG){
        this.AG = AG;
    }
     
    public void setAF(float AF){
        this.AF = AF;
    }
    
    //Get
    public String getRa(){
        return this.Ra;
    }
    
    public String getNome(){
        return this.Nome;
    }
    
    public float getAC1(){
        return this.AC1;
    }
    
    public float getAC2(){
        return this.AC2;
    }
    
    public float getAG(){
        return this.AG;
    }
    
    public float getAF(){
        return this.AF;
    }
    
    //métodos - regra de calcular e regra de verificação de aprovação
    public float calcularMedia(){
        return (float) ((AC1*0.15) + (AC2 * 0.30) + (AG * 0.10) + (AF * 0.450));
    }
    
    public String verificarAprovacao(){
        if (calcularMedia() >= 5){
            return "Aprovado";
        }
        else{
            return "Reprovado";
        }
    }
    
    
    //Imprimir
    public String imprimir(){
        return "RA: " + getRa() + "\nNome: " + getNome() + "\nAC1: " + getAC1() + "\nAC2: " + getAC2() + "\nAG: " + getAG()+ "\nAF: " + getAF()+ "\nMédia: " + calcularMedia()+ "\nSituação: " + verificarAprovacao();
    }
}
