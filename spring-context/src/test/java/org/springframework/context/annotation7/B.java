package org.springframework.context.annotation7;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.DependsOn;
import org.springframework.stereotype.Component;

/**
 * @author:wuqi
 * @date:2020/3/1
 * @description:org.springframework.context.annotation7
 * @version:1.0
 */
@Component
//@DependsOn(value = "a")
public class B {
	@Autowired
	private A a;
}
