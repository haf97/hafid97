package calculatrice;

import static org.junit.Assume.assumeTrue;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;


@Nested
@DisplayName("les Tests")
@TestInstance(TestInstance.Lifecycle.PER_METHOD)
class MathOutilTest {

	
	MathOutil mathoutil;
	
	
	@BeforeEach
	void initialisation() {
	mathoutil= new MathOutil();
	}
	
	@AfterEach
	void nettoyage() {
		System.out.println("nettoyer....");
	}
	
	
	
	
	
	@Test
	@DisplayName("le Test d'addition")
	void testAddition() {
		boolean assume= false;
		assumeTrue(assume);
		int expected=4;
		int actuel=mathoutil.Addition(3, 1);
		assertEquals(expected,actuel,"c'est l'operation d'addition");
	}
	
	@Disabled
	@Test
	@DisplayName("le Test du cercle")
	@EnabledOnOs(OS.WINDOWS)
	void testCercle() {

		assertEquals(314.1592653589793,mathoutil.Cercle(10),"Compter la surface du cercle");
		
	}
	
	@Test
	@DisplayName("le Test de division")
	@Tag("Math")
	void testDivision() {
		boolean assume=true;
		assumeTrue(assume);
		assertThrows(ArithmeticException.class,()->mathoutil.Division(1, 0));
	}
	
	
	@RepeatedTest(5)
	@DisplayName("le Test de la Multiplication")
	void testMultiplication() {
		
		assertAll(()->assertEquals(4,mathoutil.Multiplication(2, 2)),
				  ()->assertEquals(-7,mathoutil.Multiplication(-1, 7)),
				  ()->assertEquals(0,mathoutil.Multiplication(0, 6))
				);
			
		
	}

}
