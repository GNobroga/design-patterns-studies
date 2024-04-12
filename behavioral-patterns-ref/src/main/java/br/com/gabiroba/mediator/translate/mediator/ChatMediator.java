package br.com.gabiroba.mediator.translate.mediator;

import br.com.gabiroba.mediator.translate.model.User;

public class ChatMediator extends Mediator {

	public String getMessage(String message, User to, User from) {
		return message;
	}
}
