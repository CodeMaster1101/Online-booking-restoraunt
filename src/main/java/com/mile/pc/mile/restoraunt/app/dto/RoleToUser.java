package com.mile.pc.mile.restoraunt.app.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RoleToUser {
	private String type;
	private String username;
}