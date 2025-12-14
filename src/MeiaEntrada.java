public non-sealed class MeiaEntrada extends Ticket{

    private double valorMeia;

    public double getValorMeia() {
        this.valorMeia = super.getValor() / 2;
        return this.valorMeia;
    }
}
