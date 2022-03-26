package com.anlecybersoft.gira.role.service;

import java.util.List;

import com.anlecybersoft.gira.role.dto.GiraGroupDTO;

public interface GiraGroupService {
	List<GiraGroupDTO> findAllDto();
	GiraGroupDTO createNewGroup(GiraGroupDTO dto);
}
