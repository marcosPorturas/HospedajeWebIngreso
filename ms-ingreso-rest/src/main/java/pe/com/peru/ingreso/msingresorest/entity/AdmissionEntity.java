package pe.com.peru.ingreso.msingresorest.entity;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;

import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@Entity
@Table(name = "tbl_admission")
@Getter
@Setter
public class AdmissionEntity implements Serializable{

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer codAdmission;

	private Integer codClient;

	private Date admissionDate;

	private Integer memberInvite;

	private Double admissionPrice;
	
	private Integer enabled;

}
