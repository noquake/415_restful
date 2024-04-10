package com.kwaku.restful.Controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.kwaku.restful.Models.Take;


import org.springframework.boot.SpringApplication; 
import org.springframework.boot.autoconfigure.SpringBootApplication; 
import org.springframework.http.ResponseEntity; 
import org.springframework.web.bind.annotation.GetMapping; 
import org.springframework.web.bind.annotation.PathVariable; 
import org.springframework.web.bind.annotation.RequestMapping; 
import org.springframework.web.bind.annotation.RequestParam; 
import org.springframework.web.bind.annotation.RestController; 

import java.util.Arrays; 
import java.util.List; 


@RestController
@RequestMapping("/users") 
class UserController { 

	@GetMapping("/{userId}") 
	public ResponseEntity<String> getUserDetails(@PathVariable Long userId) { 
		// Implementation to fetch user details based on the provided userId 
		String userDetails = "User details for user ID: " + userId; 
		return ResponseEntity.ok(userDetails); 
	} 

	@GetMapping("/search") 
	public ResponseEntity<List<String>> searchUsers(@RequestParam("name") String name) { 
		// Implementation to search users based on the provided name 
		List<String> users = Arrays.asList("John", "Jane", "Robert"); 
		return ResponseEntity.ok(users); 
	} 
} 



// @RestController
// // @RequestMapping("/take") // http://localhost:8080/takes
// public class TakesController {

//     // @GetMapping("/hello")
//     // public String welcome() { 
//     //     return ("welcome");
//     // }

//      Take take;

//     @GetMapping(value = "/take/{takeName}")
//     public String getTakeDetails(@PathVariable String takeName) { // http://localhost:8080/takes/
//         // return new Take();
//         return "{x:1}";
//     }

//     // @PostMapping("/takes", consumes = "application/json")
//     // public String createTakeDetails(@RequestBody Take take) {
//     //     this.take = take;
//     //     return "New take successfully created!";
//     // }

//     // @PutMapping
//     // public String updateTakeDetails(@RequestBody Take take) {
//     //     this.take = take;
//     //     return "New take successfully updated!";
//     // }

//     // @DeleteMapping("{takeName}")
//     // public String deleteTakeDetails(String takeName) {
//     //     this.take = null;
//     //     return "New take successfully deleted!";
//     // }

// }