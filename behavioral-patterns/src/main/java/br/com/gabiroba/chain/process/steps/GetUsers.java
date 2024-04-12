package br.com.gabiroba.chain.process.steps;

import br.com.gabiroba.chain.process.repository.UserRepository;
import br.com.gabiroba.chain.process.service.ProcessContext;

public class GetUsers extends ProcessStep {
	
	public GetUsers(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		Object users = UserRepository.getInstance().getUsers();
		context.put("users", users);
		return next(context, users);
	}

}
