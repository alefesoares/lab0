package lab00;

public class ObjectDisciplina {
	private String nome;
	private int id;
	private double nota;
	
	public ObjectDisciplina(String nome, int id,double nota) {
		this.nome = nome;
		this.id = id;
		this.nota = nota;
	}
	public ObjectDisciplina() {}

	public double getNota() {
		return nota;
	}
	public double setNota(int nota) {
		return this.nota;
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
	public String toString() {
		return "Id: " + this.id + "\n" + "Disciplina: " + this.nome +
				"\n" + "Likes: " + "\n" + " nota: " + this.nota;
	}
}


