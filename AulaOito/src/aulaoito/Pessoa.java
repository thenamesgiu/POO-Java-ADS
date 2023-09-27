package aulaoito;

public class Pessoa {
    private String email;
    private String celular;

    //Construtor
    public Pessoa() {
    }

    public Pessoa(String email, String celular) {
        this.email = email;
        this.celular = celular;
    }

    //Get
    public String getEmail() {
        return email;
    }

    public String getCelular() {
        return celular;
    }
    
    
    //Set
    public void setEmail(String email) {
        this.email = email;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }
    
}
