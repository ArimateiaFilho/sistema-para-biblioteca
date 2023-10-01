package trabalhoed1;
public class Usuario {
    private String nome;
    private char grau;
    private int cpf;
    private int senha;
    public Usuario(){
        
    }
    public int getCpf(){
        return cpf;
    }
    public int getSenha(){
        return senha;
    }
    public String getNome(){
        return nome;
    }
    public char getGrau(){
        return grau;
    }
    public Usuario(int cpf,int senha,String nome,char grau){
        setNome(nome);
        setGrau(grau);
        setCpf(cpf);
        setSenha(senha);
    }
    private void setNome(String nome){
        this.nome=nome;
    }
    private void setGrau(char grau){
        if(grau=='s'||grau=='t'){
            this.grau=grau;
        }
    }
    private void setCpf(int cpf){
        if(cpf>0){
            this.cpf=cpf;
        }
    }
    private void setSenha(int senha){
        if(senha>0){
            this.senha=senha;
        }
    }
}
