package com.app.aop;

import org.springframework.stereotype.Component;

/**
 * @author:wuqi
 * @date:2020/3/2
 * @description:com.app.aop
 * @version:1.0
 */
@Component
public class A implements Xxable {
    @Override
    public void xx() {
        System.out.println("I am A xx");
		//throw new NullPointerException();
    }

	@Override
	public void yy() {
    	this.xx();
		System.out.println("I am A yy");
	}
}
