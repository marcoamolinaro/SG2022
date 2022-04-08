package net.com.scm.sg2022.util;

import java.util.ArrayList;
import java.util.List;

public class Combinacoes {
	private static final List<Integer> valores = new ArrayList<>();

	static {
		for (Integer i = 0; i <= 14; i++) {
			valores.add(i);
		}
	}

	public static List<List<Integer>> getCombinacoesDe13(List<Integer> valores) {
		int numValores = valores.size();

		List<List<Integer>> combinacoes = new ArrayList<>();

		List<Integer> possibilidades;

		for (int a = 0; a < numValores; a++) { // 1
			for (int b = a + 1; b < numValores; b++) { // 2
				for (int c = b + 1; c < numValores; c++) { // 3
					for (int d = c + 1; d < numValores; d++) { // 4
						for (int e = d + 1; e < numValores; e++) { // 5
							for (int f = e + 1; f < numValores; f++) { // 6
								for (int g = f + 1; g < numValores; g++) { // 7
									for (int h = g + 1 ; h < numValores; h++) { // 8
										for (int i = h + 1; i < numValores; i++) { // 9
											for (int j = i + 1; j < numValores; j++) { // 10
												for (int k = j + 1; k < numValores; k++) { // 11
													for (int l = k + 1; l < numValores; l++) { // 12
														for (int m = l + 1; m < numValores; m++) { // 13
															possibilidades = new ArrayList<>(13);

															possibilidades.add(valores.get(a));
															possibilidades.add(valores.get(b));
															possibilidades.add(valores.get(c));
															possibilidades.add(valores.get(d));
															possibilidades.add(valores.get(e));
															possibilidades.add(valores.get(f));
															possibilidades.add(valores.get(g));
															possibilidades.add(valores.get(h));
															possibilidades.add(valores.get(i));
															possibilidades.add(valores.get(j));
															possibilidades.add(valores.get(k));
															possibilidades.add(valores.get(l));
															possibilidades.add(valores.get(m));
															combinacoes.add(possibilidades);
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}	
			}
		}
		return combinacoes;
	}
	
	public static void main(String[] args) {
		// resgata as poss�veis combina��es
		List<List<Integer>> combinacoes = getCombinacoesDe13(valores);
		for (List<Integer> possibilidades : combinacoes) {
			// e mostra uma a uma
			System.out.println(possibilidades);
		}
		// depois mostra quantas combina��es existem
		System.out.println(combinacoes.size() + " possibilidades diferentes");
	}
}
