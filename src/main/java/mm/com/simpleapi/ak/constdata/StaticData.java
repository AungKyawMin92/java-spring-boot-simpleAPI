package mm.com.simpleapi.ak.constdata;

import java.util.ArrayList;
import java.util.List;
import mm.com.simpleapi.ak.dto.UserDto;

public class StaticData {	
	private static List<UserDto> userList = new ArrayList<UserDto>();

	public static List<UserDto> getUserList() {
		return userList;
	}

	

	
}
