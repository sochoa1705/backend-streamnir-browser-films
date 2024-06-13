package com.unir.browserfilms.model.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "MOVIE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Movie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "TITLE", nullable = false)
    private String title;
    @Column(name = "BACKDROP_PATH", nullable = false)
    private String backdropPath;
    @Column(name = "VOTE_AVERAGE", precision = 2, scale = 2, nullable = false)
    private BigDecimal voteAverage;
    @Column(name = "OVERVIEW", nullable = false)
    private String overview;
    @Temporal(TemporalType.DATE)
    @Column(name = "RELEASE_DATE", nullable = false)
    private Date releaseDate;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    public void update(MovieDto movieDto){
        this.title = movieDto.getTitle();
        this.backdropPath = movieDto.getBackdropPath();
        this.voteAverage = movieDto.getVoteAverage();
        this.overview = movieDto.getOverview();
        this.releaseDate = movieDto.getReleaseDate();
    }
}
