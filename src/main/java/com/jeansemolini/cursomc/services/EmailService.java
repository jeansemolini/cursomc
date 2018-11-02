package com.jeansemolini.cursomc.services;

import org.springframework.mail.SimpleMailMessage;

import com.jeansemolini.cursomc.domain.Pedido;

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendMail(SimpleMailMessage msg);
}
