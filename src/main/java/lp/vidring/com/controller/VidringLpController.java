package lp.vidring.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import lp.vidring.com.service.VidringLpService;

@Controller
public class VidringLpController {

	@Autowired
	private VidringLpService lpService;

	@GetMapping("/subscribe")
	public String userLpPage(@RequestParam(name = "operatorId", defaultValue = "0", required = false) String operatorId,
			@RequestParam(name = "countryCode", defaultValue = "0", required = false) String countryCode,
			@RequestHeader("User-Agent") String userAgent,
			@RequestParam(name = "alias", defaultValue = "0", required = false) String alias,
			@RequestParam(name = "kpId", defaultValue = "0", required = false) String kpId,
			@RequestParam(name = "msisdn") String msisdn, Model model) {
		return lpService.getLandingPage(operatorId, countryCode, userAgent, alias, kpId, model, msisdn);
	}

	@GetMapping("/v1/push")
	public String userPinPsh(
			@RequestParam(name = "countryCode", defaultValue = "0", required = false) String countryCode,
			@RequestParam(name = "productId", defaultValue = "0", required = false) String productId,
			@RequestParam(name = "alias", defaultValue = "0", required = false) String alias,
			@RequestParam(name = "kpId", defaultValue = "0", required = false) String kpId,
			@RequestParam(name = "operatorId", defaultValue = "0", required = false) String operatorId,
			@RequestParam(name = "msisdn") String msisdn, Model model) {
		return lpService.sendPinPushRequest(countryCode, productId, msisdn, alias, kpId, model, operatorId);
	}

	@GetMapping("/privacy-policy")
	public String privacyPage() {
		return "vidring-privacy.html";
	}

	@GetMapping("/data-privacy")
	public String dataPrivay() {
		return "vidring-data.html";
	}

	@GetMapping("/video")
	public String video() {
		return "test.html";
	}

}
