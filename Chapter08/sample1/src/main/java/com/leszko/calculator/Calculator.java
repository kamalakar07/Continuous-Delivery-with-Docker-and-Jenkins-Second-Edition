package com.leszko.calculator;

import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
/**
* Some javadoc. // OK
*
* @author Some javadoc. // OK
* @version Some javadoc. // OK
* @param Some javadoc. // OK
* @return Some javadoc. // OK
* @throws Some javadoc. // OK
* @exception Some javadoc. // OK
* @see Some javadoc. // OK
* @since Some javadoc. // OK
* @serial Some javadoc. // OK
* @serialField // OK
* @serialData // OK
* @deprecated Some javadoc. // OK
*/
public class Calculator {
        final static int umlNUMBER1 = 3;
	@Cacheable("sum")
	public int sum(int a, int b) {
		return a + b;
	}
}
