package com.kh.movie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.kh.movie.model.vo.Movie;
import com.kh.movie.service.MovieService;

@Controller
public class MovieController {

	@Autowired
	private MovieService service; // MovieService 주입
	
	/*
	@GetMapping("/")
	public String index(Model model) {
		List<Movie> list = service.selectAll();
		model.addAttribute("list", list);
		return "index";
	}
	
//	@GetMapping("/index")
//	public String index() {
//		return "redirect:/";
//	}
	
	@GetMapping("/add")
	public String add() {
		return "add";
	}
	
	@PostMapping("/add")
	public String add(Movie movie) {
		service.insert(movie);
		return "redirect:/";
	}
	*/
	
	
	@GetMapping("/")
	public String index(Model model) {
		model.addAttribute("list", service.movieList());
		return "index";
	}
	
	@GetMapping("/add")
	public String add() {
		return "add";
	}
	
	@PostMapping("/add")
	public String addMovie(Movie vo) {
		service.addMovie(vo);
		return "redirect:/";
	}
	
	
	@GetMapping("/delete")
	public String deleteMovie(int id) {
		service.deleteMovie(id);
		return "redirect:/";
	}
	
	/*
	@PostMapping("/delete")
	public String deleteMovie(int id) {
		service.deleteMovie(id);
		return "redirect:/";
	}
	*/
}
