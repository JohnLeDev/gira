package com.anlecybersoft.gira.role.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.anlecybersoft.gira.role.dto.GiraRoleDTO;
import com.anlecybersoft.gira.role.model.GiraRole;


@Mapper
public interface GiraRoleMapper {
	GiraRoleMapper INSTANCE = Mappers.getMapper(GiraRoleMapper.class);
	
	GiraRole mapToEntity(GiraRoleDTO dto);
}
