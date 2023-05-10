package entities;

import java.util.ArrayList;
import java.util.List;

public class RegistroPresenze {

	private List<Presenza> elencoPresenze;

	public List<Presenza> getElencoPresenze() {
		return elencoPresenze;
	}

	public void setElencoPresenze(List<Presenza> elencoPresenze) {
		this.elencoPresenze = elencoPresenze;
	}

	public RegistroPresenze() {
		elencoPresenze = new ArrayList<>();
	}

	public void aggiungiPresenza(String nomeDipendente, int giorniPresenza) {
		elencoPresenze.add(new Presenza(nomeDipendente, giorniPresenza));
	}

}
