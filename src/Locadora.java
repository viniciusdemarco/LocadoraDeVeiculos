import java.util.Scanner;

public class Locadora {
	public static void main(String[] args) {
		Carro uno = new Carro();
		uno.cor = "Cinza";
		uno.ano = 1998;
		uno.modelo = 1998;
		uno.placa = "ABC-1234";
		uno.preco = 30;
		uno.alugado = false;
		
		Cliente cliente1 = new Cliente();
		cliente1.nome = "Otávio Augusto Ricardo de Andrade";
		cliente1.cpf = "123.456.789-10";
		cliente1.cartaoDeCredito = "1111 2222 3333 4444";
		cliente1.alugar = true;
		
		System.out.println(" ======================");
		System.out.println("|Dados do veículo      |");
		System.out.println("|Cor: " + uno.cor+"            |");
		System.out.println("|Ano/Modelo: "+uno.ano+"/"+uno.modelo+" |");
		System.out.println("|Placa: "+uno.placa+"       |");
		System.out.println("|Preço: R$"+uno.preco+",00/dia    |");
		System.out.println(" =====================");
		if(uno.alugado)System.out.println("\n-Veículo indisponível.");
		else System.out.print("\n-Veículo disponível.\n\n-Digite 1 para adiquirir: ");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		System.out.print("-Dias a ser alugado: ");
		int dias = scan.nextInt();
		scan.close();
		int aluguel = dias*uno.preco;
		if(!cliente1.alugar && x==1) {
			System.out.println("\n =========================================================");
			System.out.println("|Veículo alugado!                                         |");
			System.out.println("|---------------------------------------------------------|\n|Dados do cliente                                         |");
			System.out.println("|Nome: "+cliente1.nome+"                  |");
			System.out.println("|CPF: "+cliente1.cpf+"                                      |");
			System.out.println("|Número do cartão de crédito: "+cliente1.cartaoDeCredito+"         |");
			System.out.println("|---------------------------------------------------------|\n|Dados do veículo                                         |");
			System.out.println("|Cor: " + uno.cor+"                                               |");
			System.out.println("|Ano/Modelo: "+uno.ano+"/"+uno.modelo+"                                    |");
			System.out.println("|Placa: "+uno.placa+"                                          |");
			System.out.println("|Valor: R$"+aluguel+",00                                          |");
			System.out.println(" =========================================================");
		}
		else System.out.println("O cliente: "+cliente1.nome+" já possui um veículo alugado.");
	}
}