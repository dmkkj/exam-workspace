package com.kh.movie.model.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data @AllArgsConstructor
@NoArgsConstructor @Builder
public class Movie {
	private int id;
	private String title;
	private String genre;
	private String actor;
}
