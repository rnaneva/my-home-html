package bg.softuni.myhome.model.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity{

    @Column(nullable = false)
    private String names;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    @OneToMany
    private List<UserRoleEntity> roles;

    @OneToOne
    private AgencyEntity agency;

    @OneToOne
    private SearchEntity searchCriteria;

    public UserEntity() {
        this.roles = new ArrayList<>();
    }

    public String getNames() {
        return names;
    }

    public UserEntity setNames(String names) {
        this.names = names;
        return this;
    }

    public String getEmail() {
        return email;
    }

    public UserEntity setEmail(String email) {
        this.email = email;
        return this;
    }

    public String getUsername() {
        return username;
    }

    public UserEntity setUsername(String username) {
        this.username = username;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public UserEntity setPassword(String password) {
        this.password = password;
        return this;
    }

    public List<UserRoleEntity> getRoles() {
        return Collections.unmodifiableList(roles);
    }

    public UserEntity setRoles(List<UserRoleEntity> roles) {
        this.roles = roles;
        return this;
    }

    public void addRole(UserRoleEntity role){
        this.roles.add(role);
    }

    public AgencyEntity getAgency() {
        return agency;
    }

    public UserEntity setAgency(AgencyEntity agency) {
        this.agency = agency;
        return this;
    }

    public SearchEntity getSearchCriteria() {
        return searchCriteria;
    }

    public UserEntity setSearchCriteria(SearchEntity searchCriteria) {
        this.searchCriteria = searchCriteria;
        return this;
    }
}
