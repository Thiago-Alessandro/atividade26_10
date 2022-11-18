package atividades26_10;

import java.util.Scanner;

public class questao1 {

	public static void main(String[] args) {
		
		int verificador;
		boolean DumbledoreEstaEmHogwarts = true, profSeveroVaiDarAulasDeFeiticosAquaticosEsseSemestre = true,
				HermioneNotaAbaixo7ExercicioBoole = true, timeHarryVenceuJogoQuadribol = true;
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Dumbledore está em Hogwarts?\n\n1 - Sim\n2 - Não\n");
		verificador = teclado.nextInt();
		
		if (verificador == 1) {
			DumbledoreEstaEmHogwarts = true;
		}
		else if (verificador == 2) {
			DumbledoreEstaEmHogwarts = false;
		}
		
		if (DumbledoreEstaEmHogwarts == true) {
			System.out.print("Ronnie foi descongelado!");
		}
		else {
			System.out.print("\nO professor severo vai dar aulas de feitiços aquáticos esse semestre?\n\n1 - sim\n2 - Não\n");
			verificador  = teclado.nextInt();
			
			if (verificador == 1) {
				profSeveroVaiDarAulasDeFeiticosAquaticosEsseSemestre = true;
			}
			else if (verificador == 2) {
				profSeveroVaiDarAulasDeFeiticosAquaticosEsseSemestre = false;
			}
			
			System.out.print("\nHermione tirou uma nota abaixo de sete no exercício de álgebra de boole?\n\n1 - Sim\n2 - Não\n");
			verificador = teclado.nextInt();
			
			if (verificador == 1) {
				HermioneNotaAbaixo7ExercicioBoole = true;
			}
			else if (verificador == 2) {
				HermioneNotaAbaixo7ExercicioBoole = false;
			}
			
			System.out.print("\nO time de Harry ganhou o jogo de quadribol?\n\n1 - Sim\n2 - Não\n");
			verificador = teclado.nextInt();
			
			if (verificador == 1) {
				timeHarryVenceuJogoQuadribol = true;
			}
			else if (verificador == 2) {
				timeHarryVenceuJogoQuadribol = false;
			}
			
			
			if (profSeveroVaiDarAulasDeFeiticosAquaticosEsseSemestre == true && HermioneNotaAbaixo7ExercicioBoole == false || timeHarryVenceuJogoQuadribol == true && profSeveroVaiDarAulasDeFeiticosAquaticosEsseSemestre == true || timeHarryVenceuJogoQuadribol == true && HermioneNotaAbaixo7ExercicioBoole == false) {
				System.out.print("Ronnie foi descongelado!");
			}
			else {
				System.out.print("Ronnie não foi descongelado");
			}
		}
	}

}