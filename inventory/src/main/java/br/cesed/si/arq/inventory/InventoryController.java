package br.cesed.si.arq.inventory;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/inventories")
public class InventoryController {
	
	@GetMapping
	private List<Inventory> findAll(){
		return new ArrayList<Inventory>();
	}
}
