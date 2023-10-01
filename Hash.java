package trabalhoed1;
public class Hash {
    ListaE u[]=new ListaE[11];
    public Hash(){
        for(int i = 0; i < u.length; i++) u[i] = new ListaE();
    }
    public int H(int cpf){
        int x=cpf;
        int y,z;
        y=x%100;
        z=x/100;
        x=y+z;
        x=x*23;
        x=x%u.length;
        return x;
    }
    public void add(Usuario novo){
        int aga=H(novo.getCpf());
        u[aga].add(novo);
    }
    public Usuario buscar(int cpf,int senha){
        Usuario o=null;
        int x=H(cpf);
        if(u[x]!=null){
            o=u[x].buscar(cpf, senha);
        }
        return o;
    }
}
