package com.handson.beers.model.dto;

import com.handson.beers.model.entity.BeerEntity;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@AllArgsConstructor
public class BeerResponse {
    private Integer id;
    private String name;
    private Double price;
    private String description;
    private Double alcoholByVolume;
    private String type;

    public static BeerResponse valueOf (BeerEntity entity) {
        return BeerResponse.builder()
                .id(entity.getId())
                .name(entity.getName())
                .price(entity.getPrice())
                .description(entity.getDescription())
                .alcoholByVolume(entity.getAlcoholByVolume())
                .type(entity.getType())
                .build();
    }
}