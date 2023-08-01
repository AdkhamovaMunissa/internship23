package azuredataapi.apiforweb.service.impl;

// import azuredataapi.apiforweb.service.UserService;
// import azuredataapi.apiforweb.dto.UserDto;
// import azuredataapi.apiforweb.dto.LoginDto;
// import azuredataapi.apiforweb.repository.UserRepository;
// import azuredataapi.apiforweb.model.User;
// import java.util.Optional;
// import azuredataapi.apiforweb.response.LoginMessage;
// import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.security.crypto.password.PasswordEncoder;

public class UserImpl {

    // @Autowired
    // private UserRepository userRepository;

    // // @Autowired
    // // private PasswordEncoder passwordEncoder;
    
    // @Override
    // public String addUser(UserDto userDto) {
        
    //     User user = new User (
    //         userDto.getName(),
    //         userDto.getEmail(),
    //         userDto.getPassword()
    //         // this.passwordEncoder.encode(userDto.getPassword())
    //     );

    //     userRepository.save(user);
    //     return user.getName(); 
    // }

    // @Override   
    // public LoginMessage loginUser (LoginDto loginDto) {
    //     String msg = "";
    //     User user = userRepository.findByEmail(loginDto.getEmail());
    //     if (user != null) {
    //         String password = loginDto.getPassword();
    //         String encodedPassword = user.getPassword();
    //         Boolean isPwdCorrect = password.equals(encodedPassword);
    //         if(isPwdCorrect) {
    //             Optional<User> user1 = userRepository.findOneByEmailAndPassword(loginDto.getEmail(), encodedPassword);
    //             if(user1.isPresent()) {
    //                 return new LoginMessage("Login success", true);
    //             } else {
    //                 return new LoginMessage("Login failed", false);
    //             }
    //         } else {
    //             return new LoginMessage("Password mismatch", false);
    //         }

    //     } else {
    //         return new LoginMessage("Email does not exist", false);
    //     }
    // }
}