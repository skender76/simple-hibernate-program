package test.trades;

import java.util.Random;

public class SampleHibernateProgram {

	public static void main(String[] args) {
		
		Random randomno = new Random();
		
		DBTradeCreation tradeCreation = new DBTradeCreation();
		tradeCreation.initDB("MYSQL", "jdbc:mysql://localhost:3306/mysql", "root", "test123");

//		System.out.println("FW_trade: " + tradeCreation.queryTrades());
//		String tradeId = Integer.toString(randomno.nextInt(10000));
//		tradeCreation.insert_trade(tradeId, 0);
//		System.out.println("FW_trade: " + tradeCreation.queryTrades());
		
		System.out.println("FW_trade_archive: " + tradeCreation.queryArchivedTrades());
		String tradeId = Integer.toString(randomno.nextInt(10000));
		tradeCreation.insert_archive_trade(tradeId, 0);
		System.out.println("FW_trade_archive: " + tradeCreation.queryArchivedTrades());
		
		tradeCreation.closeDb();
	}

}
