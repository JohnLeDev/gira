package com.anlecybersoft.gira.role.service;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anlecybersoft.gira.role.dto.GiraGroupDTO;
import com.anlecybersoft.gira.role.mapper.GiraGroupMapper;
import com.anlecybersoft.gira.role.model.GiraGroup;
import com.anlecybersoft.gira.role.repository.GiraGroupRepository;
@Service
public class GiraGroupServiceImpl implements GiraGroupService {

	
	@Autowired
	private GiraGroupRepository repository;
	@Override
	public List<GiraGroupDTO> findAllDto() {
		// TODO Auto-generated method stub
		
		List<GiraGroup > groups = repository.findAll();
		List<GiraGroupDTO> dtos = groups.stream()
				.map( t -> GiraGroupMapper.INSTANCE.toDTO(t))
				.collect(Collectors.toList() );
		return dtos;
	}

	@Override
	public GiraGroupDTO createNewGroup(GiraGroupDTO dto) {
		// TODO Auto-generated method stub
		return null;
	}

}
