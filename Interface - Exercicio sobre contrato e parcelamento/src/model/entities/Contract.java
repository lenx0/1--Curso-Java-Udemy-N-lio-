package model.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Contract {
	private Integer number;
	private Date date;
	private Double totalValue;

	private Installment installments;

	List<Installment> list = new ArrayList<>();

	public Contract() {
	}

	public Contract(Integer number, Date date, Double totalValue, Installment installments) {
		super();
		this.number = number;
		this.date = date;
		this.totalValue = totalValue;
		this.installments = installments;
	}

	public List<Installment> getList() {
		return list;
	}


	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public Installment getInstallments() {
		return installments;
	}

	public void setInstallments(Installment installments) {
		this.installments = installments;
	}

}
