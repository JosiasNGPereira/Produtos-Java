import java.util.Scanner;

public class Console {
    
    Loja loja;


    public Console (Loja loja){
        this.loja = loja;
    }

     private String lerValor(String rotulo){
        System.out.print(rotulo+": ");
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }

    public void menu(){
        char opcao;
        char opcao2;
        do{
            System.out.println("SEUS PRODUTOS");
            System.out.println("1 - Add Produto");
            System.out.println("2 - Add Kit de Produtos");
            System.out.println("3 - Consultar valor total em estoque");
            System.out.println("s - Para Sair");
            opcao = this.lerValor("Informe a opção desejada").charAt(0);
            switch (opcao) {
                case '1': System.out.println("SELECIONE O TIPO DE PRODUTO");
                          System.out.println("1 - Bebidas");
                          System.out.println("2 - Comidas");
                          System.out.println("2 - Diversao"); 
                          opcao2 = this.lerValor("Informe a opção desejada").charAt(0);
                          if(opcao2 == '1'){
                            addProdutoBebida();
                            System.out.println();
                          }
                          else if(opcao2 == '2'){
                            addProdutoComida();
                            System.out.println();
                          }else if(opcao2 == '3'){
                            addProddutoDiversao();
                            System.out.println();
                          }
                          
                          break;
                case '2':   
                        addKitProduto(); 
                        System.out.println();
                    break;
                        
                case '3': verificarTotalSaldo();
                    System.out.println();
                 break;
                case 's':  break;
            }

        }while(opcao!='s');

    }

    public void addProdutoBebida(){
       this.loja.estoque.add(this.loja.addBebida());
    }
    public void addProdutoComida(){
        this.loja.estoque.add(this.loja.addComida());
    }
    public void addProddutoDiversao(){
        this.loja.estoque.add(this.loja.addDiversao());
    }
   
    public void addKitProduto(){
        char opcao;
        String auxNome = this.lerValor("Digite o nome do Kit");
        KitFesta kit = new KitFesta(auxNome);
        do{
            System.out.println("SELECIONE O TIPO DE PRODUTO");
            System.out.println("1 - Bebidas");
            System.out.println("2 - Comidas");
            System.out.println("3 - Diversao"); 
            System.out.println("s - Sair"); 
            opcao = this.lerValor("Informe a opção desejada").charAt(0);
            if(opcao == '1'){
                kit.adicionarProdutos(this.loja.addBebida());
                System.out.println();
            }
            else if(opcao == '2'){
                kit.adicionarProdutos(this.loja.addComida());
                System.out.println();
            }else if(opcao =='3'){
                kit.adicionarProdutos(this.loja.addDiversao());
                System.out.println();
            }

        }while(opcao!='s');

     
       this.loja.estoque.add(kit);
    }
    public void verificarTotalSaldo(){
        String aux =this.loja.getSomaEstoque();
        System.out.println(aux);
    }

}
