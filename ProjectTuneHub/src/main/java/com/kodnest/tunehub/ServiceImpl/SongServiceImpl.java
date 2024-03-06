package com.kodnest.tunehub.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.tunehub.Repository.SongRepository;
import com.kodnest.tunehub.Service.SongService;
import com.kodnest.tunehub.entity.Song;

@Service
public class SongServiceImpl implements SongService{
	@Autowired
	SongRepository songRepository;
	
	@Override
	public String addSong(Song song) {
		songRepository.save(song);
		return "Song added Successfully";
	}
	
	@Override
	public List<Song> fetchAllSongs(){
		List<Song> songs = songRepository.findAll();
		return songs;
	}
	
	@Override
	public boolean songExists(String name){
		Song song=songRepository.findByName(name);
		if(song==null) {
			return false;
		}
		else {
			return true;
		}
	}
	
	@Override
	public void updateSong(Song s) {
		songRepository.save(s);
	}
}
	
