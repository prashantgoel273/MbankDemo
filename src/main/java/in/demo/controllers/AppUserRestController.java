package in.demo.controllers;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import in.demo.dto.WalletResponse;

@RestController
@RequestMapping(value = "/api")
public class AppUserRestController {
	
	@PreAuthorize("hasRole('ROLE_WALLETUSER')")
	@GetMapping(value = "/walletBalance")
	public WalletResponse getWallentBalance() {
		
		System.out.println("hello controller");
		return new WalletResponse("A", 10.0);
	}

}
