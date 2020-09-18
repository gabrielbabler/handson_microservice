package com.handson.beers.model.dto;

import java.util.Objects;

public class BeerRequest {
    private String name;
    private Double price;
    private String description;
    private Double alcoholByVolume;
    private String type;

    public BeerRequest(String name, Double price, String description, Double alcoholByVolume, String type) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.alcoholByVolume = alcoholByVolume;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getAlcoholByVolume() {
        return alcoholByVolume;
    }

    public void setAlcoholByVolume(Double alcoholByVolume) {
        this.alcoholByVolume = alcoholByVolume;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public static class BeerRequestBuilder {
        private String name;
        private Double price;
        private String description;
        private Double alcoholByVolume;
        private String type;

        public BeerRequestBuilder name(String name) {
            this.name = name;
            return this;
        }

        public BeerRequestBuilder price(Double price) {
            this.price = price;
            return this;
        }

        public BeerRequestBuilder description(String description) {
            this.description = description;
            return this;
        }

        public BeerRequestBuilder alcoholByVolume(Double alcoholByVolume) {
            this.alcoholByVolume = alcoholByVolume;
            return this;
        }

        public BeerRequestBuilder type(String type) {
            this.type = type;
            return this;
        }

        public BeerRequest build() {
            return new BeerRequest(name, price, description, alcoholByVolume, type);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BeerRequest that = (BeerRequest) o;
        return Objects.equals(name, that.name) &&
                Objects.equals(price, that.price) &&
                Objects.equals(description, that.description) &&
                Objects.equals(alcoholByVolume, that.alcoholByVolume) &&
                Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, price, description, alcoholByVolume, type);
    }
}
