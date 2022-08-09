public class Estagiario extends Vendedor{

    public Estagiario(String nome){
        super.nome =nome;
        super.PONTOS_POR_VENDA = 5;
    }
    //Implementação do método abstrato
    @Override
    public int calcularPontos(){
        return 5 * vendas;
    }

    @Override
    public String mostrarCategoria(){
        if (calcularPontos() < 50){
            return "Estagiário(a) " + this.nome + " é um vendedor novato";
        } else {
            return "Estagiário(a) " + this.nome + "é um vendedor mestre";
        }
    }
}
