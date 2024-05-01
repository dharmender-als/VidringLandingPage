package lp.vidring.com.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "vidring_lp_transaction")
@AllArgsConstructor
@NoArgsConstructor
public class VidringLpTransactionModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String msisdn;
	@Column
	private String alias;
	@Column(nullable = false)
	private Date requestDate;
	@Column
	private String partnerTransactionId;
	@Column
	private String userAgent;
	@Column
	private String productId;
	@Column
	private String countryCode;
	@Column
	private String operatorId;

}
