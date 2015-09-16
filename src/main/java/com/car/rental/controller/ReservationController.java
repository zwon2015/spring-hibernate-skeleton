package com.car.rental.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.car.rental.domain.Rental;
import com.car.rental.domain.Reservation;
import com.car.rental.service.ReservationService;


@Controller
@SessionAttributes({"reservation"})
public class ReservationController {
	
	@Autowired
	ReservationService reservationService;
	
	@InitBinder
	protected void initBinder(WebDataBinder binder)
	{
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(format,false));
	}

	@RequestMapping("reservation")
	public String allReservation(Model model) {

		model.addAttribute("reservation", reservationService.getAllReservation());

		return "reservation/listReservation";
	}
	
	@RequestMapping("/reservation/add")
	public String addReservation(Model model) {

		model.addAttribute("reservation", new Reservation());

		return "reservation/addReservation";
	}
	
	@RequestMapping(value = "/reservation/save", method = RequestMethod.POST)
	public String saveReservation(@ModelAttribute Reservation reservation, Model model) {

		reservationService.addReservation(reservation);

		return "redirect:/reservation";
	}
	
	@RequestMapping("/reservation/edit/{reservationId}")
	public String editReservation(@PathVariable("reservationId") int reservationId, Model model) {

		model.addAttribute("reservation", reservationService.searchVehicleById(reservationId));

		return "/reservation/addReservation";
	}
	
	@RequestMapping("/reservation/delete/{reservationId}")
	public String deleteReservation(@PathVariable("reservationId") int rentalId, Model model) {

		reservationService.deleteReservation(rentalId);
		return "redirect:/reservation";
	}
	
}
