
public sealed class Ticket permits MeiaEntrada, IngressoFamilia {

    private String nome;
    private String descricao;
    private double valor;

    public double getValor() {
        return valor;
    }
    public void setValorIndividual(double valor) {
        this.valor = valor;
    }
    public String getNome() {
        return "None do Filme: " +nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDescricao() {
        return "Audio do Filme: " + descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    public static void printTicket(Ticket ticket) {
        System.out.printf("=====%s=====\n", ticket.getClass().getCanonicalName());

        switch (ticket) {
            case MeiaEntrada meiaEntrada ->{
                meiaEntrada.setNome("Meu Filme");
                meiaEntrada.setDescricao("Dublado");
                meiaEntrada.setValorIndividual(140);
                meiaEntrada.getValorMeia();

                System.out.println(meiaEntrada.getNome());
                System.out.println(meiaEntrada.getDescricao());
                System.out.println("Valor de Ingresso Normal R$ "+meiaEntrada.getValor());
                System.out.println("Valor de Ingresso Estudante R$ "+meiaEntrada.getValorMeia() );
            }
            case IngressoFamilia ingressoFamilia ->{
                ingressoFamilia.setNome("Familia");
                ingressoFamilia.setDescricao("Dublado");
                ingressoFamilia.setValorIndividual(50);
                ingressoFamilia.setPessoas(6);

                System.out.println(ingressoFamilia.getClass().getSimpleName());
                System.out.println(ingressoFamilia.getNome());
                System.out.println(ingressoFamilia.getDescricao());
                System.out.println("Valor do Ingresso Individual R$ " + ingressoFamilia.getValor());
                System.out.println("Quantidade de Pessoas: " + ingressoFamilia.getPessoas());
                System.out.println("Valor com Desconto Familia R$ " + ingressoFamilia.getValorDesconto());
            }
            default -> System.out.println("Invalid");
        }
        System.out.println("=====================================================");

    }
}
