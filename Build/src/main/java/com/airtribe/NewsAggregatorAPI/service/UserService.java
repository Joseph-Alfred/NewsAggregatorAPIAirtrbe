package com.airtribe.NewsAggregatorAPI.service;

import com.airtribe.NewsAggregatorAPI.dto.LoginRequest;
import com.airtribe.NewsAggregatorAPI.dto.PreferencesRequest;
import com.airtribe.NewsAggregatorAPI.dto.RegisterRequest;
import org.springframework.stereotype.Service;

@Service
public interface UserService {

    void register(RegisterRequest request);
    void login(LoginRequest request);
    void getUserPreferences(String username);
    void updatePreferences(String username, PreferencesRequest request);
}
