package com.kyle.library.library;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

//JpaRepository<Type, ID>
@Repository
public interface LibraryRepository extends JpaRepository<Library, Long> {

}
