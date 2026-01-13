package com.example.studentdetails.employee;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.example.studentdetails.HibernateUtil;

public class EmployeeOperation {

	public static void main(String[] args) {
		SessionFactory factory = HibernateUtil.getSessionFactory();

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Address a1 = new Address(1, "Rajajinagar", "Bangalore", "Karnataka", "541232");

		Employee e1 = new Employee("E102", "Ananya", 45000.0, a1);

		session.save(e1);
		tx.commit();
		
		Employee employee = session.get(Employee.class, "E101");
		System.out.println(employee);

		session.close();
		factory.close();
	}

}
