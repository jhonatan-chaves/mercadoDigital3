package br.com.mercadoDigital3;

import javax.swing.JOptionPane;

public class AppMercado3 {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno();
		
		
	    String nome = JOptionPane.showInputDialog( "qual o seu nome? ");
	  /*  String idade = JOptionPane.showInputDialog("qual a sua idade? ");
	    Integer number = Integer.valueOf(idade);
	    String email = JOptionPane.showInputDialog("qual o seu E-mail? ");	 
	    String cpf = JOptionPane.showInputDialog("qual o seu CPF? ");
	    String dataNascimento = JOptionPane.showInputDialog("qual a sua data de nascimento? ");
	    String nomeMae = JOptionPane.showInputDialog("qual o nome da sua mãe? ");
	    String nomePai = JOptionPane.showInputDialog("qual o nome do seu pai? ");
	    String numeroCel = JOptionPane.showInputDialog("qual o seu numero de celular? ");
	   */ 
	    
	    
	    
	    
		
		aluno1.setNome(nome);
		/*aluno1.setIdade(number);
		aluno1.setEmail(email);
		aluno1.setCpf(cpf);
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setNumeroCel(numeroCel);
		*/
		aluno1.setNota1(60);
		aluno1.setNota2(90);
		aluno1.setNota3(80);
		aluno1.setNota4(88);
		
		System.out.println(aluno1.mediaAluno());
		
		
		System.out.println(aluno1.toString());
		System.out.println((aluno1.alunoAprovado() ? "aprovado" : "reprovado"));
		
		

	}

}
