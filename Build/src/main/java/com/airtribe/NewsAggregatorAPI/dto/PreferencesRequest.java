package com.airtribe.NewsAggregatorAPI.dto;

public class PreferencesRequest {
    private String country;
    private String language;
    private String category;
    private String keyword;

    public PreferencesRequest() {
    }

    public PreferencesRequest(String country, String language, String category, String keyword) {
        this.country = country;
        this.language = language;
        this.category = category;
        this.keyword = keyword;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getKeyword() {
        return keyword;
    }

    public void setKeyword(String keyword) {
        this.keyword = keyword;
    }
}
