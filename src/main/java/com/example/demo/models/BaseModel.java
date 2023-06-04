package com.example.demo.models;


import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.stereotype.Indexed;

import java.time.ZonedDateTime;

@Data
@NoArgsConstructor
@SuperBuilder
public abstract class BaseModel {

    @Id
    private String id;

    private Long idSql;

    private boolean valid;

    @CreatedDate
    protected ZonedDateTime createdAt;

    @LastModifiedDate
    protected ZonedDateTime updatedAt;

}
