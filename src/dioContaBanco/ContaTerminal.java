package dioContaBanco;
import java.util.Scanner;


public class ContaTerminal {

	public static void main(String[] args) throws Exception {
		// TODO: Classe Scanner / 	Variaveis
		Scanner banco = new Scanner(System.in);
			
		int numeroConta;
		String numeroAgencia;
		String nomeCliente;
		double saldo;
				
		// Exibir mensagens pro user
		System.out.println("Obrigado por nos escolher como seu banco favorito!");

		//Obter os valores do Scanner
		
		System.out.println("Por favor, Digite seu nome !");
			nomeCliente = banco.next();
		
		System.out.println("Por favor, digite o número da Agência !");
			numeroAgencia = banco.next();
		
		System.out.println("Por favor, digite o número da Conta !");
			numeroConta = banco.nextInt();
		
		System.out.println("Por favor, informe seu saldo !");
			saldo = banco.nextDouble();
		
		//Exibir mensagem final.
			
		System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + numeroAgencia + ", conta " + numeroConta + " e seu saldo "+ saldo +" já está disponível para saque.");
		banco.close();
	}

}
