package lp.vidring.com.utils;

import java.util.Date;
import java.util.List;
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

	public void saveTransaction(String operatorId, String countryCode, String userAgent, String alias, String kpId, Model model, String msisdn) {
		List<VidringProductModel> productModel = productRepo.findByCountryCodeAndOperatorId(countryCode, operatorId);
		if (Boolean.TRUE.equals(Objects.nonNull(productModel))) {
			long transactionId = (long) (Math.random() * 100000000000000L);
			VidringLpTransactionModel lpTransactionModel = new VidringLpTransactionModel();
			lpTransactionModel.setAlias(alias);
			lpTransactionModel.setCountryCode(countryCode);
			lpTransactionModel.setOperatorId(operatorId);
			lpTransactionModel.setPartnerTransactionId(kpId);
			lpTransactionModel.setUserAgent(userAgent);
			lpTransactionModel.setMsisdn(msisdn);
			lpTransactionModel.setRequestDate(new Date());
			lpTransactionModel.setTransactionId(String.valueOf(transactionId));
//			lpTransactionRepos.save(lpTransactionModel);
			model.addAttribute("kpId", kpId);
			model.addAttribute("countryCode", "+" + countryCode);
			model.addAttribute("code", countryCode);
			model.addAttribute("operatorId", operatorId);
			model.addAttribute("alias", alias);
			model.addAttribute("transactionId", transactionId);
			model.addAttribute("productModel", productModel);
			model.addAttribute("msisdn", msisdn);
		}
	}

}
