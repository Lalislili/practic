package practicas;
import java.text.DecimalFormat;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Toolkit;

public class Lachicharonera 
{

	
	private JFrame frmLaChicharonera;
	private JTextField txtA;
	private JTextField txtB;
	private JTextField txtC;
	private JLabel lblX1;
	private JLabel lblX2;
	private JButton btnBorrar;
	private JButton btnCalcular;
	private JLabel lblNewLabel_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args)
	{
		EventQueue.invokeLater(new Runnable()
		{
			public void run() 
			{
				try {
					Lachicharonera window = new Lachicharonera();
					window.frmLaChicharonera.setVisible(true);
				}
				catch (Exception e) 
				{
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Lachicharonera() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmLaChicharonera = new JFrame();
		frmLaChicharonera.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Alumno\\Downloads\\formula-general.png"));
		frmLaChicharonera.getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 14));
		frmLaChicharonera.setTitle("La chicharonera");
		frmLaChicharonera.setBounds(100, 100, 731, 357);
		frmLaChicharonera.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmLaChicharonera.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("A");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel.setBounds(10, 11, 53, 26);
		frmLaChicharonera.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("B");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_1.setBounds(10, 50, 53, 26);
		frmLaChicharonera.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("C");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_2.setBounds(10, 87, 53, 26);
		frmLaChicharonera.getContentPane().add(lblNewLabel_2);
		
		txtA = new JTextField();
		txtA.setBounds(73, 16, 132, 20);
		frmLaChicharonera.getContentPane().add(txtA);
		txtA.setColumns(10);
		
		txtB = new JTextField();
		txtB.setBounds(73, 53, 132, 20);
		frmLaChicharonera.getContentPane().add(txtB);
		txtB.setColumns(10);
		
		txtC = new JTextField();
		txtC.setBounds(73, 92, 132, 20);
		frmLaChicharonera.getContentPane().add(txtC);
		txtC.setColumns(10);
		
		btnCalcular = new JButton("CALCULAR");
		btnCalcular.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e) 
			{
				DecimalFormat mi=new DecimalFormat("#.00");
			   try 
			   {
				   double a=Double.parseDouble(txtA.getText());
				   double b=Double.parseDouble(txtB.getText());
				   double c=Double.parseDouble(txtC.getText());
				   
				   double factor=(b*b)-(4*a*c);
				   if (factor==0) 
				   {
					   
					   double res=(-b-Math.sqrt((b*b)-4*(a*c))/2*a);
					  
					   lblX1.setText("X1= "+mi.format(res));
				   }
				   else if(factor>0) 
				   {
					   double res=(-b-Math.sqrt((b*b)-4*(a*c))/2*a);
					   double respu=(-b+Math.sqrt((b*b)-4*(a*c))/2*a);
					   lblX1.setText(" X1= "+mi.format(res));
					   lblX2.setText(" X2= "+mi.format(respu));
				   }
				   else if (factor<0) 
				   {
					   lblX1.setText(" No hay solucion");
				   }
			   }
			   catch(Exception e1)
			   {
			     e1.printStackTrace();
			   JOptionPane.showMessageDialog( null,"error" );
			   }
				
			}
		});
		btnCalcular.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnCalcular.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnCalcular.setBounds(10, 138, 108, 39);
		frmLaChicharonera.getContentPane().add(btnCalcular);
		
		btnBorrar = new JButton("BORRAR");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				txtA.setText(null);
				txtB.setText(null);
				txtC.setText(null);
			}
		});
		btnBorrar.setBorder(new LineBorder(new Color(0, 0, 0)));
		btnBorrar.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnBorrar.setBounds(144, 138, 101, 39);
		frmLaChicharonera.getContentPane().add(btnBorrar);
		
		lblX1 = new JLabel("X1");
		lblX1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblX1.setBounds(17, 202, 228, 45);
		frmLaChicharonera.getContentPane().add(lblX1);
		
		lblX2 = new JLabel("X2");
		lblX2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblX2.setBounds(17, 258, 228, 36);
		frmLaChicharonera.getContentPane().add(lblX2);
		
		lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\Alumno\\Downloads\\formula-general.png"));
		lblNewLabel_3.setBounds(247, 0, 458, 318);
		frmLaChicharonera.getContentPane().add(lblNewLabel_3);
	}
}
