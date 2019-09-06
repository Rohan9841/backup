package tacos.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import tacos.Order;
import tacos.data.OrderRepository;

@Controller
@RequestMapping("/orders")
@SessionAttributes("order")
public class OrderController {
	
	private OrderRepository orderRepo;
	
	@Autowired
	public OrderController(OrderRepository orderRepo) {
		this.orderRepo = orderRepo;
	}
	
	@GetMapping("/current")
	public String showOrderForm(Model model) {
		return "orderForm";
	}
	
	@PostMapping
	public String processForm(@Valid Order order, Errors error, SessionStatus sessionStatus) {
		if(error.hasErrors()) {
			return "orderForm";
		}
		
		orderRepo.save(order);
		sessionStatus.setComplete();
		return "redirect:/design";
	}

}
