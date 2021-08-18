package lab00;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos {
	
	BancoDados BD = new BancoDados();
	
	public void listaComentariosAluno(ObjectAluno _aluno) {
	ArrayList<ObjectComentario> listaComentarios = BD.getLista_comentarios();
	ObjectComentario comentario = new ObjectComentario(null, null, null);
	if (listaComentarios.size() == 0) {JOptionPane.showMessageDialog(null,"Não a comentarios cadastrados!");}
	else {
	for (int k = 0; k < listaComentarios.size(); k++) {
		comentario=listaComentarios.get(k);
		if (_aluno == comentario.getAutor()) {
			JOptionPane.showMessageDialog(null, comentario.getTexto());
		}
	}
	}	
	}
	public void addObjectComentario(ObjectComentario _comentario) {
		BD.addObjectComentario(_comentario);
		}
	public ObjectDisciplina escolherDisciplina() {
		ArrayList<ObjectDisciplina> listaDisciplinas = BD.getLista_disciplinas();
		Object[] disciplinas = new Object[listaDisciplinas.size()];
		for (int k = 0; k < listaDisciplinas.size(); k++) { disciplinas[k] = listaDisciplinas.get(k); }
		Object valorSelecionado = JOptionPane.showInputDialog(null, "Escolha a disciplina", 
				"Opção", JOptionPane.INFORMATION_MESSAGE, null, disciplinas, disciplinas[0]);
		return (ObjectDisciplina) valorSelecionado;
	}
	public boolean SemAlunos() {
		if (BD.getLista_alunos().size() == 0) {
			return true;
		}return false;
		}
		
	public boolean disciplinasVazias() {
		if (BD.getLista_disciplinas().size() == 0) {
			return true;
		}return false;
	}
	
	public boolean verificaEmail(String email) {
		for (ObjectAluno a : BD.getLista_alunos()) {
			if (a.getEmail() == email) {
				return true;
			}
		}return false;
	}
	public void addAluno(ObjectAluno _a) {
		BD.getLista_alunos().add(_a);
	}
	public void addDisciplina(ObjectDisciplina _d) {
		BD.getLista_disciplinas().add(_d);
	}
	public ObjectAluno logar(String email, String senha){
		for (ObjectAluno a : BD.getLista_alunos()) {
			if (a.getEmail().equals(email) && a.getSenha().equals(senha)) {
				return a;
			}
		}return null;
	}
	public boolean verificaIdDisciplina(int id) {
		for (ObjectDisciplina d : BD.getLista_disciplinas()) {
			if (d.getId() == id) {
				return true;
			}
		}return false;
	}
	public ObjectDisciplina listaDisciplinas() {
		ArrayList<ObjectDisciplina> listaDisciplinas = BD.getLista_disciplinas();
		Object[] disciplinas = new Object[listaDisciplinas.size()];
		for (int k = 0; k < listaDisciplinas.size(); k++) { 
			disciplinas[k] = listaDisciplinas.get(k); 
			JOptionPane.showMessageDialog(null, listaDisciplinas);
			}return null;
	}
	

}
