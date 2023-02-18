package com.rajesh.blogapi;

import com.rajesh.blogapi.model.Post;
import com.rajesh.blogapi.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.time.LocalDateTime;

@SpringBootApplication
public class BlogApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BlogApiApplication.class, args);
    }
    @Bean
    CommandLineRunner runner(PostRepository repository) {
        return args -> {
            Post post1 = new Post();
            post1.setTitle("My First Post");
            post1.setContent("This is my first post");
            post1.setSlug("my-first-post");
            post1.setDateCreated(LocalDateTime.now());
            repository.save(post1);

            System.out.println("Inserted a post: " + post1);

        };
    }

}
