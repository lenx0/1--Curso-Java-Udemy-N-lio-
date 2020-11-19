package services;

import entities.CarRental;
import entities.Invoice;

public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService bTs;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService bTs) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.bTs = bTs;
	}
	
	
	public void processInvoice(CarRental carRental) {
		long instante1 = carRental.getStart().getTime();//armazena a data de saida do carro em milisegundos
		long instante2 = carRental.getFinish().getTime();//armazena a data de entrada do carro em milisegundos
		double hours = (double)(instante2 - instante1) / 1000 / 60 / 60;//variavel recebe a diferença entre os 2 tempos, depois converte de milisegundos para segundos, depois para minutos e depois horas
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;//Math.ceil arredonda o horario, era 16:10, ele arredonda para a próxima hora, no caso 17h.
		}else {
			basicPayment = Math.ceil(hours/24) * pricePerDay;//hours/24 pois aqui estamos querendo o calculo por dia.
		}
	
		
		double tax = bTs.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
	}
	
	
	

}
