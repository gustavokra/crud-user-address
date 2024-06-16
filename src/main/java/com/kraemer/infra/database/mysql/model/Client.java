package com.kraemer.infra.database.mysql.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Client extends PanacheEntity implements Serializable {

    private String name;

    private MySqlAddress address;

    private boolean active;

    private LocalDateTime createdAt;

}
