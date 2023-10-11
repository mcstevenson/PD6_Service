package co.listeningear.codefest.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity(name = "Client")
@Table(name = "client")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientEntity extends BaseEntity {

    @Id
    private Integer id;

    private String firstName;

    private String lastName;

    private String email;

    private String mobile;

    private LocalDate dob;

    private boolean active;

    private String addressLine1;
    private String addressLine2;
    private String addressLine3;
    private String city;
    private String country;
    private String postCode;
}
