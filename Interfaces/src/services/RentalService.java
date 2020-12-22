package services;

import entities.CarRental;
import entities.Invoice;


//CLASSE DE SERVIÇO DE ALUGUEL
public class RentalService {
	private Double pricePerHour;
	private Double pricePerDay;
	
	private TaxService taxService;

	public RentalService(Double pricePerHour, Double pricePerDay, TaxService taxService) {
		this.pricePerHour = pricePerHour;
		this.pricePerDay = pricePerDay;
		this.taxService = taxService;
	}
	
	
	public void processInvoice(CarRental carRental) {
		long instante1 = carRental.getStart().getTime();//armazena a data de saida do carro em milisegundos
		long instante2 = carRental.getFinish().getTime();//armazena a data de entrada do carro em milisegundos
		double hours = (double)(instante2 - instante1) / 1000 / 60 / 60;//variável recebe a diferença entre os 2 tempos, depois converte de milisegundos para segundos, depois para minutos e depois horas
		double basicPayment;
		if(hours <= 12.0) {
			basicPayment = Math.ceil(hours) * pricePerHour;//Math.ceil arredonda o horario, era 16:10, ele arredonda para a próxima hora, no caso 17h.
		}else {
			basicPayment = Math.ceil(hours/24) * pricePerDay;//hours/24 pois aqui estamos querendo o calculo por dia.
		}
	
		
		double tax = taxService.tax(basicPayment);
		
		carRental.setInvoice(new Invoice(basicPayment, tax));
		
	}
	
	
	

}
