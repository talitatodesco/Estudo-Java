package projetojava;

import javax.swing.JButton;
import javax.swing.JFrame;


public class Layouts extends JFrame{
	
	public Layouts(){
		
	super("Meu Layout!");
	
	getContentPane().add(new JButton("BOTÃO CENTRALIZADO!"));
	
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setSize(300,300);
	setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new Layouts();
	}
}
