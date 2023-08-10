package pl.klugeradoslaw.ex15logging.user;

import org.springframework.stereotype.Service;
import pl.klugeradoslaw.ex15logging.user.dto.UserDto;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public Optional<UserDto> findUserByEmail(String email) {
        return userRepository.findByEmail(email)
                .map(UserDtoMapper::map);
    }

}
