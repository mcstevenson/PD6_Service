package co.listeningear.codefest.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity(name = "JobDetail")
@Table(name = "jobDetail")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobDetailEntity  extends BaseEntity {

    @Id
    private Integer id;
    private String name;
    private String description;
    private boolean active;


    @OneToOne
    @JoinColumn(name="client_id",referencedColumnName = "id")
    private ClientEntity clientEntity;

    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String country;
    private String postCode;

}
