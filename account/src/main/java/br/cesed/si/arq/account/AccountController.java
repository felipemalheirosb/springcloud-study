package br.cesed.si.arq.account;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/accounts")
public class AccountController {
	
	@GetMapping
	private List<Account> findAll(){
		return new ArrayList<Account>();
	}
}
