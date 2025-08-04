package com.ozmenyavuz.dto;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerIU {

    @NotBlank(message = "İsim boş olamaz")
    @Size(max = 50)
    private String firstName;

    @NotBlank(message = "Soyisim boş olamaz")
    @Size(max = 50)
    private String lastName;

    @Email(message = "Geçerli bir email giriniz")
    @NotBlank
    private String email;

    @NotNull(message = "Doğum tarihi boş olamaz")
    private LocalDate birthDate;

    @NotBlank(message = "TC Kimlik numarası boş olamaz")
    @Size(min = 11, max = 11, message = "TC Kimlik numarası 11 haneli olmalıdır")
    private String nationalId;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getNationalId() {
        return nationalId;
    }

    public void setNationalId(String nationalId) {
        this.nationalId = nationalId;
    }
}
