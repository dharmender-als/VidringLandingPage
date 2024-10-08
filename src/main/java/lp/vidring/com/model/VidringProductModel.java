package lp.vidring.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "vidring_product_config")
@Data
public class VidringProductModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String countryCode;
	@Column
	private String country;
	@Column
	private String pricePoint;
	@Column
	private String packType;
	@Column
	private String productId;
	@Column
	private Integer validity;
	@Column
	private String language;
	@Column
	private String currency;
	@Column
	private String offerCode;
	@Column
	private String operatorId;
	@Column
	private String operatorName;
	@Column
	private String subKeyword;
	@Column
	private String unsubKeyword;
	@Column
	private String mcc;
	@Column
	private String mnc;
	@Column
	private String campaign;
	@Column
	private String packName;
	@Column
	private String shortCode;
	@Column
	private String description;

}
