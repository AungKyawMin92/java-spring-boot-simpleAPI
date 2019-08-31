package mm.com.simpleapi.ak.service;

import java.util.List;

import org.springframework.stereotype.Service;

import mm.com.simpleapi.ak.constdata.StaticData;
import mm.com.simpleapi.ak.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{

	@Override
	public List<UserDto> getUserList() {
		return StaticData.getUserList();
	}

	@Override
	public List<UserDto> submitUser(UserDto userDto) {		
		StaticData.getUserList().add(userDto);
		return StaticData.getUserList();
	}

}
