

public class CadastroCliente {
	private String nome;
	private String ag; 
	private String conta;
	private String email;
	private String fone;
	private String saldo;
	
	// criando um método dentro da classe
	public void mensagem( String nome, String ag, String conta, String email, String fone, 	String saldo)  {
		this.nome=nome;
		this.ag=ag;
		this.conta=conta;
		this.email=email;
		this.fone=fone;
		this.saldo=saldo;
					
		//System.out.println(nome+ " "+ag+ " "+conta+ " "+saldo+ " "+fone+" "+email+" ");
				
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getAg() {
		return ag;
	}

	public void setAg(String ag) {
		this.ag = ag;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}

	public String getSaldo() {
		return saldo;
	}

	public void setSaldo(String saldo) {
		this.saldo = saldo;
	}
	
	
	 
			
	 
	 			
		
	}	
	


