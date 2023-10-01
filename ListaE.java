package trabalhoed1;
public class ListaE {
    private Noo inicio;
    private Noo fim;
    private int cont=0;
    public void add(Usuario x){
        Noo novo=new Noo();
        novo.valor=x;
        if(cont==0){
            inicio=novo;
            fim=novo;
        }else{
            fim.prox=novo;
            fim=novo;
        }
        cont++;
    }
    public Usuario buscar(int cpf,int senha){
        Usuario passa=null;
        if(cont>0){
            Noo aux=inicio;
            for(int i=0;i<cont;i++){
               if(aux.valor.getCpf()==cpf&&aux.valor.getSenha()==senha){
                   passa=aux.valor;
                   break;
               }
               aux=aux.prox;
            }
        }
        return passa;
    }
}
