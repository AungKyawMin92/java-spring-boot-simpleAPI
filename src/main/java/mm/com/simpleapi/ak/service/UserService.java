package mm.com.simpleapi.ak.service;

import java.util.List;

import mm.com.simpleapi.ak.dto.UserDto;

public interface UserService {

	List<UserDto> getUserList();

	List<UserDto> submitUser(UserDto userDto);

}
