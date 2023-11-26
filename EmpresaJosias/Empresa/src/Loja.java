import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Loja {
    List<IProduto> estoque = new ArrayList<>(); 

     private String lerValor(String rotulo){
        System.out.print(rotulo+": ");
        Scanner leitor = new Scanner(System.in);
        return leitor.nextLine();
    }
    public IProduto addBebida(){
    
        String aux = this.lerValor("Digite o nome da Bebida");
        double auxDouble = Double.parseDouble(this.lerValor("Digite o valor alcoolico"));
        String auxMarca = this.lerValor("Digite o nome da Marca");
        double auxVolume = Double.parseDouble(this.lerValor("Digite a quantidade do Volume"));
        float auxPreco = Float.parseFloat(this.lerValor("Digite o preco"));
        IProduto bebida = new Bebida(auxDouble, auxMarca, auxVolume, aux, auxPreco);
        return bebida;
    }

    public IProduto addComida(){
    
        String aux = this.lerValor("Digite o nome da comida");
        double auxDouble = Double.parseDouble(this.lerValor("Digite o peso"));
        double auxcalorias = Double.parseDouble(this.lerValor("Digite a quantidade de calorias"));
        float auxPreco = Float.parseFloat(this.lerValor("Digite o preco"));
        IProduto comida = new Comida(aux, auxDouble,auxcalorias, auxPreco);
        return comida;
    }

    public IProduto addDiversao(){
    
        String aux = this.lerValor("Digite o tipo da Diversao");
        boolean auxBoolean = Boolean.parseBoolean(this.lerValor("Diversao para criancasa (1) para sim ou (0) para nao "));
        String auxNome = this.lerValor("Digite o nome");
        float auxPreco = Float.parseFloat(this.lerValor("Digite o preco"));
        IProduto diversao = new Diversao(aux, auxBoolean,auxNome, auxPreco);
        return diversao;
    }

    public String getSomaEstoque(){

        float total = 0f;
        System.out.println("VALOR TOTAL EM ESTOQUE");
        for (IProduto iProduto : estoque) {
                total += iProduto.getCusto();
                
        }

        return "Valor total em estoque: " + total;
    }
}
