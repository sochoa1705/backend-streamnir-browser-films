package com.unir.browserfilms.model.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateMovieRequest {
    private String title;
    private String backdropPath;
    private BigDecimal voteAverage;
    private String overview;
    private Date releaseDate;
}
