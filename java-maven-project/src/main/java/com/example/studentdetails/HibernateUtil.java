package com.example.studentdetails;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.example.studentdetails.employee.Address;
import com.example.studentdetails.employee.Employee;

/* Configuration file :
 * 
 * -Configuration file is a class which is present in org.hibernate.cfg package.
 * -It activates the hibernate framework.
 * -It reads both configuration file and mapping files.
 * -It checks whether the config file is syntactically correct or not. If the config file is
 * not correct then it will throw an exception.
 * 
 * 
 * buildSessionFactory() method :
 * 
 * -Gathers the meta-data which is in the cfg object. From cfg object it takes the JDBC information
 * and create a JDBC Connection.
 * 
 * 
 * Session Factory(Interface) :
 * 
 * -The session factory is a crucial component in Hibernate.
 * -It is a heavyweight object created once at the appication's startup and is designed to be
 * thread safe.
 * -The session factory is responsible for managing database connections, transaction management,
 * and handling the mapping of java objects to the database tables.
 * 
 * 
 * Session(Interface) :
 * 
 * -A session is a lightweight, short-lived object in hibernate.
 * -It represents a single unit of work with the database.
 * -Sessions are typically created when needed and used to perform varoius database operations like
 * saving, updating, deleting and query entities.
 * -A session bound to a specific database connection and single transaction, making it suitable
 * for encapsulating a specific piece of work.
 * 
 * 
 * 
 * 
 */

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFactory();

	private static SessionFactory buildSessionFactory() {
		try {

			return new Configuration()
					.configure("hibernate.cfg.xml")
					.addAnnotatedClass(Student.class)
					.addAnnotatedClass(Employee.class)
					.addAnnotatedClass(Address.class)
					.buildSessionFactory();
		} catch (Throwable ex) {
			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}
}
