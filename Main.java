package trabalhoed1;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int x=1;
        int numero=1;
        int vamoscontar=0;
        Usuario sec = new Usuario(1234,34,"Filho",'s');
        Usuario sec1 = new Usuario(1111,32,"Tatiane",'s');
        Usuario sec2 = new Usuario(3333,90,"Daniel",'s');
        Usuario trans=new Usuario(2331,53,"Rafael",'t');
        Usuario trans1=new Usuario(4213,67,"Julia",'t');
        Usuario trans2=new Usuario(1820,13,"Jordão",'t');
        Usuario trans3=new Usuario(2416,89,"Matheus",'t');
        Usuario trans4=new Usuario(9530,14,"Wesley",'t');
        Heap heap=new Heap();
        Hash hash=new Hash();
        hash.add(sec);
        hash.add(sec1);
        hash.add(sec2);
        hash.add(trans);
        hash.add(trans1);
        hash.add(trans2);
        hash.add(trans3);
        hash.add(trans4);
        ListaDE lista=new ListaDE();
        Scanner sc=new Scanner(System.in);
        while(x!=0){
            System.out.println("Digite uma opção");
            System.out.println("[1] Encomendar livro");
            System.out.println("[2] Remover uma encomenda (sera obrigatorio a analize)");
            System.out.println("[3] Transportar uma encomenda ");
            System.out.println("[0] Sair");
            x=sc.nextInt();
            if(x==1){
                Documento novo=new Documento();
                novo.setIdentificador(numero);
                numero++;
                System.out.println("Digite o nome do aluno");
                sc.nextLine();
                novo.setAluno(sc.nextLine());
                System.out.println("Digite o nome do livro");
                novo.setNomelivro(sc.nextLine());
                System.out.println("Digite o nome do autor do livro");
                novo.setAutor(sc.nextLine());
                System.out.println("Digite o conteudo do livro");
                novo.setConteudo(sc.nextLine());
                lista.addf(novo);
                vamoscontar++;
                System.out.println("Documento cadastrado");
            }
            if(x==2){
                if(vamoscontar>0&&heap.getContador()<heap.getTamanho()){
                    int cpf,senha;
                    Usuario aux=null;
                    System.out.println("Digite seu CPF");
                    cpf=sc.nextInt();
                    System.out.println("Digite sua senha");
                    senha=sc.nextInt();
                    aux=hash.buscar(cpf, senha);
                    if(aux!=null&&aux.getGrau()=='s'){
                        Documento au;
                        System.out.println("Bem vindo(a) "+aux.getNome());
                        au=lista.removeri();
                        System.out.println("Aluno : "+au.getAluno());
                        System.out.println("Nome do livro : "+au.getNomelivro());
                        System.out.println("Nome do autor : "+au.getAutor());
                        System.out.println("Conteudo : "+au.getConteudo());
                        au.setBibliotecario(aux.getNome());
                        System.out.println("Digite os demais dados do documento");
                        System.out.println("Prioridade 0-100");
                        au.setPrioridade(sc.nextInt());
                        System.out.println("Campus onde o livro esta");
                        sc.nextLine();
                        au.setCampuslivro(sc.nextLine());
                        System.out.println("Campus onde o aluno esta");
                        au.setCampusaluno(sc.nextLine());
                        heap.add(au);
                        System.out.println("Documento analizado");
                        vamoscontar--;
                    }else{
                        System.out.println("Usuario não cadastrado");
                    }
                }else{
                    System.out.println("Não a documentos ou não a espaços");
                }
            }
            if(x==3){
                if(heap.getContador()>0){
                    int cpf,senha;
                    Usuario aux=null;
                    System.out.println("Digite seu CPF");
                    cpf=sc.nextInt();
                    System.out.println("Digite sua senha");
                    senha=sc.nextInt();
                    aux=hash.buscar(cpf, senha);
                    if(aux!=null&&aux.getGrau()=='t'){
                        Documento ai=heap.remo();
                        System.out.println("Aluno : "+ai.getAluno());
                        System.out.println("Autor : "+ai.getAutor());
                        System.out.println("Bibliotecario : "+ai.getBibliotecario());
                        System.out.println("Campus do aluno : "+ai.getCampusaluno());
                        System.out.println("Campus onde o livros está : "+ai.getCampuslivro());
                        System.out.println("Prioridade : "+ai.getPrioridade());
                        System.out.println("Conteudo do livro : "+ai.getConteudo());
                        System.out.println("Identificador : "+ai.getIdentificador());
                        System.out.println("Nome do livro : "+ai.getNomelivro());
                        System.out.println("Documento removido pelo(a) transportador(a) "+aux.getNome());
                    }else{
                        System.out.println("Usuario não cadastrado");
                    }
                }else{
                    System.out.println("Não a nada a ser transportado");
                }
            }
        }
    }
}
