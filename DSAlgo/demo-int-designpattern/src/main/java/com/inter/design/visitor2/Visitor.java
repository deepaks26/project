package com.inter.design.visitor2;

public interface Visitor {

	int visit(Book book);
	int visit(CD cd);
}
