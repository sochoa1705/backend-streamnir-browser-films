package com.unir.browserfilms.model.pojo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.Version;

import java.math.BigDecimal;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.Builder;
import lombok.ToString;

@Entity
@Table(name = "SERIE")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class Serie {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", nullable = false)
    private Long id;
    @Column(name = "NAME", length = 250, nullable = false)
    private String name;
    @Column(name = "BACKDROP_PATH", length = 250, nullable = false)
    private String backdropPath;
    @Column(name = "VOTE_AVERAGE", precision = 2, scale = 2, nullable = false)
    private BigDecimal voteAverage;
    @Column(name = "OVERVIEW", length = 1000, nullable = false)
    private String overview;
    @Temporal(TemporalType.DATE)
    @Column(name = "FIRST_AIR_DATE", nullable = false)
    private Date firstAirDate;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;
}
