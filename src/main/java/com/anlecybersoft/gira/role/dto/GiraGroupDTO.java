package com.anlecybersoft.gira.role.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class GiraGroupDTO {
	
	@Size(min = 5, max = 5, message = "Role Code must be 5 characters.")
	private String code;
	@NotBlank(message = "Description must be not blank.")
	private String description;
}
