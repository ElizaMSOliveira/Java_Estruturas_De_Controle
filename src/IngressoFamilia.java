
public non-sealed class IngressoFamilia extends Ticket{
    private int pessoas;
    private double valorTotal;

    public int getPessoas() {
        return pessoas;
    }
    public void setPessoas(int pessoas) {
        this.pessoas = pessoas;
    }
    public double getValorDesconto(){
    if(pessoas > 3){
        this.valorTotal = super.getValor() * this.pessoas;
        return valorTotal -= valorTotal * 0.05;
    }
    return  valorTotal = super.getValor() * pessoas;
  }
}
