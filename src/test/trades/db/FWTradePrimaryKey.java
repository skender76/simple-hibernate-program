package test.trades.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class FWTradePrimaryKey implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7935385150072685002L;

	@Column(name = "trade_id")
	private String tradeId;
	
	@Column(name = "rev_id")
	private Integer revId;
	
	public FWTradePrimaryKey() {
		
	}
	
	public FWTradePrimaryKey(String tradeId, Integer revId) {
		this.tradeId = tradeId;
		this.revId = revId;
	}
	
	public String getTradeId() {
		return tradeId;
	}

	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	public Integer getRevId() {
		return revId;
	}

	public void setRevId(Integer revId) {
		this.revId = revId;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + revId;
		result = prime * result + ((tradeId == null) ? 0 : tradeId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FWTradePrimaryKey other = (FWTradePrimaryKey) obj;
		if (revId != other.revId)
			return false;
		if (tradeId == null) {
			if (other.tradeId != null)
				return false;
		} else if (!tradeId.equals(other.tradeId))
			return false;
		return true;
	}
}
