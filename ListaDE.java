
package trabalhoed1;
public class ListaDE{
    private No inicio;
    private No fim;
    private int cont=0;
    public void addf(Documento valor){
        No novo=new No();
        novo.valor=valor;
        if(cont==0){
            inicio=novo;
            fim=novo;
        }else{
            fim.prox=novo;
            novo.ant=fim;
            fim=novo;
        }
        cont++;
    }
    public Documento removeri(){
        if(cont==0){
            return null;
        }else{
            Documento x=inicio.valor;
            inicio=inicio.prox;
            cont--;
            return x;
        }
    }
}