package com.Aperion.ShareGram.Repository;

import com.Aperion.ShareGram.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepo  extends JpaRepository<Users,Long> {
    Optional<Users> findByUsername(String username);
}
