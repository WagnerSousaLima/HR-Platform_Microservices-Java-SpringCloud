package com.ms_springcloud.hruser.repositories;

import com.ms_springcloud.hruser.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long>{

    User findByEmail(String email);
}
