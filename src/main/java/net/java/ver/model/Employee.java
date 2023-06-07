package net.java.ver.model;
//import javax.persistence.*;
import jakarta.persistence.*;

import lombok.Data;

@Data
@Entity
@Table(name="users")

public class Employee {
@Id
@GeneratedValue(strategy= GenerationType.IDENTITY)
private long id;

@Column(name="email")
private String email;


@Column(name="username")
private String username;

@Column(name="mobilenumber")
private String mobilenumber;

@Column(name="password")
private String password;

}

