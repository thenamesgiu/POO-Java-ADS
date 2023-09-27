package aulaoito;

public class PessoaJuridica extends Pessoa{

    private String razao;
    private String cnpj;
    
    public PessoaJuridica(){
        
    }
    
    public PessoaJuridica(String razao, String cnpj, String email, String celular){
        super(email, celular);
        this.cnpj = cnpj;
        this.razao = razao;
    }
    
    //Get

    public String getRazao() {
        return razao;
    }

    public String getCnpj() {
        return cnpj;
    }
    
    //Set

    public void setRazao(String razao) {
        this.razao = razao;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    //Imprimir
    public String imprimir(){
        return "CNPJ: " + cnpj + "\nRazão Social: " + razao + "\nE-mail: " + getEmail() + "\nCelular: " + getCelular();
    }
}
