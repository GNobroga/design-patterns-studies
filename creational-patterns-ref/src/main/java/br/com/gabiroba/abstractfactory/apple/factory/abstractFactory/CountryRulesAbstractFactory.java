package br.com.gabiroba.abstractfactory.apple.factory.abstractFactory;

import br.com.gabiroba.abstractfactory.apple.model.certificate.Certificate;
import br.com.gabiroba.abstractfactory.apple.model.packing.Packing;

public interface CountryRulesAbstractFactory {
	Certificate getCertificates();
	
	Packing getPacking();
}
