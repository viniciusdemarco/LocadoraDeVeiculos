class Carro {
	String placa;
	String cor;
	int modelo;
	int ano;
	int preco;
	boolean alugado;
	
	void alterarPlaca(String placa) {
		this.placa=placa;
	}
	
	void alterarPreco(int preco) {
		this.preco=preco;
	}
	
	void alterarCor(String cor) {
		this.cor = cor;
	}
	
	void informarModelo(int modelo) {
		this.modelo = modelo;
	}
	
	void informarAno( int ano) {
		this.ano = ano;
	}
}
