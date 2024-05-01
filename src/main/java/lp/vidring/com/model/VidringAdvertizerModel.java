package lp.vidring.com.model;

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
@Table(name = "vidring_advertizer_detail")
@AllArgsConstructor
@NoArgsConstructor
public class VidringAdvertizerModel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String alias;
	@Column
	private Integer cut;
	@Column
	private Integer counter;
	@Column
	private Integer callbackLimit;
	@Column
	private Integer cappingLimit;
	@Column
	private String callbackUrl;
	@Column
	private String lpUrl;
	@Column
	private Boolean status;

}
