package com.kh.movie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kh.movie.model.vo.Movie;

import mapper.MovieMapper;

@Service
public class MovieService {
	
	@Autowired
	private MovieMapper mapper; // MovieMapper 주입
	
	public void addMovie(Movie movie) {
		mapper.insert(movie);
	}
	
	/* 영화 목록 정보를 받아오기 위해 List로 처리 */
	public List<Movie> movieList() {
		return mapper.selectAll();
	}
		
	public void deleteMovie(int id) {
		mapper.delete(id);
	}
	
}