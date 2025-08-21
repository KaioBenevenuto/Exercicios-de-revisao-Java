package exercicio7_agendamento;

public class Contato {
	private String nome, email;
	
	public void constructor(String nome, String email) {
		this.setEmail(email="");
		this.setNome(nome="");
		
	}
	
	public String getNome() {
		return nome;
		
	}
	public void setNome(String n) {
		nome = n;
	}
	
	public String getEmail() {
		return email;
		
	}
	public void setEmail(String e) {
		email = e;
	}
}
