package com.example.testsprinboot.demo.controllers;

import com.example.testsprinboot.demo.model.User;
import com.example.testsprinboot.demo.repository.UserRepository;
import com.google.common.collect.ImmutableList;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.doThrow;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class UserComtrollerTest {
    @Mock
    private UserRepository userRepository;
    @InjectMocks
    UserComtroller userComtroller;

    @Test
    public void show() {
        when(userComtroller.user()).thenReturn(ImmutableList.of());
        List<User> list = (List<User>) userComtroller.user();
        verify(userComtroller).user();
    }

}