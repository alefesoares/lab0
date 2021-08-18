package lab00;

import java.util.ArrayList;

public class BancoDados {

	private ArrayList<ObjectAluno> lista_alunos = new ArrayList<ObjectAluno>();
	private ArrayList<ObjectDisciplina> lista_disciplinas = new ArrayList<ObjectDisciplina>();
	private ArrayList<ObjectComentario> lista_comentarios = new ArrayList<ObjectComentario>();
	
	public BancoDados() {
		ObjectAluno a = new ObjectAluno("alefe", "alefe@","1234");lista_alunos.add(a);
		ObjectDisciplina b = new ObjectDisciplina("desenvolvimento de sistema corporativos",1,0); lista_disciplinas.add(b);
	}
	
	public ArrayList<ObjectAluno> getLista_alunos() {
		return lista_alunos;
	}

	public ArrayList<ObjectDisciplina> getLista_disciplinas() {
		return lista_disciplinas;
	}
	
	public ArrayList<ObjectComentario> getLista_comentarios(){
		return lista_comentarios;
	}
	public void addObjectComentario(ObjectComentario _comentario) {
		lista_comentarios.add(_comentario);
	}
}
