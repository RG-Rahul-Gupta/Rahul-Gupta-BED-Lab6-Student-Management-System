package com.glearning.studentenrollment.repository;



import org.springframework.data.jpa.repository.JpaRepository;

import com.glearning.studentenrollment.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long>{

	Users findByUserName(String userName);

}
