package com.prueba.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import com.prueba.utils.Files;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;

import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.io.*;

public class retiro extends JFrame {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTable table;
	
	//Label que almacena la ruta del archivo CSV
	private static JTextField txtUih;
	
	
	
	private JButton btnCargarFile;
	private JTable table_1;
	private JLabel lblCargaExitosaO;
	private JLabel lblHola;
	private static JButton btnExportFiles;
	//Boton
	private static JComboBox<String> comboBox;
	

	private Files rutaProyect = new Files();
	static retiro frame = new retiro();
	modalCargaFiles mocF = modalCargaFiles.getModalCargarInstance();
	modalExportalCSV moE = modalExportalCSV.getModalExportalCSVInstance();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public retiro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 701, 487);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(245, 245, 245));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		table_1 = new JTable();
		table_1.setBounds(360, 160, 1, 1);
		contentPane.add(table_1);

		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(0, 442, 151, -11);
		contentPane.add(lblNewLabel_1);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 684, 67);
		contentPane.add(panel);
		panel.setLayout(null);

		lblHola = new JLabel("");
		lblHola.setIcon(new ImageIcon(
				"C:\\Users\\Administrador\\Documents\\projects\\CargaDatos\\resources\\img\\bancompartir.png"));
		lblHola.setBounds(10, 0, 207, 62);
		panel.add(lblHola);

		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBounds(10, 90, 664, 341);
		contentPane.add(panel_1);
		panel_1.setLayout(null);

		comboBox = new JComboBox<String>();
		comboBox.setBounds(10, 24, 177, 26);
		panel_1.add(comboBox);
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel<String>(new String[] {"Corriente", "Ahorro" }));

		txtUih = new JTextField();
		// txtUih.setText(fileName);
		txtUih.setEditable(false);
		txtUih.setBackground(new Color(255, 255, 224));
		txtUih.setBounds(197, 26, 224, 26);
		panel_1.add(txtUih);
		txtUih.setColumns(10);

		JButton btnUploadFile = new JButton("Upload File");
		btnUploadFile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				
			}
		});

		// Evento del mouse del boton de subir archivo
		btnUploadFile.addMouseListener(new MouseAdapter() {

			// INICIO DEL METODO DE COPAIDO DE ARCHIVOS
			@Override
			public void mouseClicked(MouseEvent e) {
				String[] f = new String[2];

				// este es para obtener la ruta del proyecto , abrir el explorador de archivos
				try {
					f = rutaProyect.openfolders();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				txtUih.setText(f[1]);

				// llamar el metodo para obtener la ruta del proyecto
				try {
					rutaProyect.createfolder();
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}

				if (!txtUih.getText().equals("")) {
					btnCargarFile.setEnabled(true);
				} else {
					btnCargarFile.setEnabled(false);
				}
				
//				if (!txtUih.getText().equals("")) {
//					btnExportFiles.setEnabled(true);
//				} else {
//					btnExportFiles.setEnabled(false);
//				}

			}

			// FIN DEL METODO

		}); // fin Evento del mouse del boton de subir archivo

		btnUploadFile.setBounds(430, 24, 97, 26);
		panel_1.add(btnUploadFile);
		btnUploadFile.setBackground(new Color(207, 0, 19));
		btnUploadFile.setBorderPainted(false);
		btnUploadFile.setForeground(Color.WHITE);

		btnCargarFile = new JButton("Load File");
		btnCargarFile.setEnabled(false);
		

		btnCargarFile.addActionListener(new ActionListener() {

			// CONOCER SI EL BOTON SE PULSO MAS DE UNA VEZ
			public void actionPerformed(ActionEvent e) {
				if (e.getSource().equals(btnCargarFile)) {
					//Validar OkButton
				}
			}
		});
		btnCargarFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				if (btnCargarFile.isEnabled() == true) {
					
					mocF.setVisible(true);
					mocF.setLocationRelativeTo(txtUih);
					
					//Si el modal esta habiero inhabilita el jframe.
					if (mocF.isShowing()) {
						frame.setEnabled(false);
						
						//System.out.println("Esta abierto");
					}
				}

			}
		});
		btnCargarFile.setBounds(536, 24, 97, 26);
		panel_1.add(btnCargarFile);
		btnCargarFile.setBackground(new Color(207, 0, 19));
		btnCargarFile.setForeground(Color.WHITE);

		table = new JTable();
		table.setBounds(10, 63, 625, 227);
		panel_1.add(table);
		table.setBackground(Color.LIGHT_GRAY);

		lblCargaExitosaO = new JLabel("Carga exitosa o incorrecta ...");
		lblCargaExitosaO.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCargaExitosaO.setBounds(10, 292, 499, 14);
		panel_1.add(lblCargaExitosaO);
		btnExportFiles = new JButton("Export Files");
		btnExportFiles.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				moE.setVisible(true);
				moE.setLocationRelativeTo(txtUih);
				retiro.this.setEnabled(false);
				}
		});
		btnExportFiles.setForeground(Color.WHITE);
		btnExportFiles.setBackground(new Color(93, 153, 255));
		btnExportFiles.setBounds(504, 299, 128, 23);
		panel_1.add(btnExportFiles);
	}


	
	//Get y set para setiar tipo Cuenta
	public static JComboBox<String> getComboBox() {
		return comboBox;
	}


	
	//Get y set label que almacena la ruta del archivo CSV
	
	public static JTextField getTxtUih() {
		return txtUih;
	}


	//Get y Set para el btnExportFile.
	public static JButton getBtnExportFiles() {
		return btnExportFiles;
	}
	
	
}
