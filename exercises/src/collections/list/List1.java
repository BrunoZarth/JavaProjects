package collections.list;

import java.util.ArrayList;

public class List1 {

	public static void main(String[] args) {

		ArrayList<Integer> monthsTemperature = new ArrayList();

		monthsTemperature.add(30);
		monthsTemperature.add(28);
		monthsTemperature.add(25);
		monthsTemperature.add(20);
		monthsTemperature.add(22);
		monthsTemperature.add(15);

		int temperatureSum = 0;
		for (Integer avg : monthsTemperature) {
			temperatureSum += avg;
		}
		int averageTemperature = temperatureSum / (monthsTemperature.size() + 1);
		System.out.println("temperatura m�dia: " + averageTemperature);
		for (Integer monthTemperature : monthsTemperature) {
			if (monthTemperature > averageTemperature) {

				System.out.println(getMonth(monthsTemperature.indexOf(monthTemperature)) + " " + monthTemperature);
			}
		}
	}

	public static String getMonth(int m) {
		switch (m) {
		case 0:
			return "January";
		case 1:
			return "February";
		case 2:
			return "March";
		case 3:
			return "April";
		case 4:
			return "May";
		case 5:
			return "June";
		case 6:
			return "July";
		case 7:
			return "August";
		case 8:
			return "September";
		case 9:
			return "October";
		case 10:
			return "November";
		case 11:
			return "December";
		default:
			return "X";
		}
	}
}

/*
 * Fa�a um programa que receba a temperatura m�dia dos 6 primeiros meses do ano
 * e armazene-as em uma lista.
 * 
 * Ap�s isto, calcule a m�dia semestral das temperaturas e mostre todas as
 * temperaturas acima desta m�dia, e em que m�s elas ocorreram (mostrar o m�s
 * por extenso: 1 � Janeiro, 2 � Fevereiro e etc).
 */