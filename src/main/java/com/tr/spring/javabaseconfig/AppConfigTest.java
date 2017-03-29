package com.tr.spring.javabaseconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.tr.spring.scope.AdvanceAction;
import com.tr.spring.scope.AnotherAction;

public class AppConfigTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		  ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
		  /*
		   * prototype
		   */
		  AnotherAction anotherAction = ctx.getBean(AnotherAction.class);
		  System.out.print("1 try");
		  anotherAction.say();
		  
		  AnotherAction anotherAction2= ctx.getBean(AnotherAction.class);
		  System.out.print("2 try");
		  anotherAction2.say();
		  
		  /*
		   * singleton
		   */
		  AdvanceAction advanceAction = ctx.getBean(AdvanceAction.class);
		  System.out.print("11 try");
		  advanceAction.say();
		  
		  AdvanceAction advanceAction2= ctx.getBean(AdvanceAction.class);
		  System.out.print("12 try");
		  advanceAction2.say();

	}

}
