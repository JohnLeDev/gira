package com.anlecybersoft.gira.role.service;

import java.util.List;

import com.anlecybersoft.gira.role.dto.GiraRoleDTO;
import com.anlecybersoft.gira.role.model.GiraRole;

public interface GiraRoleService {
	List<GiraRole> findAllEntity();
	GiraRole save(GiraRoleDTO dto);
}
