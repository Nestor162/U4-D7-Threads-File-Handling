package app;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

import entities.Presenza;
import entities.RegistroPresenze;

public class Ex3 {

	private static File file = new File("info.txt");

	public static void main(String[] args) {

		RegistroPresenze registro1 = new RegistroPresenze();
		registro1.aggiungiPresenza("Mario Rossi", 5);
		registro1.aggiungiPresenza("Chiara Bianchi", 15);
		registro1.aggiungiPresenza("Giulia Verdi", 7);

		try {
			saveOnDisk(registro1);
		} catch (IOException e) {

			e.printStackTrace();
		}

	}

//	public static void saveOnDisk(RegistroPresenze registro1) throws IOException {
//
//		FileUtils.writeStringToFile(file, "Ciao" + System.lineSeparator(), "UTF-8", true);
//	}

	public static void saveOnDisk(RegistroPresenze registro1) throws IOException {
		for (Presenza presenza : registro1.getElencoPresenze()) {

			FileUtils.writeStringToFile(file, presenza.getNomeDipendente() + "@" + presenza.getGiorniPresenza() + "#",
					"UTF-8", true);

		}
		System.out.println("Salvata lista presenze su file info.txt");
	}

}
