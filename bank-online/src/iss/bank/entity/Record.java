package iss.bank.entity;

/**
 * Record entity. @author MyEclipse Persistence Tools
 */

public class Record implements java.io.Serializable {

	// Fields

	private Integer recordId;
	private Card card;
	private Double recordAmount;
	private String recordState;
	private String recordDate;

	// Constructors

	/** default constructor */
	public Record() {
	}

	/** minimal constructor */
	public Record(Double recordAmount, String recordState, String recordDate) {
		this.recordAmount = recordAmount;
		this.recordState = recordState;
		this.recordDate = recordDate;
	}

	/** full constructor */
	public Record(Card card, Double recordAmount, String recordState,
			String recordDate) {
		this.card = card;
		this.recordAmount = recordAmount;
		this.recordState = recordState;
		this.recordDate = recordDate;
	}

	// Property accessors

	public Integer getRecordId() {
		return this.recordId;
	}

	public void setRecordId(Integer recordId) {
		this.recordId = recordId;
	}

	public Card getCard() {
		return this.card;
	}

	public void setCard(Card card) {
		this.card = card;
	}

	public Double getRecordAmount() {
		return this.recordAmount;
	}

	public void setRecordAmount(Double recordAmount) {
		this.recordAmount = recordAmount;
	}

	public String getRecordState() {
		return this.recordState;
	}

	public void setRecordState(String recordState) {
		this.recordState = recordState;
	}

	public String getRecordDate() {
		return this.recordDate;
	}

	public void setRecordDate(String recordDate) {
		this.recordDate = recordDate;
	}

}