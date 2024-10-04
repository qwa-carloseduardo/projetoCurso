package br.com.qwasolucoes.mentoria.curso.MapExemplos;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import br.com.qwasolucoes.mentoria.curso.MapExemplos.entities.Product;

public class Program {

	public static void main(String[] args) {

		List<Product> list = new ArrayList<>();

		list.add(new Product("Tv", 900.00));
		list.add(new Product("Mouse", 50.00));
		list.add(new Product("Tablet", 350.50));
		list.add(new Product("HD Case", 80.90));

		//Referencia method com metodo estático
		//List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
		//Referencia method com metodo não estático
		//List<String> names = list.stream().map(Product ::staticUpperCaseName).collect(Collectors.toList());
		//Referencia method com metodo não estático		
		//List<String> names = list.stream().map(Product ::nonStaticUpperCaseName).collect(Collectors.toList());
		
		//expressao lambda declarada
		//Function<Product, String> func = p -> p.getName().toUpperCase();
		//List<String> names = list.stream().map(func).collect(Collectors.toList());
		
		//expressao lambda inline
		List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());
		
		
		names.forEach(System.out :: println);
		
		
	}
}
