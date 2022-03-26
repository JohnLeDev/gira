package com.anlecybersoft.gira.role.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anlecybersoft.gira.role.dto.GiraRoleDTO;
import com.anlecybersoft.gira.role.mapper.GiraRoleMapper;
import com.anlecybersoft.gira.role.model.GiraRole;
import com.anlecybersoft.gira.role.repository.GiraRoleRepository;
@Service
public class GiraRoleServiceImpl implements GiraRoleService{
	
	@Autowired 
	private GiraRoleRepository giraRoleRepository;
	@Override
	public List<GiraRole> findAllEntity() {
		// TODO Auto-generated method stub
		return giraRoleRepository.findAll();
	}

	@Override
	public GiraRole save(GiraRoleDTO dto) {
		// TODO Auto-generated method stub
		GiraRole role = GiraRoleMapper.INSTANCE.mapToEntity(dto);
		return giraRoleRepository.save(role);
	}

}
