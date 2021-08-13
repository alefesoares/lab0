package lab00;

public class ObjectComentario {
	private ObjectAluno autor;
	private String texto;
	private ObjectDisciplina disciplina;
	
	public ObjectComentario(ObjectAluno autor, String texto, ObjectDisciplina disciplina) {
		this.autor = autor;
		this.texto = texto;
		this.disciplina = disciplina;
	}

	public ObjectAluno getAutor() {
		return autor;
	}

	public void setAutor(ObjectAluno autor) {
		this.autor = autor;
	}

	public String getTexto() {
		return texto;
	}

	public void setTexto(String texto) {
		this.texto = texto;
	}

	public ObjectDisciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(ObjectDisciplina disciplina) {
		this.disciplina = disciplina;
	}
	
	public String toString() {
		return this.autor + "\n" + this.texto;
	}
	
}
