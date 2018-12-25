package com.zombie.demo.domain.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user")
public class User implements Serializable {

    private static final long serialVersionUID = 4752269069049337230L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    private String username;

    @Column(name = "password")
    private String password;


    @ManyToMany
    @JoinTable(
            name = "user_authority",
            foreignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT),
            inverseForeignKey = @ForeignKey(name = "none", value = ConstraintMode.NO_CONSTRAINT),
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "authority_id", referencedColumnName = "id")}
//            ,foreignKey = @ForeignKey(name = "none",value = ConstraintMode.NO_CONSTRAINT)
    )
    private List<Authority> authorities = new ArrayList<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(List<Authority> authorities) {
        this.authorities = authorities;
    }
}
