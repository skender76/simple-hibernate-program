package test.trades;

import java.util.List;
import java.util.Properties;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import test.trades.db.FWTrade;
import test.trades.db.FWTradeArchive;
import test.trades.db.FWTradePrimaryKey;

public class DBTradeCreation {

	private static SessionFactory factory;
	private static Properties properties;

	DBTradeCreation() {
	}
	
	public static void initDB(String dbType, String dbUrl, String username, String password) {
		
		initProperties();
		
		if(dbType.equals("MYSQL")) {
			initMySqlDB( dbUrl, username, password);
		} else if(dbType.equals("ORACLE")) {
			initOracle10DB( dbUrl, username, password);
		}
		
		factory = new Configuration().addProperties(properties)
				.addPackage("com.iontrading.iontesterrobotlib.trades.db")
				.addAnnotatedClass(FWTrade.class)
				.addAnnotatedClass(FWTradeArchive.class)
				.buildSessionFactory(new StandardServiceRegistryBuilder().applySettings(properties).build());
	}

	private static void initProperties() {
		properties = new Properties();
		// log settings
		properties.put("log4j.logger.org.hibernate.SQL", "TRACE");
		properties.put("log4j.logger.org.hibernate.type", "TRACE");
		// c3p0 settings
		properties.put("hibernate.c3p0.min_size", 1);
		properties.put("hibernate.c3p0.max_size", 5);
	}
	
	private static void initMySqlDB(String dbUrl, String username, String password) {
		properties.put("hibernate.dialect", "org.hibernate.dialect.MySQL5InnoDBDialect");
		// driver settings
		properties.put("hibernate.connection.driver_class", "com.mysql.jdbc.Driver");
		
		properties.put("hibernate.connection.url", dbUrl);
		properties.put("hibernate.connection.username", username);
		properties.put("hibernate.connection.password", password);
	}
	
	private static void initOracle10DB(String dbUrl, String username, String password) {
		properties.put("hibernate.dialect", "org.hibernate.dialect.Oracle10gDialect");
		
		properties.put("hibernate.connection.driver_class", "oracle.jdbc.driver.OracleDriver");
		
		properties.put("hibernate.connection.url", dbUrl);
		properties.put("hibernate.connection.username", username);
		properties.put("hibernate.connection.password", password);
	}


	public void insert_trade(String tradeId, int revId) {

		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();

		try {
			
			FWTradePrimaryKey pKey = new FWTradePrimaryKey(tradeId, revId);
			
			FWTrade trade = new FWTrade();
			trade.setId(pKey);
			
			session.persist(trade);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}
	
	public void insert_archive_trade(String tradeId, int revId) {

		Session session = factory.openSession();
		
		Transaction tx = session.beginTransaction();

		try {
			
			FWTradePrimaryKey pKey = new FWTradePrimaryKey(tradeId, revId);
			
			FWTradeArchive trade = new FWTradeArchive();
			trade.setId(pKey);
			
			session.persist(trade);
			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

	public int queryTrades() {

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		int tradeNumber = 0;

		try {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			
			CriteriaQuery<FWTrade> query = builder.createQuery(FWTrade.class);
			
			Root<FWTrade> root = query.from(FWTrade.class);
			
			query.select(root);
			
			Query<FWTrade> q = session.createQuery(query);
			
			List<FWTrade> list = q.getResultList();
			
			tradeNumber = list.size();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			// e.printStackTrace();
		} finally {
			session.close();
			
		}

		return tradeNumber;
	}
	
	public int queryArchivedTrades() {

		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();

		int tradeNumber = 0;

		try {
			CriteriaBuilder builder = session.getCriteriaBuilder();
			
			CriteriaQuery<FWTradeArchive> query = builder.createQuery(FWTradeArchive.class);
			
			Root<FWTradeArchive> root = query.from(FWTradeArchive.class);
			
			query.select(root);
			
			Query<FWTradeArchive> q = session.createQuery(query);
			
			List<FWTradeArchive> list = q.getResultList();
			
			tradeNumber = list.size();

			tx.commit();
		} catch (HibernateException e) {
			if (tx != null)
				tx.rollback();
			// e.printStackTrace();
		} finally {
			session.close();
			
		}

		return tradeNumber;
	}
	
	public int exec_sql(String hql) {
		Session session = factory.openSession();

		Transaction tx = session.beginTransaction();
		
		Query q = session.createQuery(hql);
		
		tx.commit();

		return 0;
	}

	public static void closeDb() {
		factory.close();
	}
}
