import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class JLogin {

	public static void main(String[] args) {
		
		LoginService obj = new Componente();
		vista(null, obj);
	}
	
	public static void vista(Object object, final LoginService loginService){
		
		JFrame frame = new JFrame();
		JPanel panel = new JPanel();
		JLabel lusuario= new JLabel("Usuario");
		JLabel lpassword= new JLabel("Password");
		
		final JTextField usuario = new JTextField(10);
		final JTextField password = new JTextField(10);
		JButton iniciar = new JButton("Login");
		
		iniciar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				boolean valor = loginService.validar(usuario.getText(), password.getText(), "la url de la base de datos");
				if(valor == true){
					JOptionPane.showMessageDialog(null, "Entroooooo");
				}
				else{
					
				}
				
			}
		});
		panel.add(lusuario);
		panel.add(usuario);
		panel.add(lpassword);
		panel.add(password);
		panel.add(iniciar);
		frame.setTitle("LOGIN");
		frame.setResizable(false);
		frame.setSize(150, 200);
		frame.add(panel);
		frame.getContentPane();
		frame.setVisible(true);
		
	}

}
