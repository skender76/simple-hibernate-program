package com.iontrading.iontesterrobotlib.trades.db;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;

@Entity
@Table(name = "FW_trade")
public class FWTrade {
			
	@EmbeddedId
	private	FWTradePrimaryKey id;
	
	@Column(name = "custom_fields")
	private String customFields;

	@Column(name = "deal_type")
	private String dealType;

	@Column(name = "deal_subtype")
	private String dealSubtype;

	@Column(name = "allow_netting")
	private String allowNetting;

	@Column(name = "source")
	private String source;

	@Column(name = "orig_source")
	private String origSource;

	@Column(name = "cancel_source")
	private String cancelSource;

	@Column(name = "ai_given")
	private String aiGiven;

	@Column(name = "ext_id_src_1")
	private String extIdSrc1;

	@Column(name = "ext_id_1")
	private String extId1;

	@Column(name = "ext_id_src_2")
	private String extIdSrc2;

	@Column(name = "ext_id_2")
	private String extId2;

	@Column(name = "ext_id_src_3")
	private String extIdSrc3;

	@Column(name = "ext_id_3")
	private String extId3;

	@Column(name = "update_reason_code")
	private String updateReasonCode;

	@Column(name = "cancel_reason_code")
	private String cancelReasonCode;

	@Column(name = "attribs_1")
	private String attribs1;

	@Column(name = "attribs_2")
	private String attribs2;

	@Column(name = "attribs_3")
	private String attribs3;

	@Column(name = "attribs_4")
	private String attribs4;

	@Column(name = "rev_props_1")
	private String revProps1;

	@Column(name = "rev_props_2")
	private String revProps2;

	@Column(name = "rev_props_3")
	private String revProps3;

	@Column(name = "rev_props_4")
	private String revProps4;

	@Column(name = "pending_source")
	private String pendingSource;

	@Column(name = "sec_id")
	private String secId;

	@Column(name = "account_id")
	private String accountId;

	@Column(name = "comments")
	private String comments;

	@Column(name = "create_user")
	private String createUser;

	@Column(name = "orig_create_user")
	private String origCreateUser;

	@Column(name = "checked_by")
	private String checkedBy;

	@Column(name = "trader_cp")
	private String traderCp;

	@Column(name = "match_status")
	private String matchStatus;

	@Column(name = "comm_type")
	private String commType;

	@Column(name = "comm_type_nonrisk")
	private String commTypeNonrisk;

	@Column(name = "status_chg_user")
	private String statusChgUser;

	@Column(name = "modified_user")
	private String modifiedUser;

	@Column(name = "comm_type_3")
	private String commType3;

	@Column(name = "order_type_str")
	private String orderTypeStr;

	@Column(name = "float_index")
	private String floatIndex;

	@Column(name = "settle_conv")
	private String settleConv;

	@Column(name = "rollconvention")
	private String rollConvention;

	@Column(name = "broker_key")
	private String brokerKey;

	@Column(name = "clearing_house_key")
	private String clearingHouseKey;

	@Column(name = "clearing_mbr_key")
	private String clearingMbrKey;

	@Column(name = "bank_clearing_mbr_key")
	private String bankClearingMbrKey;

	@Column(name = "order_id")
	private String orderId;

	@Column(name = "create_source")
	private String createSource;

	@Column(name = "dealer_bic")
	private String dealerBic;

	@Column(name = "execution_mkt_id")
	private String executionMktId;

	@Column(name = "investment_mkt_id")
	private String investmentMktId;

	@Column(name = "day_count")
	private String dayCount;

	@Column(name = "custom_desc")
	private String customDesc;

	@Column(name = "ref_entity")
	private String refEntity;

	@Column(name = "calendar")
	private String calendar;

	@Column(name = "synth_ref")
	private String synthRef;

	@Column(name = "evt_orig_trade_id")
	private String evtOrigTradeId;

	@Column(name = "evt_ref")
	private String evtRef;

	@Column(name = "fx_reset_inf_src")
	private String fxResetInfSrc;

	@Column(name = "fx_reset_inf_page")
	private String fxResetInfPage;

	@Column(name = "fx_reset_val_time_location")
	private String fxResetValTimeLocation;

	@Column(name = "fx_reset_call_id")
	private String fxResetCallId;

	@Column(name = "trader_id")
	private String traderId;

	@Column(name = "calc_props")
	private String calcProps;

	@Column(name = "evt_cal_id")
	private String evtCalId;

	@Column(name = "evt_third_party_member")
	private String evtThirdPartyMember;

	@Column(name = "clearing_house")
	private String clearingHouse;

	@Column(name = "transparency_flag")
	private String transparencyFlag;

	@Column(name = "waiver_flag")
	private String waiverFlag;

	@Column(name = "evt_currency")
	private String evtCurrency;

	@Column(name = "short_selling")
	private String shortSelling;

	@Column(name = "trading_capacity")
	private String tradingCapacity;

	@Column(name = "cp_key")
	private Character cpKey;

	@Column(name = "status")
	private Character status;

	@Column(name = "sub_status")
	private Character subStatus;

	@Column(name = "trade_flags")
	private Character tradeFlags;

	@Column(name = "given")
	private Character given;

	@Column(name = "display_fmt")
	private Character displayFmt;

	@Column(name = "comm_code")
	private Character commCode;

	@Column(name = "is_parent")
	private Character isParent;

	@Column(name = "confirmed")
	private Character confirmed;

	@Column(name = "sent")
	private Character sent;

	@Column(name = "printed")
	private Character printed;

	@Column(name = "pool_id")
	private Character poolId;

	@Column(name = "comm_code_nonrisk")
	private Character commCodeNonRisk;

	@Column(name = "rep_id")
	private Character repId;

	@Column(name = "match_trade_id")
	private Character matchTradeId;

	@Column(name = "locked_by")
	private Character lockedBy;

	@Column(name = "comm_code_3")
	private Character commCode3;

	@Column(name = "comm3_affects_total_money")
	private Character comm3AffectsTotalMoney;

	@Column(name = "comm_affects_money")
	private Character commAffectsMoney;

	@Column(name = "comm_nonrisk_affects_money")
	private Character commNonRiskAffectsMoney;

	@Column(name = "currency_type")
	private Character currencyType;

	@Column(name = "ref_secid")
	private Character refSecId;

	@Column(name = "otc_id")
	private Character otcId;

	@Column(name = "trade_prc")
	private Double tradePrice;

	@Column(name = "quantity")
	private Double quantity;

	@Column(name = "trade_yld")
	private Double tradeYield;

	@Column(name = "trade_drate")
	private Double tradeDrate;

	@Column(name = "comm_rate")
	private Double commRate;

	@Column(name = "ai")
	private Double ai;

	@Column(name = "comm_rate_nonrisk")
	private Double commRateNonRisk;

	@Column(name = "val")
	private Double val;

	@Column(name = "ai_val")
	private Double aiVal;

	@Column(name = "comm_rate_3")
	private Double commRate3;

	@Column(name = "trade_mmyld")
	private Double tradeMMYield;

	@Column(name = "rate")
	private Double rate;

	@Column(name = "frequency")
	private Double frequency;

	@Column(name = "reset_frequency")
	private Double resetFrequency;

	@Column(name = "begin_pmt")
	private Double beginPmt;

	@Column(name = "recovery_rate")
	private Double recoveryRate;

	@Column(name = "index_factor")
	private Double indexFactor;

	@Column(name = "evt_fee_amt")
	private Double evtFeeAmt;

	@Column(name = "economic_price")
	private Double economicPrice;

	@Column(name = "fx_rate")
	private Double fxRate;

	@Column(name = "rfq_cover_price")
	private Double rfqCoverPrice;

	@Column(name = "trade_split_qty")
	private Double tradeSplitQty;

	@Column(name = "trade_dmargin")
	private Double tradeDMargin;

	@Column(name = "floater_ref_rate")
	private Double floaterRefRate;

	@Column(name = "floater_repo_rate")
	private Double floaterRepoRate;

	@Column(name = "factor")
	private Double factor;

	@Column(name = "time_mkt_creation_UTC")
	private Double timeMarketCreationUTC;

	@Column(name = "ext_id_version_1")
	private Integer  externalIdVersion1;

	@Column(name = "ext_id_version_2")
	private Integer  externalIdVersion2;

	@Column(name = "ext_id_version_3")
	private Integer  externalIdVersion3;

	@Column(name = "trade_dt")
	private Integer  tradeDate;

	@Column(name = "settle_dt")
	private Integer  settleDate;

	@Column(name = "status_chg_dt")
	private Integer  statusChangeDate;

	@Column(name = "create_time")
	private Integer  createTime;

	@Column(name = "orig_create_time")
	private Integer  originalCreateTime;

	@Column(name = "checked_dt")
	private Integer  checkedDt;

	@Column(name = "locked_dt")
	private Integer  lockedDt;

	@Column(name = "status_chg_stamp")
	private Integer  statusChgStamp;

	@Column(name = "create_stamp")
	private Integer  createStamp;

	@Column(name = "orig_create_stamp")
	private Integer  orig_create_stamp;

	@Column(name = "modified_stamp")
	private Integer  modifiedStamp;

	@Column(name = "breakdown_id")
	private Integer  breakdownId;

	@Column(name = "match_rev_id")
	private Integer  matchRevId;

	@Column(name = "deal_id")
	private Integer  dealId;

	@Column(name = "aggressed")
	private Integer  aggressed;

	@Column(name = "order_type")
	private Integer  orderType;

	@Column(name = "trade_origin")
	private Integer  tradeOrigin;

	@Column(name = "is_synthetic")
	private Integer  isSynthetic;

	@Column(name = "securitytype")
	private Integer  securityType;

	@Column(name = "should_recalc")
	private Integer  shouldRecalc;

	@Column(name = "ai_days")
	private Integer  aiDays;

	@Column(name = "restructuring")
	private Integer  restructuring;

	@Column(name = "seniority")
	private Integer  seniority;

	@Column(name = "seniority_sub")
	private Integer  senioritySub;

	@Column(name = "std_compliance")
	private Integer  stdCompliance;

	@Column(name = "evt_event")
	private Integer  evtEvent;

	@Column(name = "evt_pay_receive")
	private Integer  evtPayReceive;

	@Column(name = "evt_orig_trd_src")
	private Integer  evtOrigTrdSrc;

	@Column(name = "evt_bus_days_adjust")
	private Integer  evtBusDaysAdjust;

	@Column(name = "value_fmt")
	private Integer  valueFmt;

	@Column(name = "leg_no")
	private Integer  legNo;

	@Column(name = "ext_split_revision")
	private Integer  extSplitRevision;

	@Column(name = "serial_no")
	private Integer  serialNo;

	@Column(name = "persistent_update")
	private Integer  persistentUpdate;

	@Column(name = "sales_affirmed")
	private Integer  salesAffirmed;

	@Column(name = "trader_affirmed")
	private Integer  traderAffirmed;

	@Column(name = "missed_flag")
	private Integer  missedFlag;

	@Column(name = "fx_rate_inverted")
	private Integer  fxRateInverted;

	@Column(name = "mtm_enabled")
	private Integer  mtmEnabled;

	@Column(name = "mtm_use_init_notional")
	private Integer  mtmUseInitNotional;

	@Column(name = "init_principal_ex")
	private Integer  initPrincipalEx;

	@Column(name = "final_principal_ex")
	private Integer  finalPrincipalEx;

	@Column(name = "fx_reset_val_days_off")
	private Integer  fxResetValDaysOff;

	@Column(name = "fx_reset_val_time")
	private Integer  fxResetValTime;

	@Column(name = "internal_flags")
	private Integer  internalFlags;

	@Column(name = "swing_id")
	private Integer  swingId;

	@Column(name = "calc_instrument_rev_id")
	private Integer  calcInstrumentRevId;

	@Column(name = "execution_mkt_id_type")
	private Integer  executionMKktIdType;

	@Column(name = "investment_mkt_id_type")
	private Integer  investmentMktIdType;

	@Column(name = "date_mkt_creation_UTC")
	private Integer  dateMktCreationUTC;

	@Column(name = "start_dt")
	private Integer  startDt;

	@Column(name = "end_dt")
	private Integer  endDt;

	@Column(name = "evt_eff_dt")
	private Integer evtEffDt;

	@Column(name = "evt_dt")
	private Integer evtDt;

	@Column(name = "evt_fee_eff_dt")
	private Integer evtFeeEffDt;
	
	public FWTrade() {
		settleDate = 20180101;
		tradeDate = 20180101;
		quantity = 0.0;
		status = 'A';
	}
	
	public String getCustomFields() {
		return customFields;
	}

	public void setCustomFields(String customFields) {
		this.customFields = customFields;
	}

	public String getDealType() {
		return dealType;
	}

	public void setDealType(String dealType) {
		this.dealType = dealType;
	}

	public String getDealSubtype() {
		return dealSubtype;
	}

	public void setDealSubtype(String dealSubtype) {
		this.dealSubtype = dealSubtype;
	}

	public String getAllowNetting() {
		return allowNetting;
	}

	public void setAllowNetting(String allowNetting) {
		this.allowNetting = allowNetting;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getOrigSource() {
		return origSource;
	}

	public void setOrigSource(String origSource) {
		this.origSource = origSource;
	}

	public String getCancelSource() {
		return cancelSource;
	}

	public void setCancelSource(String cancelSource) {
		this.cancelSource = cancelSource;
	}

	public String getAiGiven() {
		return aiGiven;
	}

	public void setAiGiven(String aiGiven) {
		this.aiGiven = aiGiven;
	}

	public String getExtIdSrc1() {
		return extIdSrc1;
	}

	public void setExtIdSrc1(String extIdSrc1) {
		this.extIdSrc1 = extIdSrc1;
	}

	public String getExtId1() {
		return extId1;
	}

	public void setExtId1(String extId1) {
		this.extId1 = extId1;
	}

	public String getExtIdSrc2() {
		return extIdSrc2;
	}

	public void setExtIdSrc2(String extIdSrc2) {
		this.extIdSrc2 = extIdSrc2;
	}

	public String getExtId2() {
		return extId2;
	}

	public void setExtId2(String extId2) {
		this.extId2 = extId2;
	}

	public String getExtIdSrc3() {
		return extIdSrc3;
	}

	public void setExtIdSrc3(String extIdSrc3) {
		this.extIdSrc3 = extIdSrc3;
	}

	public String getExtId3() {
		return extId3;
	}

	public void setExtId3(String extId3) {
		this.extId3 = extId3;
	}

	public String getUpdateReasonCode() {
		return updateReasonCode;
	}

	public void setUpdateReasonCode(String updateReasonCode) {
		this.updateReasonCode = updateReasonCode;
	}

	public String getCancelReasonCode() {
		return cancelReasonCode;
	}

	public void setCancelReasonCode(String cancelReasonCode) {
		this.cancelReasonCode = cancelReasonCode;
	}

	public String getAttribs1() {
		return attribs1;
	}

	public void setAttribs1(String attribs1) {
		this.attribs1 = attribs1;
	}

	public String getAttribs2() {
		return attribs2;
	}

	public void setAttribs2(String attribs2) {
		this.attribs2 = attribs2;
	}

	public String getAttribs3() {
		return attribs3;
	}

	public void setAttribs3(String attribs3) {
		this.attribs3 = attribs3;
	}

	public String getAttribs4() {
		return attribs4;
	}

	public void setAttribs4(String attribs4) {
		this.attribs4 = attribs4;
	}

	public String getRevProps1() {
		return revProps1;
	}

	public void setRevProps1(String revProps1) {
		this.revProps1 = revProps1;
	}

	public String getRevProps2() {
		return revProps2;
	}

	public void setRevProps2(String revProps2) {
		this.revProps2 = revProps2;
	}

	public String getRevProps3() {
		return revProps3;
	}

	public void setRevProps3(String revProps3) {
		this.revProps3 = revProps3;
	}

	public String getRevProps4() {
		return revProps4;
	}

	public void setRevProps4(String revProps4) {
		this.revProps4 = revProps4;
	}

	public String getPendingSource() {
		return pendingSource;
	}

	public void setPendingSource(String pendingSource) {
		this.pendingSource = pendingSource;
	}

	public String getSecId() {
		return secId;
	}

	public void setSecId(String secId) {
		this.secId = secId;
	}

	public String getAccountId() {
		return accountId;
	}

	public void setAccountId(String accountId) {
		this.accountId = accountId;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getCreateUser() {
		return createUser;
	}

	public void setCreateUser(String createUser) {
		this.createUser = createUser;
	}

	public String getOrigCreateUser() {
		return origCreateUser;
	}

	public void setOrigCreateUser(String origCreateUser) {
		this.origCreateUser = origCreateUser;
	}

	public String getCheckedBy() {
		return checkedBy;
	}

	public void setCheckedBy(String checkedBy) {
		this.checkedBy = checkedBy;
	}

	public String getTraderCp() {
		return traderCp;
	}

	public void setTraderCp(String traderCp) {
		this.traderCp = traderCp;
	}

	public String getMatchStatus() {
		return matchStatus;
	}

	public void setMatchStatus(String matchStatus) {
		this.matchStatus = matchStatus;
	}

	public String getCommType() {
		return commType;
	}

	public void setCommType(String commType) {
		this.commType = commType;
	}

	public String getCommTypeNonrisk() {
		return commTypeNonrisk;
	}

	public void setCommTypeNonrisk(String commTypeNonrisk) {
		this.commTypeNonrisk = commTypeNonrisk;
	}

	public String getStatusChgUser() {
		return statusChgUser;
	}

	public void setStatusChgUser(String statusChgUser) {
		this.statusChgUser = statusChgUser;
	}

	public String getModifiedUser() {
		return modifiedUser;
	}

	public void setModifiedUser(String modifiedUser) {
		this.modifiedUser = modifiedUser;
	}

	public String getCommType3() {
		return commType3;
	}

	public void setCommType3(String commType3) {
		this.commType3 = commType3;
	}

	public String getOrderTypeStr() {
		return orderTypeStr;
	}

	public void setOrderTypeStr(String orderTypeStr) {
		this.orderTypeStr = orderTypeStr;
	}

	public String getFloatIndex() {
		return floatIndex;
	}

	public void setFloatIndex(String floatIndex) {
		this.floatIndex = floatIndex;
	}

	public String getSettleConv() {
		return settleConv;
	}

	public void setSettleConv(String settleConv) {
		this.settleConv = settleConv;
	}

	public String getRollConvention() {
		return rollConvention;
	}

	public void setRollConvention(String rollConvention) {
		this.rollConvention = rollConvention;
	}

	public String getBrokerKey() {
		return brokerKey;
	}

	public void setBrokerKey(String brokerKey) {
		this.brokerKey = brokerKey;
	}

	public String getClearingHouseKey() {
		return clearingHouseKey;
	}

	public void setClearingHouseKey(String clearingHouseKey) {
		this.clearingHouseKey = clearingHouseKey;
	}

	public String getClearingMbrKey() {
		return clearingMbrKey;
	}

	public void setClearingMbrKey(String clearingMbrKey) {
		this.clearingMbrKey = clearingMbrKey;
	}

	public String getBankClearingMbrKey() {
		return bankClearingMbrKey;
	}

	public void setBankClearingMbrKey(String bankClearingMbrKey) {
		this.bankClearingMbrKey = bankClearingMbrKey;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCreateSource() {
		return createSource;
	}

	public void setCreateSource(String createSource) {
		this.createSource = createSource;
	}

	public String getDealerBic() {
		return dealerBic;
	}

	public void setDealerBic(String dealerBic) {
		this.dealerBic = dealerBic;
	}

	public String getExecutionMktId() {
		return executionMktId;
	}

	public void setExecutionMktId(String executionMktId) {
		this.executionMktId = executionMktId;
	}

	public String getInvestmentMktId() {
		return investmentMktId;
	}

	public void setInvestmentMktId(String investmentMktId) {
		this.investmentMktId = investmentMktId;
	}

	public String getDayCount() {
		return dayCount;
	}

	public void setDayCount(String dayCount) {
		this.dayCount = dayCount;
	}

	public String getCustomDesc() {
		return customDesc;
	}

	public void setCustomDesc(String customDesc) {
		this.customDesc = customDesc;
	}

	public String getRefEntity() {
		return refEntity;
	}

	public void setRefEntity(String refEntity) {
		this.refEntity = refEntity;
	}

	public String getCalendar() {
		return calendar;
	}

	public void setCalendar(String calendar) {
		this.calendar = calendar;
	}

	public String getSynthRef() {
		return synthRef;
	}

	public void setSynthRef(String synthRef) {
		this.synthRef = synthRef;
	}

	public String getEvtOrigTradeId() {
		return evtOrigTradeId;
	}

	public void setEvtOrigTradeId(String evtOrigTradeId) {
		this.evtOrigTradeId = evtOrigTradeId;
	}

	public String getEvtRef() {
		return evtRef;
	}

	public void setEvtRef(String evtRef) {
		this.evtRef = evtRef;
	}

	public String getFxResetInfSrc() {
		return fxResetInfSrc;
	}

	public void setFxResetInfSrc(String fxResetInfSrc) {
		this.fxResetInfSrc = fxResetInfSrc;
	}

	public String getFxResetInfPage() {
		return fxResetInfPage;
	}

	public void setFxResetInfPage(String fxResetInfPage) {
		this.fxResetInfPage = fxResetInfPage;
	}

	public String getFxResetValTimeLocation() {
		return fxResetValTimeLocation;
	}

	public void setFxResetValTimeLocation(String fxResetValTimeLocation) {
		this.fxResetValTimeLocation = fxResetValTimeLocation;
	}

	public String getFxResetCallId() {
		return fxResetCallId;
	}

	public void setFxResetCallId(String fxResetCallId) {
		this.fxResetCallId = fxResetCallId;
	}

	public String getTraderId() {
		return traderId;
	}

	public void setTraderId(String traderId) {
		this.traderId = traderId;
	}

	public String getCalcProps() {
		return calcProps;
	}

	public void setCalcProps(String calcProps) {
		this.calcProps = calcProps;
	}

	public String getEvtCalId() {
		return evtCalId;
	}

	public void setEvtCalId(String evtCalId) {
		this.evtCalId = evtCalId;
	}

	public String getEvtThirdPartyMember() {
		return evtThirdPartyMember;
	}

	public void setEvtThirdPartyMember(String evtThirdPartyMember) {
		this.evtThirdPartyMember = evtThirdPartyMember;
	}

	public String getClearingHouse() {
		return clearingHouse;
	}

	public void setClearingHouse(String clearingHouse) {
		this.clearingHouse = clearingHouse;
	}

	public String getTransparencyFlag() {
		return transparencyFlag;
	}

	public void setTransparencyFlag(String transparencyFlag) {
		this.transparencyFlag = transparencyFlag;
	}

	public String getWaiverFlag() {
		return waiverFlag;
	}

	public void setWaiverFlag(String waiverFlag) {
		this.waiverFlag = waiverFlag;
	}

	public String getEvtCurrency() {
		return evtCurrency;
	}

	public void setEvtCurrency(String evtCurrency) {
		this.evtCurrency = evtCurrency;
	}

	public String getShortSelling() {
		return shortSelling;
	}

	public void setShortSelling(String shortSelling) {
		this.shortSelling = shortSelling;
	}

	public String getTradingCapacity() {
		return tradingCapacity;
	}

	public void setTradingCapacity(String tradingCapacity) {
		this.tradingCapacity = tradingCapacity;
	}

//	public String getTradeId() {
//		return tradeId;
//	}
//
//	public void setTradeId(String tradeId) {
//		this.tradeId = tradeId;
//	}

	public Character getCpKey() {
		return cpKey;
	}

	public void setCpKey(Character cpKey) {
		this.cpKey = cpKey;
	}

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
	}

	public Character getSubStatus() {
		return subStatus;
	}

	public void setSubStatus(Character subStatus) {
		this.subStatus = subStatus;
	}

	public Character getTradeFlags() {
		return tradeFlags;
	}

	public void setTradeFlags(Character tradeFlags) {
		this.tradeFlags = tradeFlags;
	}

	public Character getGiven() {
		return given;
	}

	public void setGiven(Character given) {
		this.given = given;
	}

	public Character getDisplayFmt() {
		return displayFmt;
	}

	public void setDisplayFmt(Character displayFmt) {
		this.displayFmt = displayFmt;
	}

	public Character getCommCode() {
		return commCode;
	}

	public void setCommCode(Character commCode) {
		this.commCode = commCode;
	}

	public Character getIsParent() {
		return isParent;
	}

	public void setIsParent(Character isParent) {
		this.isParent = isParent;
	}

	public Character getConfirmed() {
		return confirmed;
	}

	public void setConfirmed(Character confirmed) {
		this.confirmed = confirmed;
	}

	public Character getSent() {
		return sent;
	}

	public void setSent(Character sent) {
		this.sent = sent;
	}

	public Character getPrinted() {
		return printed;
	}

	public void setPrinted(Character printed) {
		this.printed = printed;
	}

	public Character getPoolId() {
		return poolId;
	}

	public void setPoolId(Character poolId) {
		this.poolId = poolId;
	}

	public Character getCommCodeNonRisk() {
		return commCodeNonRisk;
	}

	public void setCommCodeNonRisk(Character commCodeNonRisk) {
		this.commCodeNonRisk = commCodeNonRisk;
	}

	public Character getRepId() {
		return repId;
	}

	public void setRepId(Character repId) {
		this.repId = repId;
	}

	public Character getMatchTradeId() {
		return matchTradeId;
	}

	public void setMatchTradeId(Character matchTradeId) {
		this.matchTradeId = matchTradeId;
	}

	public Character getLockedBy() {
		return lockedBy;
	}

	public void setLockedBy(Character lockedBy) {
		this.lockedBy = lockedBy;
	}

	public Character getCommCode3() {
		return commCode3;
	}

	public void setCommCode3(Character commCode3) {
		this.commCode3 = commCode3;
	}

	public Character getComm3AffectsTotalMoney() {
		return comm3AffectsTotalMoney;
	}

	public void setComm3AffectsTotalMoney(Character comm3AffectsTotalMoney) {
		this.comm3AffectsTotalMoney = comm3AffectsTotalMoney;
	}

	public Character getCommAffectsMoney() {
		return commAffectsMoney;
	}

	public void setCommAffectsMoney(Character commAffectsMoney) {
		this.commAffectsMoney = commAffectsMoney;
	}

	public Character getCommNonRiskAffectsMoney() {
		return commNonRiskAffectsMoney;
	}

	public void setCommNonRiskAffectsMoney(Character commNonRiskAffectsMoney) {
		this.commNonRiskAffectsMoney = commNonRiskAffectsMoney;
	}

	public Character getCurrencyType() {
		return currencyType;
	}

	public void setCurrencyType(Character currencyType) {
		this.currencyType = currencyType;
	}

	public Character getRefSecId() {
		return refSecId;
	}

	public void setRefSecId(Character refSecId) {
		this.refSecId = refSecId;
	}

	public Character getOtcId() {
		return otcId;
	}

	public void setOtcId(Character otcId) {
		this.otcId = otcId;
	}

	public Double getTradePrice() {
		return tradePrice;
	}

	public void setTradePrice(Double tradePrice) {
		this.tradePrice = tradePrice;
	}

	public Double getQuantity() {
		return quantity;
	}

	public void setQuantity(Double quantity) {
		this.quantity = quantity;
	}

	public Double getTradeYield() {
		return tradeYield;
	}

	public void setTradeYield(Double tradeYield) {
		this.tradeYield = tradeYield;
	}

	public Double getTradeDrate() {
		return tradeDrate;
	}

	public void setTradeDrate(Double tradeDrate) {
		this.tradeDrate = tradeDrate;
	}

	public Double getCommRate() {
		return commRate;
	}

	public void setCommRate(Double commRate) {
		this.commRate = commRate;
	}

	public Double getAi() {
		return ai;
	}

	public void setAi(Double ai) {
		this.ai = ai;
	}

	public Double getCommRateNonRisk() {
		return commRateNonRisk;
	}

	public void setCommRateNonRisk(Double commRateNonRisk) {
		this.commRateNonRisk = commRateNonRisk;
	}

	public Double getVal() {
		return val;
	}

	public void setVal(Double val) {
		this.val = val;
	}

	public Double getAiVal() {
		return aiVal;
	}

	public void setAiVal(Double aiVal) {
		this.aiVal = aiVal;
	}

	public Double getCommRate3() {
		return commRate3;
	}

	public void setCommRate3(Double commRate3) {
		this.commRate3 = commRate3;
	}

	public Double getTradeMMYield() {
		return tradeMMYield;
	}

	public void setTradeMMYield(Double tradeMMYield) {
		this.tradeMMYield = tradeMMYield;
	}

	public Double getRate() {
		return rate;
	}

	public void setRate(Double rate) {
		this.rate = rate;
	}

	public Double getFrequency() {
		return frequency;
	}

	public void setFrequency(Double frequency) {
		this.frequency = frequency;
	}

	public Double getResetFrequency() {
		return resetFrequency;
	}

	public void setResetFrequency(Double resetFrequency) {
		this.resetFrequency = resetFrequency;
	}

	public Double getBeginPmt() {
		return beginPmt;
	}

	public void setBeginPmt(Double beginPmt) {
		this.beginPmt = beginPmt;
	}

	public Double getRecoveryRate() {
		return recoveryRate;
	}

	public void setRecoveryRate(Double recoveryRate) {
		this.recoveryRate = recoveryRate;
	}

	public Double getIndexFactor() {
		return indexFactor;
	}

	public void setIndexFactor(Double indexFactor) {
		this.indexFactor = indexFactor;
	}

	public Double getEvtFeeAmt() {
		return evtFeeAmt;
	}

	public void setEvtFeeAmt(Double evtFeeAmt) {
		this.evtFeeAmt = evtFeeAmt;
	}

	public Double getEconomicPrice() {
		return economicPrice;
	}

	public void setEconomicPrice(Double economicPrice) {
		this.economicPrice = economicPrice;
	}

	public Double getFxRate() {
		return fxRate;
	}

	public void setFxRate(Double fxRate) {
		this.fxRate = fxRate;
	}

	public Double getRfqCoverPrice() {
		return rfqCoverPrice;
	}

	public void setRfqCoverPrice(Double rfqCoverPrice) {
		this.rfqCoverPrice = rfqCoverPrice;
	}

	public Double getTradeSplitQty() {
		return tradeSplitQty;
	}

	public void setTradeSplitQty(Double tradeSplitQty) {
		this.tradeSplitQty = tradeSplitQty;
	}

	public Double getTradeDMargin() {
		return tradeDMargin;
	}

	public void setTradeDMargin(Double tradeDMargin) {
		this.tradeDMargin = tradeDMargin;
	}

	public Double getFloaterRefRate() {
		return floaterRefRate;
	}

	public void setFloaterRefRate(Double floaterRefRate) {
		this.floaterRefRate = floaterRefRate;
	}

	public Double getFloaterRepoRate() {
		return floaterRepoRate;
	}

	public void setFloaterRepoRate(Double floaterRepoRate) {
		this.floaterRepoRate = floaterRepoRate;
	}

	public Double getFactor() {
		return factor;
	}

	public void setFactor(Double factor) {
		this.factor = factor;
	}

	public Double getTimeMarketCreationUTC() {
		return timeMarketCreationUTC;
	}

	public void setTimeMarketCreationUTC(Double timeMarketCreationUTC) {
		this.timeMarketCreationUTC = timeMarketCreationUTC;
	}

	public Integer  getExternalIdVersion1() {
		return externalIdVersion1;
	}

	public void setExternalIdVersion1(Integer  externalIdVersion1) {
		this.externalIdVersion1 = externalIdVersion1;
	}

	public Integer  getExternalIdVersion2() {
		return externalIdVersion2;
	}

	public void setExternalIdVersion2(Integer  externalIdVersion2) {
		this.externalIdVersion2 = externalIdVersion2;
	}

	public Integer  getExternalIdVersion3() {
		return externalIdVersion3;
	}

	public void setExternalIdVersion3(Integer  externalIdVersion3) {
		this.externalIdVersion3 = externalIdVersion3;
	}

	public Integer  getTradeDate() {
		return tradeDate;
	}

	public void setTradeDate(Integer  tradeDate) {
		this.tradeDate = tradeDate;
	}

	public Integer  getSettleDate() {
		return settleDate;
	}

	public void setSettleDate(Integer  settleDate) {
		this.settleDate = settleDate;
	}

	public Integer  getStatusChangeDate() {
		return statusChangeDate;
	}

	public void setStatusChangeDate(Integer  statusChangeDate) {
		this.statusChangeDate = statusChangeDate;
	}

	public Integer  getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Integer  createTime) {
		this.createTime = createTime;
	}

	public Integer  getOriginalCreateTime() {
		return originalCreateTime;
	}

	public void setOriginalCreateTime(Integer  originalCreateTime) {
		this.originalCreateTime = originalCreateTime;
	}

	public Integer  getCheckedDt() {
		return checkedDt;
	}

	public void setCheckedDt(Integer  checkedDt) {
		this.checkedDt = checkedDt;
	}

	public Integer  getLockedDt() {
		return lockedDt;
	}

	public void setLockedDt(Integer  lockedDt) {
		this.lockedDt = lockedDt;
	}

	public Integer  getStatusChgStamp() {
		return statusChgStamp;
	}

	public void setStatusChgStamp(Integer  statusChgStamp) {
		this.statusChgStamp = statusChgStamp;
	}

	public Integer  getCreateStamp() {
		return createStamp;
	}

	public void setCreateStamp(Integer  createStamp) {
		this.createStamp = createStamp;
	}

	public Integer  getOrig_create_stamp() {
		return orig_create_stamp;
	}

	public void setOrig_create_stamp(Integer  orig_create_stamp) {
		this.orig_create_stamp = orig_create_stamp;
	}

	public Integer  getModifiedStamp() {
		return modifiedStamp;
	}

	public void setModifiedStamp(Integer  modifiedStamp) {
		this.modifiedStamp = modifiedStamp;
	}

//	public Integer  getRevId() {
//		return revId;
//	}
//
//	public void setRevId(Integer  revId) {
//		this.revId = revId;
//	}

	public Integer  getBreakdownId() {
		return breakdownId;
	}

	public void setBreakdownId(Integer  breakdownId) {
		this.breakdownId = breakdownId;
	}

	public Integer  getMatchRevId() {
		return matchRevId;
	}

	public void setMatchRevId(Integer  matchRevId) {
		this.matchRevId = matchRevId;
	}

	public Integer  getDealId() {
		return dealId;
	}

	public void setDealId(Integer  dealId) {
		this.dealId = dealId;
	}

	public Integer  getAggressed() {
		return aggressed;
	}

	public void setAggressed(Integer  aggressed) {
		this.aggressed = aggressed;
	}

	public Integer  getOrderType() {
		return orderType;
	}

	public void setOrderType(Integer  orderType) {
		this.orderType = orderType;
	}

	public Integer  getTradeOrigin() {
		return tradeOrigin;
	}

	public void setTradeOrigin(Integer  tradeOrigin) {
		this.tradeOrigin = tradeOrigin;
	}

	public Integer  getIsSynthetic() {
		return isSynthetic;
	}

	public void setIsSynthetic(Integer  isSynthetic) {
		this.isSynthetic = isSynthetic;
	}

	public Integer  getSecurityType() {
		return securityType;
	}

	public void setSecurityType(Integer  securityType) {
		this.securityType = securityType;
	}

	public Integer  getShouldRecalc() {
		return shouldRecalc;
	}

	public void setShouldRecalc(Integer  shouldRecalc) {
		this.shouldRecalc = shouldRecalc;
	}

	public Integer  getAiDays() {
		return aiDays;
	}

	public void setAiDays(Integer  aiDays) {
		this.aiDays = aiDays;
	}

	public Integer  getRestructuring() {
		return restructuring;
	}

	public void setRestructuring(Integer  restructuring) {
		this.restructuring = restructuring;
	}

	public Integer  getSeniority() {
		return seniority;
	}

	public void setSeniority(Integer  seniority) {
		this.seniority = seniority;
	}

	public Integer  getSenioritySub() {
		return senioritySub;
	}

	public void setSenioritySub(Integer  senioritySub) {
		this.senioritySub = senioritySub;
	}

	public Integer  getStdCompliance() {
		return stdCompliance;
	}

	public void setStdCompliance(Integer  stdCompliance) {
		this.stdCompliance = stdCompliance;
	}

	public Integer  getEvtEvent() {
		return evtEvent;
	}

	public void setEvtEvent(Integer  evtEvent) {
		this.evtEvent = evtEvent;
	}

	public Integer  getEvtPayReceive() {
		return evtPayReceive;
	}

	public void setEvtPayReceive(Integer  evtPayReceive) {
		this.evtPayReceive = evtPayReceive;
	}

	public Integer  getEvtOrigTrdSrc() {
		return evtOrigTrdSrc;
	}

	public void setEvtOrigTrdSrc(Integer  evtOrigTrdSrc) {
		this.evtOrigTrdSrc = evtOrigTrdSrc;
	}

	public Integer  getEvtBusDaysAdjust() {
		return evtBusDaysAdjust;
	}

	public void setEvtBusDaysAdjust(Integer  evtBusDaysAdjust) {
		this.evtBusDaysAdjust = evtBusDaysAdjust;
	}

	public Integer  getValueFmt() {
		return valueFmt;
	}

	public void setValueFmt(Integer  valueFmt) {
		this.valueFmt = valueFmt;
	}

	public Integer  getLegNo() {
		return legNo;
	}

	public void setLegNo(Integer  legNo) {
		this.legNo = legNo;
	}

	public Integer  getExtSplitRevision() {
		return extSplitRevision;
	}

	public void setExtSplitRevision(Integer  extSplitRevision) {
		this.extSplitRevision = extSplitRevision;
	}

	public Integer  getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(Integer  serialNo) {
		this.serialNo = serialNo;
	}

	public Integer  getPersistentUpdate() {
		return persistentUpdate;
	}

	public void setPersistentUpdate(Integer  persistentUpdate) {
		this.persistentUpdate = persistentUpdate;
	}

	public Integer  getSalesAffirmed() {
		return salesAffirmed;
	}

	public void setSalesAffirmed(Integer  salesAffirmed) {
		this.salesAffirmed = salesAffirmed;
	}

	public Integer  getTraderAffirmed() {
		return traderAffirmed;
	}

	public void setTraderAffirmed(Integer  traderAffirmed) {
		this.traderAffirmed = traderAffirmed;
	}

	public Integer  getMissedFlag() {
		return missedFlag;
	}

	public void setMissedFlag(Integer  missedFlag) {
		this.missedFlag = missedFlag;
	}

	public Integer  getFxRateInverted() {
		return fxRateInverted;
	}

	public void setFxRateInverted(Integer  fxRateInverted) {
		this.fxRateInverted = fxRateInverted;
	}

	public Integer  getMtmEnabled() {
		return mtmEnabled;
	}

	public void setMtmEnabled(Integer  mtmEnabled) {
		this.mtmEnabled = mtmEnabled;
	}

	public Integer  getMtmUseInitNotional() {
		return mtmUseInitNotional;
	}

	public void setMtmUseInitNotional(Integer  mtmUseInitNotional) {
		this.mtmUseInitNotional = mtmUseInitNotional;
	}

	public Integer  getInitPrincipalEx() {
		return initPrincipalEx;
	}

	public void setInitPrincipalEx(Integer  initPrincipalEx) {
		this.initPrincipalEx = initPrincipalEx;
	}

	public Integer  getFinalPrincipalEx() {
		return finalPrincipalEx;
	}

	public void setFinalPrincipalEx(Integer  finalPrincipalEx) {
		this.finalPrincipalEx = finalPrincipalEx;
	}

	public Integer  getFxResetValDaysOff() {
		return fxResetValDaysOff;
	}

	public void setFxResetValDaysOff(Integer  fxResetValDaysOff) {
		this.fxResetValDaysOff = fxResetValDaysOff;
	}

	public Integer  getFxResetValTime() {
		return fxResetValTime;
	}

	public void setFxResetValTime(Integer  fxResetValTime) {
		this.fxResetValTime = fxResetValTime;
	}

	public Integer  getInternalFlags() {
		return internalFlags;
	}

	public void setInternalFlags(Integer  internalFlags) {
		this.internalFlags = internalFlags;
	}

	public Integer  getSwingId() {
		return swingId;
	}

	public void setSwingId(Integer  swingId) {
		this.swingId = swingId;
	}

	public Integer  getCalcInstrumentRevId() {
		return calcInstrumentRevId;
	}

	public void setCalcInstrumentRevId(Integer  calcInstrumentRevId) {
		this.calcInstrumentRevId = calcInstrumentRevId;
	}

	public Integer  getExecutionMKktIdType() {
		return executionMKktIdType;
	}

	public void setExecutionMKktIdType(Integer  executionMKktIdType) {
		this.executionMKktIdType = executionMKktIdType;
	}

	public Integer  getInvestmentMktIdType() {
		return investmentMktIdType;
	}

	public void setInvestmentMktIdType(Integer  investmentMktIdType) {
		this.investmentMktIdType = investmentMktIdType;
	}

	public Integer  getDateMktCreationUTC() {
		return dateMktCreationUTC;
	}

	public void setDateMktCreationUTC(Integer  dateMktCreationUTC) {
		this.dateMktCreationUTC = dateMktCreationUTC;
	}

	public Integer  getStartDt() {
		return startDt;
	}

	public void setStartDt(Integer  startDt) {
		this.startDt = startDt;
	}

	public Integer  getEndDt() {
		return endDt;
	}

	public void setEndDt(Integer  endDt) {
		this.endDt = endDt;
	}

	public Integer  getEvtEffDt() {
		return evtEffDt;
	}

	public void setEvtEffDt(Integer  evtEffDt) {
		this.evtEffDt = evtEffDt;
	}

	public Integer  getEvtDt() {
		return evtDt;
	}

	public void setEvtDt(Integer  evtDt) {
		this.evtDt = evtDt;
	}

	public Integer  getEvtFeeEffDt() {
		return evtFeeEffDt;
	}

	public void setEvtFeeEffDt(Integer  evtFeeEffDt) {
		this.evtFeeEffDt = evtFeeEffDt;
	}

	public FWTradePrimaryKey getId() {
		return id;
	}

	public void setId(FWTradePrimaryKey primaryKey) {
		this.id = primaryKey;
	}

}
