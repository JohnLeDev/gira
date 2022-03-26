package com.anlecybersoft.gira.role.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.anlecybersoft.gira.role.dto.GiraGroupDTO;
import com.anlecybersoft.gira.role.model.GiraGroup;

@Mapper
public interface GiraGroupMapper {
	GiraGroupMapper INSTANCE = Mappers.getMapper(GiraGroupMapper.class);
	
	GiraGroupDTO toDTO(GiraGroup model);
}
