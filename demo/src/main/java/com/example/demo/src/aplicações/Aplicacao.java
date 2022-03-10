package com.example.demo.src.aplicações;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

import com.example.demo.src.model.Entities.Reservation;
import com.example.demo.src.model.Exeptions.ReservationExceptions;
import com.example.demo.src.model.services.CobrancaService;
import com.example.demo.src.model.services.TaxPaymentimpl;



public class Aplicacao {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:ss");
		
		
		try {
			System.out.print("MAKE YOUR RESERVATION!!!"+
						"\n"+"--------------------"+"\n");
			
			System.out.print("Room Number: ");
			int roomnumber = sc.nextInt();
			
			sc.nextLine();
			System.out.print("Check-in date (dd/MM/yyyy hh:ss): ");
			Date checkin = sdf.parse(sc.nextLine());
			
			System.out.print("Check-out date (dd/MM/yyyy hh:ss): ");
			Date checkout = sdf.parse(sc.nextLine()); 
			
			Reservation reservation = new Reservation(roomnumber, checkin, checkout);
				reservation.updateDates(checkin, checkout);
			
			CobrancaService cs = new CobrancaService(new TaxPaymentimpl());
			cs.cobrarValorTotal(reservation);
			
			System.out.println("\n" + reservation + "-------------");
	
		}catch (ReservationExceptions e) {
			System.out.println("[ERRO]" + e.getLocalizedMessage());
		}catch (InputMismatchException e) {
			System.out.println("[ERRO] Formato inválido");
		}
		
		System.out.println("\n"+"---------FIM----------");
		
		
		sc.close();
	}

}
