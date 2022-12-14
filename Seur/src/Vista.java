import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JRadioButton;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Vista {

	private JFrame frmCalculadora;
	private JTextField textOrigen;
	private JTextField textDestino;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista window = new Vista();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Vista() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora envios");
		frmCalculadora.setBounds(100, 100, 512, 468);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblNewLabel = new JLabel("Ciudad Origen:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblCiudadDestino = new JLabel("Ciudad Destino:");
		lblCiudadDestino.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblTipoDeEnvio = new JLabel("Tipo de envío:");
		lblTipoDeEnvio.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JLabel lblTipo = new JLabel("Tipo:");
		lblTipo.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		textOrigen = new JTextField();
		textOrigen.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textOrigen.setColumns(10);
		
		textDestino = new JTextField();
		textDestino.setFont(new Font("Tahoma", Font.PLAIN, 14));
		textDestino.setColumns(10);
		
		JRadioButton rdbtNacionalO = new JRadioButton("Nacional");
		rdbtNacionalO.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtNacionalO.setSelected(true);

		JRadioButton rdbtnExtranjeroO = new JRadioButton("Extranjero");
		rdbtnExtranjeroO.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JRadioButton rdbtNacionalD = new JRadioButton("Nacional");
		rdbtNacionalD.setFont(new Font("Tahoma", Font.BOLD, 14));
		rdbtNacionalD.setSelected(true);
		
		JRadioButton rdbtnExtranjeroD = new JRadioButton("Extranjero");
		rdbtnExtranjeroD.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Paq 10 - Antes de las 10 h ", "Paq 24 - Al día siguiente"}));
		
		JSpinner spinner = new JSpinner();
		spinner.setModel(new SpinnerNumberModel(1, 1, 25, 1));
		spinner.setFont(new Font("Tahoma", Font.PLAIN, 14));
		
		JLabel lblKg = new JLabel("Kg");
		lblKg.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		JButton btnCalcular = new JButton("Calcular Precio");
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String sCiudadOr = textOrigen.getText();
				String sCiudadDe = textDestino.getText();
				String sTipoE = comboBox.getSelectedItem().toString(); 
				int nPeso = (Integer)spinner.getValue();
			}
		});
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD, 14));
		
		
		
		
		ButtonGroup grupoOrigen = new ButtonGroup();
		grupoOrigen.add(rdbtNacionalO);
		grupoOrigen.add(rdbtnExtranjeroO);
		ButtonGroup grupoDestino = new ButtonGroup();
		grupoOrigen.add(rdbtNacionalD);
		grupoOrigen.add(rdbtnExtranjeroD);

		
		GroupLayout groupLayout = new GroupLayout(frmCalculadora.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addContainerGap()
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addComponent(lblNewLabel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
								.addComponent(lblCiudadDestino)
								.addComponent(lblTipoDeEnvio)
								.addComponent(lblTipo))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtNacionalD, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnExtranjeroD, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(rdbtNacionalO, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnExtranjeroO, GroupLayout.PREFERRED_SIZE, 103, GroupLayout.PREFERRED_SIZE))
								.addGroup(groupLayout.createSequentialGroup()
									.addComponent(spinner, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblKg, GroupLayout.PREFERRED_SIZE, 101, GroupLayout.PREFERRED_SIZE))
								.addComponent(textDestino, GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
								.addComponent(textOrigen)
								.addComponent(comboBox, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
						.addGroup(groupLayout.createSequentialGroup()
							.addGap(225)
							.addComponent(btnCalcular)))
					.addContainerGap(86, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(69)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(textOrigen, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(9)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(rdbtNacionalO)
						.addComponent(rdbtnExtranjeroO, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(lblCiudadDestino, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
							.addGap(71)
							.addComponent(lblTipoDeEnvio, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(textDestino, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
							.addGap(18)
							.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addComponent(rdbtNacionalD, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE)
								.addComponent(rdbtnExtranjeroD, GroupLayout.PREFERRED_SIZE, 25, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
							.addComponent(comboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addGap(18)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTipo, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
						.addComponent(spinner, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblKg, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE))
					.addGap(40)
					.addComponent(btnCalcular)
					.addContainerGap(79, Short.MAX_VALUE))
		);
		frmCalculadora.getContentPane().setLayout(groupLayout);
	}
}
