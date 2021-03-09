package com.inter.java8;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class COmpleteFuture {

	static void m1() {
		
		List<Integer> list = Arrays.asList(5,9,14);  
	//	list.stream().map(n -> CompletableFuture.supplyAsync(()->))
		
		
		//list.stream().map(num->CompletableFuture.supplyAsync(()->getNumber(num))
		
		
		
		/*map(CompletableFuture->CompletableFuture.
				thenApply(n->n*n)).map(t->t.join()).forEach(s->System.out.println(s))); */ 
	}
}
