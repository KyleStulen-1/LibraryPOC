package com.kyle.library.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibraryController {
	@Autowired
	private LibraryService libraryService;
	
	@GetMapping("/getalllibraries")
	public ResponseEntity<List<Library>> getAllLibraries(){
		List<Library> libs = libraryService.getAllLibraries();
		return new ResponseEntity<List<Library>>(libs, HttpStatus.OK);
	}
	
	@GetMapping("/getstatus")
	public ResponseEntity<?> getStatus(){
		return new ResponseEntity<>(HttpStatus.OK);
	}
}
