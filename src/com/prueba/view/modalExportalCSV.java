package com.prueba.view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFileChooser;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.prueba.controller.ExportController;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JTextField;

@SuppressWarnings("deprecation")
public class modalExportalCSV extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static modalExportalCSV modalExportalCSVInstance;
	private JTextField textPath;
	JComboBox<String> comboBoxExport;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			modalExportalCSV dialog = new modalExportalCSV();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	public modalExportalCSV() {
		setBounds(100, 100, 399, 200);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblExportCSV = new JLabel("Seleccione la tabla para generar el CSV");
			lblExportCSV.setHorizontalAlignment(SwingConstants.CENTER);
			lblExportCSV.setBounds(10, 0, 367, 41);
			lblExportCSV.setFont(new Font("Tahoma", Font.PLAIN, 14));
			contentPanel.add(lblExportCSV);
		}
		
		comboBoxExport = new JComboBox<String>();
		comboBoxExport.setBounds(10, 79, 165, 20);
		comboBoxExport.setFont(new Font("Tahoma", Font.PLAIN, 14));
		comboBoxExport.setBackground(Color.WHITE);
		comboBoxExport.setModel(new DefaultComboBoxModel<String>(new String[] {"Seleccione la Tabla","Trasancciones", "Saldos" }));
		contentPanel.add(comboBoxExport);
		
		textPath = new JTextField();
		textPath.setEditable(false);
		textPath.setBackground(Color.WHITE);
		textPath.setBounds(10, 48, 265, 20);
		contentPanel.add(textPath);
		textPath.setColumns(10);
		
		JButton btnExplorer = new JButton("Guardar...");
		btnExplorer.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
				int status = chooser.showSaveDialog(chooser);
				if (status == JFileChooser.APPROVE_OPTION) {
					String fileS = chooser.getSelectedFile().getAbsolutePath();
					System.out.println(fileS);
					textPath.setText(fileS);
				}

			}
		});
		btnExplorer.setBounds(285, 47, 89, 23);
		contentPanel.add(btnExplorer);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (!textPath.getText().equals("")) {
							if (comboBoxExport.getSelectedIndex() == 0) {
								JOptionPane.showMessageDialog(null, "Debe seleccionar una tabla");
							}else {
							ExportController eC = new ExportController();
							eC.exportFileCSV(comboBoxExport.getSelectedIndex(), textPath.getText());
							retiro.frame.setEnabled(true);
							retiro.frame.show(true);
							}
						}else {
							JOptionPane.showMessageDialog(null, "Debe seleccionar una ruta");

						}

					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						modalExportalCSV.this.hide();
						retiro.frame.setEnabled(true);
						retiro.frame.show(true);
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}

	public static modalExportalCSV getModalExportalCSVInstance() {
		if (modalExportalCSVInstance == null) {
			modalExportalCSVInstance = new modalExportalCSV();
			return modalExportalCSVInstance;
		}else {
			return null;
		}
	}
}
