public class Comida implements IProduto{
    String nome;
    double peso; 
    double calorias;
    float preco;

    public Comida(String nome, double peso, double calorias, float preco  ){

        this.calorias = calorias;
        this.nome = nome;
        this.preco = preco;
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
