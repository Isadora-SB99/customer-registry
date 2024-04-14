package br.faccat.padarqsis.customerregistry.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Pattern;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

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

    public CustomerModel() {
    }

    public CustomerModel(String id, String name, String email, String phone, String address, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.birthDate = birthDate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}
