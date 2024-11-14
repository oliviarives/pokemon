package pokemonNormaux;

public class PokemonFeu extends Pokemon{
	
	public PokemonFeu(String nom) {
		super(nom, TypePokemon.FEU);
	}

	@Override
	public void attaquer(Pokemon p) {
		if(p.getType() == TypePokemon.PLANTE) {
			p.hp = p.hp - (2 * this.getAtk());
		} else {
			p.hp = (int) (p.hp - (0.5 * this.getAtk()));
		}
		p.subir(this);
	}

	@Override
	public void subir(Pokemon p) {
		if(p.getType() == TypePokemon.EAU) {
			int hp = this.getHp(); 
			hp = (this.getHp() - (2 * p.getAtk()));
			this.getHp() = hp;
		} else {
			p.hp = (int) (p.hp - (0.5 * this.getAtk()));
		}
		
	}

}
