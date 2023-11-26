public class Bebida implements IProduto{
    
    double teorAlcoolico;
    String marca;
    double volume;
    String nome;
    float preco;

    public Bebida (double teorAlcoolico, String marca, double volume, String nome, float preco){

        this.teorAlcoolico = teorAlcoolico;
        this.marca = marca;
        this.volume = volume;
        this.nome = nome;
        this.preco = preco;
    }
    @Override
    public String getNome(){
        return this.nome;
    }
    @Override
    public float getCusto() {
        return this.preco;
    }
}
