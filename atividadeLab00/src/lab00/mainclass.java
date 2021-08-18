package lab00;

import javax.swing.JOptionPane;

public class mainclass {

	static Metodos metodos = new Metodos();
	static Telas tela = new Telas();
	
	public static void main(String[] args) {
		
		ObjectAluno alunoLogado;
		
		Object[] opcoes = { "LOGIN", "CADASTRAR"};
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
				
		while (true){
				int opcao = tela.menuPrincipalAdimin();
				if (opcao == 1) {tela.telasMenuAdimn1();}
				else if (opcao == 2) {metodos.listaComentariosAluno(alunoLogado);
				}
				else if (opcao == 3) {
					if (metodos.disciplinasVazias() == true) {
						JOptionPane.showMessageDialog(null, "Não há disciplinas cadastradas no sistema.");
						continue;
					}else {metodos.listaDisciplinas();
					}
				}				
				else if (opcao == 4) {
				ObjectDisciplina disciplina = metodos.escolherDisciplina();
				String texto =  JOptionPane.showInputDialog("Digite seu comentario");
					ObjectComentario comentario = new ObjectComentario(alunoLogado, texto, disciplina);
					metodos.addObjectComentario(comentario);
					JOptionPane.showMessageDialog(null,"Comentario cadastrado com sucesso!");
				}
				else if (opcao == 5) {
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


