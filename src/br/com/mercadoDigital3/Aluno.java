package br.com.mercadoDigital3;

public class Aluno {
	private String nome;
	private int idade;
	private String email;
	private String cpf;
	private String dataNascimento;
	private String nomeMae;
	private String nomePai;
	private String numeroCel;
	
	private int nota1;
	private int nota2;
	private int nota3;
	private int nota4;
	
	
	
	
	
	public int getNota1() {
		return nota1;
	}
	public void setNota1(int nota1) {
		this.nota1 = nota1;
	}
	public int getNota2() {
		return nota2;
	}
	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}
	public int getNota3() {
		return nota3;
	}
	public void setNota3(int nota3) {
		this.nota3 = nota3;
	}
	public int getNota4() {
		return nota4;
	}
	public void setNota4(int nota4) {
		this.nota4 = nota4;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public String getNomeMae() {
		return nomeMae;
	}
	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}
	public String getNomePai() {
		return nomePai;
	}
	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}
	public String getNumeroCel() {
		return numeroCel;
	}
	public void setNumeroCel(String numeroCel) {
		this.numeroCel = numeroCel;
	}
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", email= \n" + email + ", cpf=" + cpf + ", dataNascimento="
				+ dataNascimento + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai + ", numeroCel=" + numeroCel + "]";
	}
	
	
	
	public double mediaAluno() {
		return (nota1 + nota2 + nota3 + nota4) /4;
	}
	
	public boolean alunoAprovado () {
		
		double media = this.mediaAluno();
		
	    if (media >= 70) {
	    	return true;
	    }else {
	    	return false;
	    }
			
	}
	
}
