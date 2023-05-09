package com.jpa;

import java.util.List;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.dao.UserRepository;
import com.jpa.entities.User;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringBootJpaApplication.class, args);
		
		UserRepository userRepository = context.getBean(UserRepository.class);
		
//************************* For ADD User ******************************************		
		
		// .....................save single user...........
//		User user=new User();
//		user.setName("kinjal");
//		user.setCity("surat");
//		user.setStatus("java");
//		
//		User user1 = userRepository.save(user);
		
		// .....................save multiple users...........
		
//		User user1=new User();
//		user1.setName("smruti");
//		user1.setCity("surat");
//		user1.setStatus("react");
//		
//		User user2=new User();
//		user2.setName("chandni");
//		user2.setCity("surat");
//		user2.setStatus("python");
//		
//		List<User> users = List.of(user1,user2);
//		Iterable<User> result = userRepository.saveAll(users);
//		
//		result.forEach(user->{
//			System.out.println(user);
//		});
		
		
//		************************** for Update ( id=3)******************************
		
//		Optional<User> optional = userRepository.findById(3);
//		User user = optional.get();
//		System.out.println(user);
//		user.setName("Darshna");
//		
//		User result = userRepository.save(user);
//		System.out.println(result);
		
//		************************** find all data ******************************
		
//		Iterable<User> itr = userRepository.findAll();
//		itr.forEach(user->{System.out.println(user);});
		
//		************************** for Delete ( id=3)******************************
		
		userRepository.deleteById(3);
	}

}
