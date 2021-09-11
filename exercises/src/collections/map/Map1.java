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

/* Dada a popula��o estimada de alguns estados do NE brasileiro, fa�a:

Estado = PE - Popula��o = 9.616.621

Estado = AL - Popula��o = 3.351.543

Estado = CE - Popula��o = 9.187.103

Estado = RN - Popula��o = 3.534.265

Crie um dicion�rio e relacione os estados e suas popula��es;

Substitua a popula��o do estado do RN por 3.534.165;

Confira se o estado PB est� no dicion�rio, caso n�o adicione: PB -
4.039.277;

Exiba a popula��o PE; */