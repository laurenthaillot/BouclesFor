package co.simplon.boucles;

public class BouclesFor {
	public static final int MAX_SUPPORTED = 100;

	private Integer debut = null;
	private Integer fin = null;

	public BouclesFor() {
	}

	public BouclesFor(int debut, int fin) {
		this.debut = debut;
		this.fin = fin;
	}

	public int[] construireTableau() {
		if (debut == null || fin == null) {
			return construireTableauSansBornes();
		} else {
			return construireTableauAvecBornes();
		}
	}

	public int[] construireTableauInverse() {
		
		int[] tableauInverse = new int[10];		
		for (int i = fin ; i>=debut ; i--) {
			tableauInverse [-(i - fin)] = i;
		}
		
		return tableauInverse;
	}

	public int[] construireTableauEntiersPairs() {
		int[] tableauEntiersPairs = new int[10];
		int j=0;
		for (int i = debut ; i<=fin ; i++) {
			if (i % 2 == 0){	
			tableauEntiersPairs [ j ] = i;
			j++;
			}
		}
		return tableauEntiersPairs;
	}

	private int[] construireTableauAvecBornes() {
		
		int[] tableau = new int[10];		
		for (int i = debut ; i<=fin ; i++) {		
			tableau [i - debut] = i;
		}
		
		return tableau ;
	}

	private int[] construireTableauSansBornes() {
		int [] tableauSansBorne = new int[MAX_SUPPORTED];		
			
		return tableauSansBorne;
	}


	public String[] suffixerTableau(String[] tableauEntree, String suffixe) {
		return null;
	}

	public Integer[] applanirMatrice(Integer[][] matrice) {
		return null;
	}

	public int[] construireTableauAvecWhile() {
		return null;
	}
	
	public int[] construireTableauEntiersPairsAvecWhile() {
		return null;
	}

}