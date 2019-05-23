package com.prueba.utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class Files {

	String[] f = new String[2];
	private String folderPath = "/resources/Data";
	private String folderPath0 = "\\resources\\Data\\";
	static String fileName = "";
	JFileChooser chooser = new JFileChooser();

	public String[] openfolders() throws IOException {
		chooser = new JFileChooser();

		// Filtro que permite solo archivos csv.
		FileFilter filtro = new FileNameExtensionFilter("Archivos csv", "csv");
		chooser.setFileFilter(filtro);

		int status = chooser.showOpenDialog(chooser);
		if (status == JFileChooser.APPROVE_OPTION) {
			File file = chooser.getSelectedFile();
			if (file == null) {
				return null;
			}
			// obtener la ruta del archivo
			fileName = chooser.getSelectedFile().getAbsolutePath();
			f[0] = fileName;
			f[1] = chooser.getSelectedFile().getName();
		}

		if (status == JFileChooser.CANCEL_OPTION) {
			//System.out.println("Cancelar subida de archivo");
		}

		return f;
	}

	public String ruta() {

		File miDir = new File(".");

		try {
			String ruta = miDir.getCanonicalPath();
			//System.out.println("Directorio actual: " + ruta);
			return ruta;
		} catch (IOException e1) {
			//System.out.println("error" + e1);
			return null;
		}
	}

	public void createfolder() throws IOException {

		File theDir = new File(this.ruta() + folderPath);

		if (!theDir.exists()) {

			try {
				theDir.mkdir();

			} catch (Exception e2) {
				// TODO: handle exception
			}
		}

		String filePath1 = folderPath0 + f[1];
		Files.fileCopyUsingNIOFilesClass(f[0], this.ruta() + filePath1);

	}

	private static void fileCopyUsingNIOFilesClass(String urlS, String urlD) throws IOException {
		if (urlS != null && urlD != null) {
			//System.out.println("paso correctamente");
			Path source = Paths.get(urlS);
			//System.out.println(source);
			Path destination = Paths.get(urlD);
			//System.out.println(urlD);

			java.nio.file.Files.copy(source, destination, StandardCopyOption.REPLACE_EXISTING);

		}

	}
	
	//Get and setter of FileName = (OPtiene la ruta local)
	

	public static String getFileName() {
		return fileName;
	}
	
	

}
