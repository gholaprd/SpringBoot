package com.rd.boot.dao;

public class CategoriesDaoReqBean {

	private String clientId;
	private String channelId;
	private long cardNum;
	private int cvvNum;
	private String expDate;
	private String nameOnCard;
	private long availblePoints;
	private long eligiblePoints;

	public String getClientId() {
		return clientId;
	}

	public void setClientId(String clientId) {
		this.clientId = clientId;
	}

	public String getChannelId() {
		return channelId;
	}

	public void setChannelId(String channelId) {
		this.channelId = channelId;
	}

	public long getCardNum() {
		return cardNum;
	}

	public void setCardNum(long cardNum) {
		this.cardNum = cardNum;
	}

	public int getCvvNum() {
		return cvvNum;
	}

	public void setCvvNum(int cvvNum) {
		this.cvvNum = cvvNum;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}

	public String getNameOnCard() {
		return nameOnCard;
	}

	public void setNameOnCard(String nameOnCard) {
		this.nameOnCard = nameOnCard;
	}

	public long getAvailblePoints() {
		return availblePoints;
	}

	public void setAvailblePoints(long availblePoints) {
		this.availblePoints = availblePoints;
	}

	public long getEligiblePoints() {
		return eligiblePoints;
	}

	public void setEligiblePoints(long eligiblePoints) {
		this.eligiblePoints = eligiblePoints;
	}

	@Override
	public String toString() {
		return "CategoriesProcessReqBean [clientId=" + clientId + ", channelId=" + channelId + ", cardNum=" + cardNum
				+ ", cvvNum=" + cvvNum + ", expDate=" + expDate + ", nameOnCard=" + nameOnCard + ", availblePoints="
				+ availblePoints + ", eligiblePoints=" + eligiblePoints + "]";
	}

}
