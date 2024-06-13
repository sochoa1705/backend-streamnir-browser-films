package com.unir.browserfilms.model.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Builder;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class SerieDto {
    private Long id;
    private String name;
    private String backdropPath;
    private BigDecimal voteAverage;
    private String overview;
    private Date firstAirDate;
}
