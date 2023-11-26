import java.util.ArrayList;
import java.util.List;

public class KitFesta implements IKitProduto {

    List<IProduto> produtos = new ArrayList<>(); 
    String nome;

    public KitFesta(String nome){

        this.nome = nome;

    }
    public void adicionarProdutos(IProduto produto){
        this.produtos.add(produto);
    };

    @Override
    public int gerNumeroProdutos() {
        return this.produtos.size();
    }

    @Override
    public IProduto getProduto(int numero) {
        return this.produtos.get(numero);
    }

    @Override
    public String getNome() {
       return this.nome;
    }

    @Override
    public float getCusto() {
        float total =0f;
        for (IProduto iProduto : produtos) {
            total += iProduto.getCusto();
        }

        return total;
    }
    
    
    
}
