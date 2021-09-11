package collections.map;

import java.util.HashMap;
import java.util.Map;

public class Map1 {

	public static void main(String[] args) {
		
		Map<String, String> statesPopulation = new HashMap<>();

		statesPopulation.put("PE", "9.616.621");
		statesPopulation.put("AL","3.351.543");
		statesPopulation.put("CE","9.187.103");
		statesPopulation.put("RN","3.534.265");
		
		statesPopulation.put("RN", "3.534.165");
		
		if(!statesPopulation.containsKey("PB")){
			statesPopulation.put("PB", "4.039.277");
		}
		
		System.out.println("PE population: " + statesPopulation.get("PE"));
	}

}

/* Dada a população estimada de alguns estados do NE brasileiro, faça:

Estado = PE - População = 9.616.621

Estado = AL - População = 3.351.543

Estado = CE - População = 9.187.103

Estado = RN - População = 3.534.265

Crie um dicionário e relacione os estados e suas populações;

Substitua a população do estado do RN por 3.534.165;

Confira se o estado PB está no dicionário, caso não adicione: PB -
4.039.277;

Exiba a população PE; */