package mm.com.simpleapi.ak.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import mm.com.simpleapi.ak.dto.UserDto;
import mm.com.simpleapi.ak.service.UserService;

@RestController
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping("/")
	public ResponseEntity<List<UserDto>> home(){		
		List<UserDto> userList = userService.getUserList();	
		return ResponseEntity.status(HttpStatus.OK).body(userList);
	}
	
	@PostMapping("submitUser")
	public ResponseEntity<List<UserDto>> submitUser(@RequestBody UserDto userDto){	
		
		System.out.println("uid"+userDto.getUsername());
		
		List<UserDto> userList = userService.submitUser(userDto);
		return ResponseEntity.status(HttpStatus.OK).body(userList);
	}

}
