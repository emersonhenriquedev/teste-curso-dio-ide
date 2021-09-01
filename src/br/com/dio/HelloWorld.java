package br.com.dio;

import br.com.dio.model.Cachorro;

public class HelloWorld {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cachorro cachorro = new Cachorro("Fred", "branco",5);
		System.out.println("Hello World: " + cachorro.getNome());

	}

}
