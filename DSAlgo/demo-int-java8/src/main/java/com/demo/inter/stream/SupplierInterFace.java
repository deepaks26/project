package com.demo.inter.stream;

import java.util.function.Consumer;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class SupplierInterFace {

	public static void main(String[] args) {
		Supplier<Stream<String>> streamSupplier = new  Supplier<Stream<String>>() {
			@Override
			public Stream<String> get() {
				return Stream.of("A","B");
			}
		};
		
		Supplier<Stream<String>> strmSplierType2 = () -> Stream.of("C","D");
		Consumer<String> print = System.out::println;
		streamSupplier.get().forEach(print);
		streamSupplier.get().forEach(print);
		
		
		strmSplierType2.get().forEach(print);
		strmSplierType2.get().forEach(print);
	}
}
