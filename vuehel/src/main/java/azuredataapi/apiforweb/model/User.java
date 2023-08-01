package azuredataapi.apiforweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "users")
public class User {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(name = "name")
  private String name;

  @Column(name = "email")
  private String email;

  @Column(name = "password", length = 255)
  private String password;

  public User(){

  }
  
  public User(String name, String email, String password){
    // this.id = id;
    this.name = name;
    this.email = email;
    this.password = password;
  }


  public void setId(Long id) {
    this.id = id;
  }
  
  public long getId() {
    return id;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getEmail() {
    return email;
  }
  
  public void setPassword(String password) {
    this.password = password;
  }

  public String getPassword() {
    return password;
  }


  @Override
  public String toString() {
    return "User [id=" + id + ", name=" + name + ", email=" + email + "]";
  }

}  
