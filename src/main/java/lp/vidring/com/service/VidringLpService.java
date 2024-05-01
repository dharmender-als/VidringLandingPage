package lp.vidring.com.service;

import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import lp.vidring.com.model.VidringAdvertizerModel;
import lp.vidring.com.repository.VidringAdvertizerRepos;
import lp.vidring.com.utils.DbUtils;

@Service
public class VidringLpService {

	@Autowired
	DbUtils dbUtils;
	@Autowired
	VidringAdvertizerRepos advertizerRepos;

	public String getLandingPage(String operatorId, String countryCode, String productId, String userAgent,
			String alias, String kpId, Model model) {
		VidringAdvertizerModel advertizerModel = advertizerRepos.findByAliasAndStatus(alias, true);
		if (Boolean.TRUE.equals(Objects.nonNull(advertizerModel)) || alias.equalsIgnoreCase("0")) {
			dbUtils.saveTransaction(operatorId, countryCode, productId, userAgent, alias, kpId, model);
			return "vidring-Lp.html";
		}
		return "vidring-error.html";
	}

}
