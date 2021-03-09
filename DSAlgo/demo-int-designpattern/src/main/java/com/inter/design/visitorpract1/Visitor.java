package com.inter.design.visitorpract1;

public interface Visitor {

	int visit(Book book);
	int visit(CD cd);
}
