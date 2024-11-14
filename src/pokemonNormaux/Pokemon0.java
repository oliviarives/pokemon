package pokemonNormaux;

public class Pokemon0 {

	private String nom;
	protected int hp;
	private int atk;
	private int niveau;
	
	public Pokemon0 (String nom) {
		this.nom = nom;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public int getHp() {
		return this.hp;
	}
	
	public int getAtk() {
		return this.atk;
	}

	public int getNiveau() {
		return this.niveau;
	}
	
	public boolean isKO(){
		if(this.hp == 0) {
			System.out.println(this.nom + " est KO");
			return true;
		} else {
			return false;
		}
	}
	
	public void soigner() {
		this.hp = this.niveau * 2;
	}
	
	public void attaquer(Pokemon0 p) {
		System.out.println("J'attaque "+ p.nom +" !");
		p.hp = this.atk - p.hp;
	}

	public String toString() {
		String mess = "Je m'appelle "+ this.nom + " ! "
				+ " Je suis au niveau " + this.niveau 
				+ ", j'ai " + this.hp + " points de vie," 
				+ " mon attaque est de " + this.atk;
		return mess;
	}
	
	public void log(String msg) {
		System.out.println("[Pokemon "+ this.nom + "] : "+ this.toString());
	}
}
