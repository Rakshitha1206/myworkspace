package com.example.demo.model;

import java.util.List;
import java.util.stream.Collectors;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CreditCardController {

	@Autowired
	private List<CreditCard> cards;
	
	@GetMapping(path="/card/{id}")
	private CreditCard getCardById(@PathVariable("id") int cardNo) {
		List<CreditCard> card = this.cards.stream().filter(e -> e.getCardNumber() == cardNo).collect(Collectors.toList());
		//CreditCard card = cards.get(id);

		return card.get(0);
	}
	
}
