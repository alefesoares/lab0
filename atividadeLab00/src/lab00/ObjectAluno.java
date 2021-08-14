package lab00;

import java.util.ArrayList;

public class ObjectAluno {
	
	private String nome;
	private String email;
	private String senha;
	
	private ArrayList<ObjectComentario> lista_comentarios = new ArrayList<ObjectComentario>();
	
	public ObjectAluno(String nome, String email, String senha) {
		
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public String getComentarios() {
		String text = "";
		for (ObjectComentario comentario : lista_comentarios) {
			text += comentario.toString() + "\n";
		}
		return text;
	}
	public void addObjectComentario(ObjectComentario _comentario) {
	lista_comentarios.add(_comentario);
	
}
	public String toString() {
		return "Nome: " + this.nome + ", Email: " + this.email ;
	}
}
