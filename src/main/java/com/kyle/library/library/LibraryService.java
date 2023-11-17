package com.kyle.library.library;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibraryService {
	
	@Autowired
	private LibraryRepository libraryRepository;
	
	public List<Library> getAllLibraries(){
		return libraryRepository.findAll();
	}

	public void save(Library library) {
		libraryRepository.save(library);
	}
	
	public Library getById(Long id) {
		Library lib = libraryRepository.findById(id).get();
		return lib;
	}
}
