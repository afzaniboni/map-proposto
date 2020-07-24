package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

import exception.DomainException;

public class Programa {

	public static void main(String[] args) throws DomainException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Map<String, Integer> votos = new TreeMap<>();

		System.out.println("Entre com o nome do arquivo e seu caminho?");
		String arquivoOrigem = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(arquivoOrigem))) {
			String linha = br.readLine();
			while (linha != null) {

				String vetor[] = linha.split(",");

				Integer qteVotos = 0;
				if (votos.containsKey(vetor[0])) {
					qteVotos = votos.get(vetor[0]);
				}

				votos.put(vetor[0], Integer.parseInt(vetor[1]) + qteVotos);

				linha = br.readLine();
			}

			for (String votacao : votos.keySet()) {
				System.out.println(votacao + ": " + votos.get(votacao));
			}

		} catch (IOException e) {
			sc.close();
			throw new DomainException("Mensagem: " + e.getMessage());
		}

		sc.close();
	}

}
