package br.com.gabiroba.abstractfactory.apple.factory.abstractFactory;

import br.com.gabiroba.abstractfactory.apple.model.certificate.BrazilianCertificate;
import br.com.gabiroba.abstractfactory.apple.model.certificate.Certificate;
import br.com.gabiroba.abstractfactory.apple.model.packing.BrazilianPacking;
import br.com.gabiroba.abstractfactory.apple.model.packing.Packing;

public class BrazilianRulesAbstractFactory implements CountryRulesAbstractFactory {

	public Certificate getCertificates() {
		return new BrazilianCertificate();
	}

	public Packing getPacking() {
		return new BrazilianPacking();
	}

}
