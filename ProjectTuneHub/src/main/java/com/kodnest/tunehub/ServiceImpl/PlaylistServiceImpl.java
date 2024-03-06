package com.kodnest.tunehub.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kodnest.tunehub.Repository.PlaylistRepository;
import com.kodnest.tunehub.Service.PlaylistService;
import com.kodnest.tunehub.entity.Playlist;

@Service
public class PlaylistServiceImpl  implements PlaylistService{
	
	@Autowired
	PlaylistRepository playlistRepository;
	
	@Override
	public void addplaylist(Playlist playlist) {
		playlistRepository.save(playlist);

}
	
	@Override
	public List<Playlist> fetchAllPlaylists(){
		List<Playlist> allPlaylist = playlistRepository.findAll();
		return allPlaylist;
	}
}