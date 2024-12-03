
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;


class LoginButtonListener implements ActionListener {
	
	
	public void actionPerformed(ActionEvent e) {
		System.out.println("Action event was activited.");
	}
	
	
	
}


public class LoginWindow extends JFrame {

	JLabel userNameLabel;
	JLabel user_PWD_Label; 								// PWD = Password
	JTextField userNameText;
	JPasswordField user_PWD_Text;
	JButton loginButton;
	JButton cancelButton;

	public LoginWindow() {
		
		//Window settings:
		
		super("Login");
		setBounds(80, 60, 800, 600);
		setVisible(true);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(null);
		
		//Window elements settings:
		
		userNameLabel = new JLabel("User name:");
		add(userNameLabel);
		userNameLabel.setBounds(80, 60, 120, 30);
		
		userNameText = new JTextField();
		add(userNameText);
		userNameText.setBounds(200, 60, 300, 30);
		
		user_PWD_Label = new JLabel("Password:");
		add(user_PWD_Label);
		user_PWD_Label.setBounds(80, 160, 120, 30);
		
		user_PWD_Text = new JPasswordField();
		add(user_PWD_Text);
		user_PWD_Text.setBounds(200, 160, 300, 30);
		
		loginButton = new JButton("Login");
		add(loginButton);
		loginButton.setBounds(80, 260, 100, 50);
		
		cancelButton = new JButton("Exit");
		add(cancelButton);
		cancelButton.setBounds(260, 260, 100, 50);
		
		//Event settings:
		LoginButtonListener l = new LoginButtonListener();
		loginButton.addActionListener(l);
		
	}

	public static void main(String[] args) {
		new LoginWindow();
	}

}
