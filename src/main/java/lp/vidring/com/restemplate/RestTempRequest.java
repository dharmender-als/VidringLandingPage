package lp.vidring.com.restemplate;

import lombok.Data;

@Data
public class RestTempRequest {
	private String msisdn;
	private String productId;
	private String channel;
	private String operatorId;
	private String countryCode;
	private String otp;
	private String transactionId;

}
