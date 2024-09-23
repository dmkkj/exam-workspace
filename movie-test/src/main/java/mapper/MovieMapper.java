package mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.kh.movie.model.vo.Movie;

@Mapper
public interface MovieMapper {
	void insert(Movie movie); // 영화 추가
	List<Movie> selectAll(); // 영화 목록 조회
	void delete(int id); // 영화 삭제
}
