package com.inter.design.visitor.prac;

public interface Item {

	int accept(CartVisitor cart);
}
