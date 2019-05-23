package com.prueba.view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.prueba.controller.JdbcController;
import com.prueba.controller.UploadController;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class modalCargaFiles extends JDialog {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static modalCargaFiles modalCargarInstance;
	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			modalCargaFiles dialog = new modalCargaFiles();
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}

	/**
	 * Create the dialog.
	 */
	private modalCargaFiles() {
		addMouseListener(new MouseAdapter() {
			@Override
			public void mouseExited(MouseEvent e) {
				
				
			}
		});
		
		setBounds(100, 100, 430, 150);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel label = new JLabel("Desea subir el archivo (se perderan datos anteriores)");
		label.setBounds(28, 31, 341, 28);
		label.setFont(new Font("Tahoma", Font.PLAIN, 14));
		contentPanel.add(label);
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setLayout(new FlowLayout(FlowLayout.RIGHT));
			getContentPane().add(buttonPane, BorderLayout.SOUTH);
			{
				JButton okButton = new JButton("OK");
				okButton.addActionListener(new ActionListener() {
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent e) {
						//Acción del Controlador
						UploadController uc = new UploadController();
						String tipoCuenta = (String)retiro.getComboBox().getSelectedItem();
						uc.registryCSV(com.prueba.utils.Files.getFileName(), tipoCuenta);
						modalCargaFiles.this.setVisible(false);
						retiro.frame.setEnabled(true);
						retiro.frame.show(true);
						System.out.println(JdbcController.getResultado());
					}
				});
				okButton.setActionCommand("OK");
				buttonPane.add(okButton);
				getRootPane().setDefaultButton(okButton);
			}
			{
				JButton cancelButton = new JButton("Cancel");
				cancelButton.addMouseListener(new MouseAdapter() {
				});
				cancelButton.addActionListener(new ActionListener() {
					@SuppressWarnings("deprecation")
					public void actionPerformed(ActionEvent arg0) {
						
						modalCargaFiles.this.hide();
						
						if (!retiro.frame.isEnabled()) {
							retiro.frame.setEnabled(true);
							retiro.frame.show();
						}
						
					}
				});
				cancelButton.setActionCommand("Cancel");
				buttonPane.add(cancelButton);
			}
		}
	}
	
	
	
	//Get patron
	public static modalCargaFiles getModalCargarInstance() {
		if (modalCargarInstance == null) {
			modalCargarInstance = new modalCargaFiles();
			return modalCargarInstance;
		}else {
			return null;
		}
		
	}
}
