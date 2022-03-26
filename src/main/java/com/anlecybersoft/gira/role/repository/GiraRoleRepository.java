package com.anlecybersoft.gira.role.repository;

import java.util.UUID;

import com.anlecybersoft.gira.role.model.GiraRole;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GiraRoleRepository extends JpaRepository<GiraRole,UUID> {
    
}
