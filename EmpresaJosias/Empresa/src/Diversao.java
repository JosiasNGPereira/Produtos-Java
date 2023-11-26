public class Diversao implements IProduto {
    String tipo;
    boolean paraCriancas;
    String nome;
    float preco;

    public Diversao(String tipo, boolean paraCriancas, String nome, float preco){

        this.nome = nome;
        this.paraCriancas = paraCriancas;
        this.preco = preco;
        this.tipo = tipo;
    };

    @Override
    public String getNome() {
        return this.nome;
    }
    @Override
    public float getCusto() {
       return this.preco;
    }
}
