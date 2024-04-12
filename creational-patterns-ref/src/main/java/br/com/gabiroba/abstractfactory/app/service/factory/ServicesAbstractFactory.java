package br.com.gabiroba.abstractfactory.app.service.factory;

import br.com.gabiroba.abstractfactory.app.service.services.CarService;
import br.com.gabiroba.abstractfactory.app.service.services.UserService;

public interface ServicesAbstractFactory {

	UserService getUserService();
	
	CarService getCarService();
}
