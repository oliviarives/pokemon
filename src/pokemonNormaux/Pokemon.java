package pokemonNormaux;

import java.util.Random;

public abstract class Pokemon {

	private String nom;
	protected int hp;
	private int atk;
	private int niveau;
	private static int niveauMax = 10;
	private TypePokemon type;
	private static java.util.Random random = new Random();
	
	public Pokemon (String nom, TypePokemon type) {
		this.nom = nom;
		this.type = type;
		this.niveau = random.nextInt(1, niveauMax);
		this.hp = 2 * this.niveau;
		this.atk = (this.niveau / 2) + 1;
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
	
	public TypePokemon getType() {
		return type;
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
	
	public abstract void attaquer(Pokemon p);
	
	public abstract void subir(Pokemon p);

	public String toString() {
		String mess = "Je m'appelle "+ this.nom + " ! "
				+ " Je suis au niveau " + this.niveau 
				+ ", j'ai " + this.hp + " points de vie," 
				+ " mon attaque est de " + this.atk 
				+ " Je suis de type " + this.type;
		return mess;
	}
	
	public void log(String msg) {
		System.out.println("[Pokemon "+ this.nom + "] : "+ this.toString());
	}
}
