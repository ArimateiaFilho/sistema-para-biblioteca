package trabalhoed1;
public class Heap {
    private Documento v[]=new Documento[20];
    private int cont=0;
    public int getContador(){
        return cont;
    }
    public int getTamanho(){
        return v.length;
    }
    private void subir(int valor){
        if(valor>0){
            if(valor%2==0){
                int x=(valor/2)-1;
                if(v[x].getPrioridade()<v[valor].getPrioridade()){
                    Documento j=v[x];
                    v[x]=v[valor];
                    v[valor]=j;
                    subir(x);
                }
            }else{
                int x=(valor/2);
                if(v[x].getPrioridade()<v[valor].getPrioridade()){
                    Documento j=v[x];
                    v[x]=v[valor];
                    v[valor]=j;
                    subir(x);
               }
            }
        }
    }
    private void descer(int valor){
        int x,y;
        x=valor*2+1;
        y=valor*2+2;
        if(x<=cont){
            if(y<cont){
                if(v[x].getPrioridade()>v[y].getPrioridade()){
                    Documento j=v[valor];
                    v[valor]=v[x];
                    v[x]=j;
                    descer(x);
                }else if(v[x]==v[y]){
                    Documento j=v[valor];
                    v[valor]=v[x];
                    v[x]=j;
                    descer(x);
                }else{
                    Documento j=v[valor];
                    v[valor]=v[y];
                    v[y]=j;
                    descer(y);
                }
            }else{
                if(v[valor].getPrioridade()<v[x].getPrioridade()){
                    Documento j=v[valor];
                    v[valor]=v[x];
                    v[x]=j;
                }
                
            }
        }
    }
    public void add(Documento valor){
        if(cont==0){
            v[cont]=valor;
            cont++;
        }else{
            if(cont<v.length){
                v[cont]=valor;
                subir(cont);
                cont++;
            }else{
                System.out.println("cheio");
            }
        }
    }
    public Documento remo(){
        if(cont==1){
            Documento x=v[0];
            cont--;
            return x;
        }else{
            if(cont>1){
                Documento x=v[0];
                v[0]=v[cont-1];
                cont--;
                descer(0);
                return x;
            }else{
                return null;
            }
        }
    }
    public void imp(){
        for(int i=0;i<cont;i++){
            System.out.println(v[i].getAluno());
        }
    }
}
