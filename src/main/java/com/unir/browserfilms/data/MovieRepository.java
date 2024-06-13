package com.unir.browserfilms.data;

import com.unir.browserfilms.model.pojo.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public interface MovieRepository extends JpaRepository<Movie, Long>, JpaSpecificationExecutor<Movie>{
    List<Movie> findByTitle(String title);

    List<Movie> findByReleaseDateBetween(Date releaseDate, Date releaseDate2);

    List<Movie> findByVoteAverage(BigDecimal voteAverage);

}
