package azuredataapi.apiforweb.dto;

public class UserDto {
    private long id;
    private String name;
    private String email;
    private String password;

    public UserDto(long id, String name, String email, String password){
        this.id = id;
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public UserDto() {

    }

    public void setId(long id) {
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