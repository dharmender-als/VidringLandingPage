package lp.vidring.com.utils;

import java.util.Date;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.ui.Model;

import lp.vidring.com.model.VidringLpTransactionModel;
import lp.vidring.com.model.VidringProductModel;
import lp.vidring.com.repository.VidringLpTransactionRepos;
import lp.vidring.com.repository.VidringProductRepo;

@Component
public class DbUtils {

	@Autowired
	VidringLpTransactionRepos lpTransactionRepos;
	@Autowired
	VidringProductRepo productRepo;

	public void saveTransaction(String operatorId, String countryCode, String productId, String userAgent, String alias,
			String kpId, Model model) {
		VidringProductModel productModel = productRepo.findByProductId(productId);
		if (Boolean.TRUE.equals(Objects.nonNull(productModel))) {
			VidringLpTransactionModel lpTransactionModel = new VidringLpTransactionModel();
			lpTransactionModel.setAlias(alias);
			lpTransactionModel.setCountryCode(countryCode);
			lpTransactionModel.setOperatorId(operatorId);
			lpTransactionModel.setPartnerTransactionId(kpId);
			lpTransactionModel.setUserAgent(userAgent);
			lpTransactionModel.setProductId(productId);
			lpTransactionModel.setRequestDate(new Date());
			lpTransactionRepos.save(lpTransactionModel);
			model.addAttribute("kpId", kpId);
			model.addAttribute("productId", productId);
			model.addAttribute("countryCode","+"+ productModel.getCountryCode());
			model.addAttribute("alias", alias);
			model.addAttribute("description", productModel.getDescription());

		}
	}

}
