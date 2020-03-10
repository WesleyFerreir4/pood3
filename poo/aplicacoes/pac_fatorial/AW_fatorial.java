package pac_fatorial;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AW_fatorial {

	private JFrame frame;
	private JTextField txtnum;
	private JTextField txtfat;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AW_fatorial window = new AW_fatorial();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public AW_fatorial() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 303, 286);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrFatorial = new JTextArea();
		txtrFatorial.setEditable(false);
		txtrFatorial.setBackground(SystemColor.control);
		txtrFatorial.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtrFatorial.setText("Fatorial");
		txtrFatorial.setBounds(95, 11, 86, 29);
		frame.getContentPane().add(txtrFatorial);
		
		JTextArea txtrNmero = new JTextArea();
		txtrNmero.setEditable(false);
		txtrNmero.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtrNmero.setBackground(SystemColor.control);
		txtrNmero.setText("N\u00FAmero");
		txtrNmero.setBounds(23, 81, 79, 29);
		frame.getContentPane().add(txtrNmero);
		
		JTextArea txtrFatorial_1 = new JTextArea();
		txtrFatorial_1.setEditable(false);
		txtrFatorial_1.setText("Fatorial");
		txtrFatorial_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtrFatorial_1.setBackground(SystemColor.menu);
		txtrFatorial_1.setBounds(23, 139, 79, 29);
		frame.getContentPane().add(txtrFatorial_1);
		
		JButton btncalc = new JButton("Calcular");
		btncalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Fatorial b = new Fatorial();
				b.num = Integer.parseInt(txtnum.getText());
				b.calcfat();
				txtfat.setText(String.valueOf(b.fat));
			}
		});
		btncalc.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btncalc.setBounds(95, 203, 89, 23);
		frame.getContentPane().add(btncalc);
		
		txtnum = new JTextField();
		txtnum.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtnum.setBounds(189, 89, 65, 20);
		frame.getContentPane().add(txtnum);
		txtnum.setColumns(10);
		
		txtfat = new JTextField();
		txtfat.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtfat.setEditable(false);
		txtfat.setColumns(10);
		txtfat.setBounds(129, 147, 125, 20);
		frame.getContentPane().add(txtfat);
	}

}
