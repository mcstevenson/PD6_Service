package co.listeningear.codefest.entity;

import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.time.LocalDateTime;

@Getter
@Setter
@MappedSuperclass
public class BaseEntity implements Serializable,Cloneable{

    protected String createdBy;
    protected LocalDateTime createdAt;
    protected String lastModifiedBy;
    protected LocalDateTime lastModifiedAt;
    protected int auditVersion;
}