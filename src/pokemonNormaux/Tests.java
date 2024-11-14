package pokemonNormaux;

public class Tests {

	public static void main(String[] args) {
		/*int min = 10;
		int max = 0;
		// 20 Lancers de 1D6
		for (int i = 1; i <= 20; i++) {
			int r = random.nextInt(1, 7);
			System.out.println(r +" ");
			if(r < min)
				min = r;
			else if (r > max)
				max = r;	
		}
		System.out.println("\n["+ min + "," + max + "]");*/
		
		System.out.println("\n");
		System.out.println("\nTEST POKEMON0 \n");
		Pokemon0 p1 = new Pokemon0("Rhinolove");
		Pokemon0 p2 = new Pokemon0("Chovsourir");
		p1.log(p1.toString());
		p2.log(p2.toString());
		p1.attaquer(p2);
		p2.log(p2.toString());
		
	}

}
