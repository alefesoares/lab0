package lab00;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Metodos {
	
	BancoDados BD = new BancoDados();

	public ObjectDisciplina discMaisCurtida() {
		int maisLikes = 0;
		ObjectDisciplina disciplina = new ObjectDisciplina();
		for (ObjectDisciplina d : BD.getLista_disciplinas()) {
			if (d.getLikes() > maisLikes) {
				maisLikes = d.getLikes();
				disciplina = d;		
			}
		}
		return disciplina;
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
		
	public boolean disciplinas_vazias() {
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
	public int menuPrincipal() {
		while (true){
			String op = JOptionPane.showInputDialog("MENU\n\n"
					+ "1. ADICIONAR DISCIPLINA\n"
					+ "2. AVALIAR DISCIPLINA\n"
					+ "3. VER TODAS DISCIPLINAS\n"
					+ "4. MINHAS AVALIAÇÕES\n"
					+ "5. SAIR");
			
			if (!op.equals("1") && !op.equals("2") && !op.equals("3") && !op.equals("4") && !op.equals("5")) {
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
			}else {
				return Integer.parseInt(op);
			}
			
			
		}
	}

	
}
