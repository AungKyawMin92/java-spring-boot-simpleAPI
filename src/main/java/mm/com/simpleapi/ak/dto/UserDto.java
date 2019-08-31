package mm.com.simpleapi.ak.dto;

import java.io.Serializable;

import lombok.Data;

@Data
public class UserDto implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1095551691430780580L;
	private Integer uid;
	private String fullName;
	private String username;
	private String password;

}
