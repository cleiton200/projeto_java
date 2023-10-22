package cofrinho;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Cofre c = new Cofre();
		Scanner teclado = new Scanner(System.in);
		int opcao;
		
		do {
		System.err.println("Cofrinho:");
		System.err.println("1 - Adicionar Moeda: ");
		System.err.println("2 - Remover Moeda: ");
		System.err.println("3 - Consultar Moedas: ");
		System.err.println("4 - Calcular o o total que há no cofrinho: ");
		System.err.println("0 - Encerrar o programa");
		opcao = teclado.nextInt();

		switch (opcao) {
		
		case 1:
			System.out.println("Qual a moeda que voce deseja inserir? ");
			System.out.println("1 - Real ");
			System.out.println("2 - Dolar ");
			System.out.println("3 - Euro");
			int operacao = teclado.nextInt();  
			 
			
			if (operacao == 1){
				System.out.println("Qual o valor de reais que você quer adicionar? ");
				double valor = teclado.nextDouble();
				c.addMoeda(new Real(valor));
				System.out.println("valor adicionado");
			}
			else if(operacao == 2) {
				System.out.println("Qual o valor de dolar que você quer adicionar? ");
				double valor = teclado.nextDouble();
				c.addMoeda(new Dolar(valor));
				System.out.println("valor adicionado");
			}
			else if(operacao == 3) {
				System.out.println("Qual o valor de euro que você quer adicionar? ");
				double valor = teclado.nextDouble();
				c.addMoeda(new Euro(valor));
				System.out.println("valor adicionado");
			
			}
			else  {
				System.out.println("Operação inválida!");
			}
			break;
		
		case 2:
			System.out.println("Qual a moeda que voce deseja Remover? ");
			System.out.println("1 - Real ");
			System.out.println("2 - Dolar ");
			System.out.println("3 - Euro");
			int remove = teclado.nextInt();  
			
			if (remove == 1){
				System.out.println("Qual o valor de reais que você quer remover? ");
				double valor = teclado.nextDouble();
				c.Remover(new Real(valor));
				System.out.println("valor removido");
			}
			else if(remove == 2) {
				System.out.println("Qual o valor de dolar que você quer remover? ");
				double valor = teclado.nextDouble();
				c.Remover(new Dolar(valor));
				System.out.println("valor removido");
			}
			else if(remove == 3) {
				System.out.println("Qual o valor de euro que você quer removerr? ");
				double valor = teclado.nextDouble();
				c.Remover(new Euro(valor));
				System.out.println("valor removido");
			}
			else {
				System.out.println("Operação inválida!");
			}
			
			break;
		case 3:
			c.infoCofre();
			break;
		case 4:
			System.out.println(c.Converter());
			break;
		case 0:
			return;
		default :
			System.out.println("Opcção invalida");
			break;
			}
		}while(opcao!=0);
	}
}