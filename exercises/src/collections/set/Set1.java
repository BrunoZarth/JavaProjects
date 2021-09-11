package collections.set;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {
		Set<String> rainbowColours = new HashSet<>();

		rainbowColours.addAll(
				Arrays.asList(new String[] { "red", "orange", "yellow", "green", "blue", "indigo", "violet", }));

		System.out.println("a) Exiba todas as cores uma abaixo da outra:");
		for (String colour : rainbowColours) {
			System.out.println(colour);
		}

		System.out.println("\nb) A quantidade de cores que o arco-íris tem");
		System.out.println(rainbowColours.size());

		System.out.println("\nc) Exiba as cores em ordem alfabética");
		Set<String> sortedRainbowColours = new TreeSet<>();
		sortedRainbowColours.addAll(rainbowColours);
		System.out.println(sortedRainbowColours);

		System.out.println("\nd) Exiba as cores na ordem inversa da que foi informada");
		ArrayList<String> reversed = new ArrayList<>();
		reversed.addAll(rainbowColours);
		Collections.reverse(reversed);
		System.out.println(reversed);

		System.out.println("\ne) Exiba todas as cores que começam com a letra ”v”");
		for (String colour : rainbowColours) {
			if (colour.startsWith("v")) {
				System.out.println(colour);
			}
		}

		System.out.println("\nf) Remova todas as cores que não começam com a letra “v”");
		Iterator<String> it = rainbowColours.iterator();
		while (it.hasNext()) {
			if (!it.next().startsWith("v")) {
				it.remove();
				System.out.println("Actual rainbowColours set: " + rainbowColours);
			}
		}

		System.out.println("\ng) Limpe o conjunto");
		rainbowColours.clear();

		System.out.println("\nh) Confira se o conjunto está vazio");
		if (rainbowColours.isEmpty()) {
			System.out.println("rainbow colours: " + rainbowColours + "-> empty set");
		} else System.out.println("rainbow colours: " + rainbowColours);
	}

}

/*
 * Crie um conjunto contendo as cores do arco-íris e:
 * 
 * a) Exiba todas as cores uma abaixo da outra
 * 
 * b) A quantidade de cores que o arco-íris tem
 * 
 * c) Exiba as cores em ordem alfabética
 * 
 * d) Exiba as cores na ordem inversa da que foi informada
 * 
 * e) Exiba todas as cores que começam com a letra ”v”
 * 
 * f) Remova todas as cores que não começam com a letra “v”
 * 
 * g) Limpe o conjunto
 * 
 * h) Confira se o conjunto está vazio
 */