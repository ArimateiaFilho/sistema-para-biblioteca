package trabalhoed1;
public class Documento {
    private int identificador;
    private int prioridade;
    private String aluno;
    private String campuslivro;
    private String campusaluno;
    private String bibliotecario; 
    private String nomelivro;
    private String autor;
    private String conteudo;
    public Documento(){    
    }
    public String getAluno(){
        return aluno;
    }
    public String getAutor(){
        return autor;
    }
    public String getBibliotecario(){
        return bibliotecario;
    }
    public String getCampusaluno(){
        return campusaluno;
    }
    public String getCampuslivro(){
        return campuslivro;
    }
    public String getConteudo(){
        return conteudo;
    }
    public int getIdentificador(){
        return identificador;
    }
    public String getNomelivro(){
        return nomelivro;
    }
    public int getPrioridade(){
        return prioridade;
    }
    public void setAluno(String aluno) {
        if(aluno!=null){
            this.aluno = aluno;
        }
    }
    public void setAutor(String autor) {
        if(autor!=null){
            this.autor = autor;
        }
    }
    public void setBibliotecario(String bibliotecario) {
        if(bibliotecario!=null){
            this.bibliotecario = bibliotecario;
        }
    }
    public void setCampusaluno(String campusaluno) {
        if(campusaluno!=null){
            this.campusaluno = campusaluno;
        }
    }
    public void setCampuslivro(String campuslivro) {
           if(campuslivro!=null){
               this.campuslivro = campuslivro;
           }
    }
    public void setConteudo(String conteudo) {
        if(conteudo!=null){
            this.conteudo = conteudo;
        }
    }
    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }
    public void setNomelivro(String nomelivro) {
        if(nomelivro!=null){
            this.nomelivro = nomelivro;
        }
    }
    public void setPrioridade(int prioridade) {
        if(prioridade>=0&&prioridade<=100){
            this.prioridade = prioridade;
        }
    }
}
