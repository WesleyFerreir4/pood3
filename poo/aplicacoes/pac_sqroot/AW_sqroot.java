package pac_sqroot;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextArea;
import java.awt.SystemColor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AW_sqroot {

	private JFrame frame;
	private JTextField txtnum;
	private JTextField txtrq;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AW_sqroot window = new AW_sqroot();
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
	public AW_sqroot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 397, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JTextArea txtrRaizQuadrada = new JTextArea();
		txtrRaizQuadrada.setEditable(false);
		txtrRaizQuadrada.setFont(new Font("Tahoma", Font.BOLD, 20));
		txtrRaizQuadrada.setBackground(SystemColor.control);
		txtrRaizQuadrada.setText("Raiz Quadrada");
		txtrRaizQuadrada.setBounds(114, 11, 154, 29);
		frame.getContentPane().add(txtrRaizQuadrada);
		
		JTextArea txtrRaizQuadrada_1 = new JTextArea();
		txtrRaizQuadrada_1.setEditable(false);
		txtrRaizQuadrada_1.setText("Raiz Quadrada");
		txtrRaizQuadrada_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtrRaizQuadrada_1.setBackground(SystemColor.menu);
		txtrRaizQuadrada_1.setBounds(10, 79, 154, 29);
		frame.getContentPane().add(txtrRaizQuadrada_1);
		
		JTextArea txtrRaizQuadrada_1_1 = new JTextArea();
		txtrRaizQuadrada_1_1.setEditable(false);
		txtrRaizQuadrada_1_1.setText("Raiz Quadrada");
		txtrRaizQuadrada_1_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtrRaizQuadrada_1_1.setBackground(SystemColor.menu);
		txtrRaizQuadrada_1_1.setBounds(10, 138, 154, 29);
		frame.getContentPane().add(txtrRaizQuadrada_1_1);
		
		JButton btncalc = new JButton("Calcular");
		btncalc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				sqroot raiz = new sqroot();
				raiz.num = Integer.parseInt(txtnum.getText());
				raiz.CalcularRQ();
				txtrq.setText(String.valueOf(raiz.raizq));
			}
		});
		btncalc.setFont(new Font("Tahoma", Font.PLAIN, 18));
		btncalc.setBounds(133, 201, 114, 34);
		frame.getContentPane().add(btncalc);
		
		txtnum = new JTextField();
		txtnum.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtnum.setBounds(220, 83, 48, 29);
		frame.getContentPane().add(txtnum);
		txtnum.setColumns(10);
		
		txtrq = new JTextField();
		txtrq.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtrq.setEditable(false);
		txtrq.setBounds(220, 142, 140, 29);
		frame.getContentPane().add(txtrq);
		txtrq.setColumns(10);
	}
}
