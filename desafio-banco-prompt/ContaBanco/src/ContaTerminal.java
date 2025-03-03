import java.util.Scanner;

public class ContaTerminal {
    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo;

    public ContaTerminal(Integer numero, String agencia, String nomeCliente, Double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.saldo = saldo;
    }

    public Integer getNumero() {
        return this.numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu numero de conta:");
        Integer numero = scanner.nextInt();
        scanner.reset();
        
        System.out.println("Digite a sua agencia:");
        String agencia = scanner.next().trim();
        scanner.reset();

        System.out.println("Digite o seu nome:");
        String nome = scanner.next().toUpperCase().trim();
        scanner.reset();

        System.out.println("Digite o seu saldo:");
        Double saldo = scanner.nextDouble();
        scanner.close();

        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, nome, saldo);
        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", contaTerminal.getNomeCliente(), contaTerminal.getAgencia(), contaTerminal.getNumero(), contaTerminal.getSaldo());
    }
}
