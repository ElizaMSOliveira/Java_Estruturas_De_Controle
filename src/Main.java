/*Crie uma hierarquia de classes para tratar os tipos de ingresso
que deve ser comercializados em um cinema.
O ingresso deve ter um valor, nome do filme e informar se é dublado ou legendado.
A Partir desse ingresso devem ser criados os tipos Meia entrada e ingresso familia.
Cada ingresso deve ter um método que retorna o seu valor real
(baseado no valor informado na criação do ingresso) para os de meia entrada o seu valor deve ser metade do valor,
para os ingressos familia deve-se retornar o valor multiplido pelo numero de pessoas e fornecer um desconto de 5%
quando o numero de pessoas for maior que 3.
*/

public class Main {
    public static void main(String[] args) {
        // CRIANDO E CHAMANDO
        //MeiaEntrada meiaEntrada = new MeiaEntrada();
        // ATRAVEZ DO OBJETO CRIADO meiaEntrada QUE É DO TIPO TICKET POSSO CHAMAR O METODO printTicket MESMO ELE SENDO ESTÁTICO
       // meiaEntrada.printTicket(meiaEntrada);

        // POSSO CHAMAR DIRETO O METODO PQ ELE É STATICO E PASSAR O OBJETO  SENDO CRIADO
        //METODO STATICO PERTENCE A CLASSE E NÃO AO OBJETO QUE FOI CRIADO
        Ticket.printTicket(new IngressoFamilia());


    }
}
