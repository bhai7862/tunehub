package com.kodnest.tunehub.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kodnest.tunehub.entity.Song;

public interface SongRepository  extends JpaRepository<Song,Integer>{
	
	public Song findByName(String name);

}
