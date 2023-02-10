package com.tut2.ProjectWithMaven21;
import java.util.ArrayList;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.*;

public class MyClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Configuration cf= new Configuration();
		cf.configure();
		
		SessionFactory factory=cf.buildSessionFactory();
		
		
		
		
		Questions q1 = new Questions();
		q1.setQueId(11991);
		q1.setQuestion("What is java");
		
		/*Questions q2 = new Questions();
		q2.setQueId(112);
		q2.setQuestion("define java");
		*/
		
		
		Answers ans = new Answers();
		ans.setAnserId(2911);
		ans.setAnswer("java is is object oriented programing language");
		//ans.setQuestion(q1);
		
		Answers ans2 =new Answers();
		ans2.setAnserId(222);
		ans2.setAnswer("java is a object oriented programing language");
	    //ans2.setQuestion(q1);
		
		ArrayList<Answers>arr= new ArrayList<Answers>();
		arr.add(ans);
		arr.add(ans2);
		
		q1.setAnswer(arr);
		
		Session session=factory.openSession();
		
			
		Transaction tx =session.beginTransaction();
	    session.save(q1);
	   // session.save(q2);
	    
	    session.save(ans);
	    session.save(ans2);
	    //session.save(q2);
		tx.commit();
		
		
	Questions q4= (Questions)session.get(Questions.class, 111);
		
	//	System.out.println(q4.getQuestion());
		//System.out.println(((Answers) q4.getAnswr()).getAnswer());
		
		session.close();
		
		factory.close();
		
	}

}
 