package aaa;



public abstract class Pokemon {
	

	
	public final String name = null;
	public final PokemonType type = null;
	public int cp ;
	public abstract void attack();
	
	
	public int getCp() {
		return cp;
	}
	public void setCp(int cp) {
		this.cp = cp;
	}
	public String getName() {
		return name;
	}
	public PokemonType getType() {
		return type;
	}
	
	public Pokemon(String name ,PokemonType type, int cp)
	{
		name = this.name;
		type = this.type;
		cp = this.cp;
	}
	
	


}