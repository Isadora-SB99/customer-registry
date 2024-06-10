package br.faccat.padarqsis.customerregistry.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "customers")
public class CustomerModel {

    private String id;
    private String name;
    @Email
    private String email;
    @Pattern(regexp = "^\\([1-9]{2}\\)9[0-9]{4}\\-?[0-9]{4}$")
    private String phone;
    private String address;
    private LocalDate birthDate;

}
