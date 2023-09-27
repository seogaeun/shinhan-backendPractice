package com.example.service;


import com.example.domain.entity.Actor;
import com.example.domain.entity.Director;
import com.example.domain.entity.Movie;
import com.example.domain.response.MovieResponse;
import com.example.repository.MovieRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyLong;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class MovieServiceTest {
    @Mock
    private MovieRepository movieRepository;

    @Mock
    private LogService logService;

    @InjectMocks
    private MovieService movieService;


    @Test
    public void 영화단건조회_불가_테스트(){
        //given
        int movieId = 1;
        Movie movie = new Movie();
        movie.setName("hello");
        movie.setDirector(new Director());
        movie.setActors(List.of(new Actor()));

        //when
        when(movieRepository.findById(anyLong())).thenReturn(null);
//        when(movieRepository.findById(any())).thenThrow();

        //then
        MovieResponse movieResponse = movieService.getMovie(movieId);
        doNothing().when(logService).saveLog();
//        assertThrows(NullPointerException.class, ()->movieService.getMovie(movieId));
//        assertNotNull(result);
    }

}
