package com.tr.spring.javabaseconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Scope;

import com.tr.spring.scope.AdvanceAction;
import com.tr.spring.scope.AnotherAction;
import com.tr.spring.scope.BaseAction;

public class AnnotationConfigApplicationContextTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
		  /*
		   * if the scan package is com.tr.spring ,then AppConfig will be detected and loaded
		   * then the @Scope defined in AppConfig will work
		   * otherwise, scan com.tr.spring.scope , it will use class level @Scope
		   * Wesley test java-based config
		   */
		  ctx.scan("com.tr.spring.scope");
		  ctx.refresh();
		  AnotherAction anotherAction = ctx.getBean(AnotherAction.class);
		  System.out.print("1 try");
		  anotherAction.say();
		  
		  AnotherAction anotherAction2= ctx.getBean(AnotherAction.class);
		  System.out.print("2 try");
		  anotherAction2.say();
		  
		  
		  AdvanceAction advanceAction = ctx.getBean(AdvanceAction.class);
		  System.out.print("11 try");
		  advanceAction.say();
		  
		  AdvanceAction advanceAction2= ctx.getBean(AdvanceAction.class);
		  System.out.print("12 try");
		  advanceAction2.say();
	}

}
