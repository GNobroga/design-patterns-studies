package br.com.gabiroba.factory.apple.after.factory;

import br.com.gabiroba.factory.apple.after.model.IPhone;
import br.com.gabiroba.factory.apple.after.model.IPhoneXSMax;

public class IPhoneXSMaxFactory extends IPhoneFactory {

	public IPhone createIPhone() {
		return new IPhoneXSMax();
	}

}
