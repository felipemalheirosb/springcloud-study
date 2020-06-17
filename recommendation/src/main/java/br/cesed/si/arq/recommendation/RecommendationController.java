package br.cesed.si.arq.recommendation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/recommendations")
public class RecommendationController {
	
	@GetMapping
	private List<Recommendation> findAll(){
		return new ArrayList<Recommendation>();
	}
}
