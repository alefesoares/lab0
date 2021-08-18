package lab00;

import javax.swing.JOptionPane;


public class Telas {
	static Metodos metodos = new Metodos();
	public int menuPrincipalAdimin() {
		while (true){
			String opcao = JOptionPane.showInputDialog(
					  "1. ADICIONAR DISCIPLINA\n"
					+ "2. VER MEUS COMENTARIOS\n"
					+ "3. VER TODAS DISCIPLINAS\n"
					+ "5. ADICIONAR COMENTARIO\n"
					+ "5. ADICIONAR NOTA A DISCIPLINA\n"
					+ "6. GERENCIADOR\n"
					+ "7. SAIR");
			
			if (!opcao.equals("1") && !opcao.equals("2") && !opcao.equals("3") && 
					!opcao.equals("4") && !opcao.equals("5") && !opcao.equals("6") && !opcao.equals("7")){
				JOptionPane.showMessageDialog(null, "OPÇÃO INVÁLIDA!");
			} 
			else {
				return Integer.parseInt(opcao);	
			}
			
		}
	}
	public int telasMenuAdimn1() {
		 //adicionar disciplina
		String nome = JOptionPane.showInputDialog("Nome da disciplina");
		int id = Integer.parseInt(JOptionPane.showInputDialog("ID da disciplina"));
		if (metodos.disciplinasVazias()) {
			ObjectDisciplina disciplina = new ObjectDisciplina(nome,id,0);
			metodos.addDisciplina(disciplina);
			JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso");
		}else {
			if (metodos.verificaIdDisciplina(id)) {
				JOptionPane.showMessageDialog(null, "Já existe uma disciplina com esse ID");
			}else {
				ObjectDisciplina disciplina = new ObjectDisciplina(nome,id,0);
				metodos.addDisciplina(disciplina);
				JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso");
			}
		}
		return 0;
	
		
	}
	
	public int MenuGerenciador() {
	String opcao = JOptionPane.showInputDialog(
			 "1. RENOMEAR DISCIPLINA\n"
			+"2. REMOVER DISCIPLINA\n"
			+"3. REMOVER COMENTARIO\n"
			+"4. SAIR"
			
			
			
			);	
		
		return Integer.parseInt(opcao);		
	}
}
