package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.List;

@Data
@EqualsAndHashCode(callSuper = true)
@Table(name = "user")
@NoArgsConstructor
@SuperBuilder
@Entity
public class User extends BaseModel implements UserDetails {

    //private Profile profil;

    // private com.centoria.annuaire.common.model.Gender gender;

    private String firstName;

    private String lastName;

    private String email;


    private String password;

    private String tel;

    private String fax;

    private String validationCode;

    // private com.centoria.annuaire.common.model.Address address;

    // private com.centoria.annuaire.common.model.Photo photo;

    private String rememberToken;

    private String resetPasswordToken;

    private String expiredResetPasswordToken;

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return List.of(new SimpleGrantedAuthority("ROLE_USER"));
    }

    @Override
    public String getUsername() {
        return email;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
