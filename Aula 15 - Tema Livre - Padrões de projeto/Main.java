public class Main {
    public static void main(String[] args) {
        // Criando a transação real
        TransacaoReal transacaoReal = new TransacaoReal(1000);

        // Criando o proxy
        ProxyTransacao proxy = new ProxyTransacao(transacaoReal);

        // Adicionando um decorator para log e descrição
        TransacaoConcreta transacaoDecorada = new TransacaoConcreta(proxy, "Depósito de Salário");

        // Singleton para gerenciar as transações
        GerenciadorTransacao gerenciador = GerenciadorTransacao.getInstancia();

        // Adicionando e executando transações
        gerenciador.adicionarTransacao(transacaoDecorada);
        gerenciador.realizarTransacoes();

        // Exemplo de uma nova transação
        proxy.realizarTransacao(500);
    }
}