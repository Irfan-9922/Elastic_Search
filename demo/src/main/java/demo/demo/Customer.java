package demo.demo;


public class Customer {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Long accNo;
	private String userName;
	private String contactno;
	private String cardNo;
	private String expDate;
	private String bank;
	public Long getAccNo() {
		return accNo;
	}
	public void setAccNo(Long accNo) {
		this.accNo = accNo;
	}
	public Customer(Long accNo, String userName, String contactno, String cardNo, String expDate,String bank) {
		super();
		this.accNo = accNo;
		this.userName = userName;
		this.contactno = contactno;
		this.cardNo = cardNo;
		this.expDate = expDate;
		this.bank=bank;
	}
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getContactno() {
		return contactno;
	}
	public void setContactno(String contactno) {
		this.contactno = contactno;
	}
	public String getCardNo() {
		return cardNo;
	}
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}
	public String getExpDate() {
		return expDate;
	}
	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public String getBank() {
		return bank;
	}
	public void setBank(String bank) {
		this.bank = bank;
	}
	@Override
	public String toString() {
		return "Customer [accNo=" + accNo + ", userName=" + userName + ", contactno=" + contactno + ", cardNo=" + cardNo
				+ ", expDate=" + expDate + ", bank=" + bank + "]";
	}
	
	

}
