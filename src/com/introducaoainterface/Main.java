package com.introducaoainterface;

import javax.swing.JOptionPane;

import com.introducaoainterface.domains.Aluno;
import com.introducaoainterface.interfaces.PermitirAcesso;

public class Main {

	public static void main(String[] args) {
		String usuario = JOptionPane.showInputDialog("Digite o usuário");
		String senha = JOptionPane.showInputDialog("Digite a senha: ");
		
		PermitirAcesso aluno1 = new Aluno(123456789, "6º D", "William", "M", "27");
		System.out.println(aluno1);
		
		
		if(new Aluno().autenticar(usuario, senha)) {
			JOptionPane.showMessageDialog(null, "Logado com sucesso!");
		}else {
			JOptionPane.showMessageDialog(null, "Erro na autenticação do usuário!");
		}
	}

}
