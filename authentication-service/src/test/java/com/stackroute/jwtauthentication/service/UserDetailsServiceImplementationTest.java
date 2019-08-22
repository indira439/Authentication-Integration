//package com.stackroute.jwtauthentication.service;
//
//import com.stackroute.jwtauthentication.domain.Users;
//import com.stackroute.jwtauthentication.domain.UsersDTO;
//import com.stackroute.jwtauthentication.repository.UsersDetailsRepository;
//import org.junit.After;
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//import org.mockito.InjectMocks;
//import org.mockito.Mock;
//import org.mockito.MockitoAnnotations;
//
//import static org.mockito.ArgumentMatchers.any;
//import static org.mockito.Mockito.*;
//
//public class UserDetailsServiceImplementationTest {
//    private Users users;
//    @Mock
//    private UsersDetailsRepository usersDetailsRepository;
//    @InjectMocks
//    UserDetailsServiceImplementation userDetailsServiceImplementation;
//    private UsersDTO usersDTO;
//    @Before
//    public void setUp() {
//        //Initialising the mock object
//        MockitoAnnotations.initMocks(this);
//        usersDTO = new UsersDTO();
//        usersDTO.setUserName("Sush");
//        usersDTO.setPassword("newPassword");
//        users = new Users();
//        users.setUserName("Sush");
//        users.setPassword("newPassword");
//    }
//    @After
//    public void tearDown() {
//        this.usersDTO=null;
//        this.users=null;
//    }
//    @Test
//    public void givenUserDetailsToSaveShouldReturnSavedUserDetails() {
//        //act
//        when(usersDetailsRepository.save((Users) any())).thenReturn(users);
//        Users savedUser = userDetailsServiceImplementation.save(usersDTO);
//        //assert
//        Assert.assertEquals(usersDTO, savedUser);
//
//        //verify here verifies that trackRepository save method is only called once
//        verify(usersDetailsRepository, times(1)).save(users);
//    }
//}
