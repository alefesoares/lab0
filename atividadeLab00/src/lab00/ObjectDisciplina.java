package lab00;

import java.util.ArrayList;

public class ObjectDisciplina {
	private String nome;
	private int id;
	private int likes;
	private int nota;
	private ArrayList<ObjectComentario> lista_comentarios = new ArrayList<ObjectComentario>();
	
	public ObjectDisciplina(String nome, int id,int nota) {
		this.nome = nome;
		this.id = id;
		this.likes = 0;
		this.nota = nota;
	}
	public ObjectDisciplina() {}

	public int getNota() {
		return nota;
	}
	public int setNota(int nota) {
		return this.nota += nota/10;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	// toString//
	public String toString() {
		return "Id: " + this.id + "\n" + "Disciplina: " + this.nome +
				"\n" + "Likes: " + this.likes + "\n" + " nota: " + this.nota;
	}
	/////////////
	public String getComentarios() {
		String text = "";
		for (ObjectComentario comentario : lista_comentarios) {
			text += comentario.toString() + "\n";
		}
		return text;
	}
	//Medodos//
	public void addObjectComentario(ObjectComentario _comentario) {
	lista_comentarios.add(_comentario);
	}
	
	public void addLike() {
		this.likes += 1;
	}
	
	public void removeLike() {
		this.likes -= 1;
	}
	///////////
}
