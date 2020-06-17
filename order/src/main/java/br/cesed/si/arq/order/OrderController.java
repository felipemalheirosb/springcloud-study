package br.cesed.si.arq.order;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/orders")
public class OrderController {
	
	@GetMapping
	private List<Order> findAll(){
		return new ArrayList<Order>();
	}
}
