package it.dstech.model;

import java.util.Arrays;
import java.util.List;

public class Contatore {

	
	public int contaParole(String testo) {
		List<String> word = Arrays.asList(testo.split(""));
		return word.size();
	}
	
	public int contaVocali(String testo) {
		char[] array = testo.toCharArray();
		int contatoreVocali = 0;
		List<String> vocali = Arrays.asList("a" , "e" , "i" , "o" , "y" , "A" , "E" , "I" , "O" , "Y");
		for(char lettera : array) {
			if(vocali.contains(lettera)) {
				contatoreVocali++;
			}
		}return contatoreVocali;
	}
	
	public int contaConsonanti(String testo) {
		char[] array = testo.toCharArray();
		int contatoreCons = 0;
		List<String> vocali = Arrays.asList("a" , "e" , "i" , "o" , "y" , "A" , "E" , "I" , "O" , "Y");
		for(char lettera : array) {
			if(!vocali.contains(lettera)) {
				contatoreCons++;
			}
		}return contatoreCons;
	}
	
}
