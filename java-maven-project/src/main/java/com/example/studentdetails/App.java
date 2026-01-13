package com.example.studentdetails;

/* Transaction Interface :
 * 
 * A transaction simply represent a unit of work. 
 * In such case, If one step fails, the whole transaction fails(which is termed as atomicity).
 * A transaction can be described by ACID properties(atomicity, consistency, isolaton, durability).
 * 
 * 
 * Methods of Transaction interface :
 * 
 * 1. void begin() - starts a new transaction.
 * 2. void commit() - ends the unit of work unless we are in FlushMode.NEVER.
 * 3. void rollback() - forces this transaction to rollback.
 * 4. void setTimeout(int seconds) - it sets a transaction timeout for any tansaction started by
 *                                    a subsequent call to begin on this instance.
 * 
 * 
 * get() :
 * 
 * - get() method is used to retrieve a persistent object from the database.
 * - It is a member of the session interface, and it takes the class of the object to be retrieved
 *   and the primary key of the object as argugent.
 * - get() method returns null if there is no object present in the database.
 * 
 * 
 * load() :
 * 
 * -load() method is used to retrieve an object from the database by its identifier(primary key).
 *  It is used to initialize a proxy object instead of a fully initialized object. So it can be used to lazily load the
 *  object when it is needed.
 * - load() method throws ObjectNotFoundException if there is no object found in the database.
 * 
 * 
 */

import java.time.LocalDate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class App {

	public static void main(String[] args) {

		SessionFactory factory = HibernateUtil.getSessionFactory();

		// LocalDate d1 = LocalDate.of(1999, 8, 12);

		// Transient state
		// Student s1 = new Student("S112", "Vanisha","Nagesh",d1,"F","vani@gmail.com","8345673456");

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		Student student = session.get(Student.class, "S113");
		// Student student = session.load(Student.class, "S113");

		System.out.println(student);

		// Persistent state
		// session.save(s1);

		/* Transaction successful */
		tx.commit();
		/* Transaction failed */
		// tx.rollback();

		/* Detached state */
		session.close();
		factory.close();

	}

}
