package fr.algorithmie;

import java.util.Arrays;

import org.junit.Test;
import org.junit.runner.RunWith;

import outils.Exercice;
import outils.ExerciceRunner;
import outils.Question;
import outils.Resultat;

/** Ne modifiez ni les noms des classes, ni les noms des méthodes.
 * Utilisez Resultat.log pour afficher les résultats
 * 
 * @author DIGINAMIC
 *
 */
@RunWith(ExerciceRunner.class)
@Exercice(nom="AffichageTableau")
public class Ex03_AffichageTableau {

	int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
	
	@Test
	@Question(numero=1)
	public void affichageTableau() {
		
		//TODO LOGUER les éléments du tableau grâce à une boucle
		for(int i : array) {
			Resultat.log(i);;
		}
	}
	
	@Test
	@Question(numero=2)
	public void affichageTableauOrdreInverse() {
		
		//TODO LOGUER les éléments du tableau dans l'ordre inverse
//		for(int i = 0; i < array.length/2; i++) {
//			int inverse = array[i];
//			array[i] = array[array.length-i-1];
//			array[array.length-i-1] = inverse;
//		}
//		Resultat.log(array);
		
		System.out.println("Tableau  : " + Arrays.toString(array));
		
		
		
		int[] arrayCopy = Arrays.copyOf(array, array.length);
			System.out.println("Copie du tableau " + Arrays.toString(arrayCopy));
		
			for(int i = 0; i < arrayCopy.length/2; i++) {
				int newArray = arrayCopy[i];
				arrayCopy[i] = arrayCopy[arrayCopy.length-i-1];
				arrayCopy[arrayCopy.length-i-1] = newArray;
			}
		
		System.out.println("Tableau après inversion : " + Arrays.toString(arrayCopy));
	}
}
