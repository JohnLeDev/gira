package com.anlecybersoft.gira.role.model;

import java.time.LocalDateTime;

import java.util.LinkedHashSet;
import java.util.Set;
import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.anlecybersoft.gira.common.model.BaseEntity;

import org.hibernate.annotations.ManyToAny;
import org.hibernate.annotations.Type;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;



@Getter
@Setter
@SuperBuilder
@NoArgsConstructor
@Entity
@Table(name= "gira_role")
public class GiraRole extends BaseEntity{
    // id ,code description groups

    /**
	 * 
	 */
	private static final long serialVersionUID = -4483395801676303929L;
	@Size(min = 5 ,max=5)
    private String code;
    @NotBlank
    private String description;

  
    @ManyToMany(mappedBy = "giraRoles")
    private Set<GiraGroup> giraGroups = new LinkedHashSet<>();
}
