package co.simplon.boucles;

public class BouclesFor<tableau> {
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
		final int tailletableau = fin-debut +1;
		int[] tableauInverse = new int[tailletableau];
		
		for (int i = fin ; i>=debut ; i--) {
			tableauInverse [-(i - fin)] = i;
		}
		
		return tableauInverse;
	}

	public int[] construireTableauEntiersPairs() {
		final int tailletableau = (fin-debut +1)/2;
		int[] tableauEntiersPairs = new int[tailletableau];
		
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
		final int tailletableau = fin-debut +1;
		int[] tableau = new int[tailletableau];
		
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
		String[] tableau = new String[tableauEntree.length];
		
		int i=0;
		for (String valeur : tableauEntree) {
			tableau [i] = valeur + suffixe ;
			i++;
		}
		
		return tableau;
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