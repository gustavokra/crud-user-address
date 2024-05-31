package org.acme.infra.database.mysql.model;

import java.io.Serializable;
import java.time.LocalDateTime;

import io.quarkus.hibernate.orm.panache.PanacheEntity;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "country")
public class Country extends PanacheEntity implements Serializable {

    private String description;

    private String acronym;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

    private LocalDateTime disabledAt;

}
