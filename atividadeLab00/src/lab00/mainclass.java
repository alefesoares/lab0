package lab00;

import javax.swing.JOptionPane;

public class mainclass {

	static Metodos metodos = new Metodos();
	
	@SuppressWarnings("null")
	public static void main(String[] args) {
		
		ObjectAluno alunoLogado;
		ObjectComentario comentario = null;
		
		
		Object[] opcoes = { "FAZER LOGIN", "SE CADASTRAR"};
		int operacao = JOptionPane.showOptionDialog(null, "Bem-vindo!", "Sistema de Avaliação de Disciplinas",
				JOptionPane.DEFAULT_OPTION, 1, null, opcoes, opcoes[0]);
		
		if (operacao == 0) {
			String email = JOptionPane.showInputDialog("Digite seu email");
			String senha = JOptionPane.showInputDialog("Digite sua senha");
			alunoLogado = metodos.logar(email, senha);
			if (alunoLogado == null) {
				JOptionPane.showMessageDialog(null, "Falha no login!");
			}
			else {
				JOptionPane.showMessageDialog(null, "Bem vindo,  " + alunoLogado.getNome().split(" ")[0] + "!");
		while (true){
				int opcao = metodos.menuPrincipal();
				
				if (opcao == 1) { //adicionar disciplina
					String nome = JOptionPane.showInputDialog("Nome da disciplina");
					int id = Integer.parseInt(JOptionPane.showInputDialog("ID da disciplina"));
					if (metodos.disciplinas_vazias()) {
						ObjectDisciplina disciplina = new ObjectDisciplina(nome,id, 0);
						metodos.addDisciplina(disciplina);
						JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso");
						continue;
					}else {
						if (metodos.verificaIdDisciplina(id)) {
							JOptionPane.showMessageDialog(null, "Já existe uma disciplina com esse ID");
						}else {
							ObjectDisciplina disciplina = new ObjectDisciplina(nome,id,0);
							metodos.addDisciplina(disciplina);
							JOptionPane.showMessageDialog(null, "Disciplina cadastrada com sucesso");
							continue;
						}
					}
				}
				else if (opcao == 2) {metodos.escolherDisciplina();
				
				}
				//
				else if (opcao == 3) {
					if (metodos.disciplinas_vazias() == true) {
						JOptionPane.showMessageDialog(null, "Não há disciplinas cadastradas no sistema.");
						continue;
					}else {metodos.listaDisciplinas();
					}
				}				
				else if (opcao == 4) {
				}
				else if (opcao == 5) {
				ObjectDisciplina disciplina = metodos.escolherDisciplina();
				String texto =  JOptionPane.showInputDialog("Digite seu comentario");
					comentario.setAutor(alunoLogado);
					comentario.setDisciplina(disciplina);
					comentario.setTexto(texto);
					alunoLogado.addObjectComentario(comentario);
				}
				else {
					break;
				}
			}
		}
		if (operacao == 1) {		
			String _nome = JOptionPane.showInputDialog("Digite seu nome");
			String _email = JOptionPane.showInputDialog("Digite seu email");
		boolean existe = metodos.verificaEmail(_email);
		if (existe) JOptionPane.showMessageDialog(null, "Email já cadastrada!");
			else {
				String _senha = JOptionPane.showInputDialog(null, "Digite uma senha.");
		ObjectAluno _aluno = new ObjectAluno(_nome, _email, _senha);
				metodos.addAluno(_aluno);
				JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");	
			}
		}else {
		}
		}
		
		
		
		
	}


}


