package com.lcwd.electronic.store.entities;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="roles")
@Builder
public class Role {
    @Id
    private String roleId;

    private String roleName;
}
