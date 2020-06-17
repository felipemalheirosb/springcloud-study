package br.cesed.si.arq.shipping;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/shippings")
public class ShippingController {
	
	@GetMapping
	private List<Shipping> findAll(){
		return new ArrayList<Shipping>();
	}
}
