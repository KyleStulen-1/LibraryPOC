package com.kyle.library.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.kyle.library.library.Library;
import com.kyle.library.library.LibraryService;

@Component
public class InitializeLibraryPOC implements CommandLineRunner{
	
	@Autowired
	LibraryService libraryService;

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		//initialize library
		System.out.println("RUNNER HERE RUNNER HERE RUNNER HERE");
		libraryService.save(new Library("Jackson Library", "12th Street"));
		libraryService.save(new Library("Kelly Library", "22nd Street"));
		//add three books
		
	}
}
