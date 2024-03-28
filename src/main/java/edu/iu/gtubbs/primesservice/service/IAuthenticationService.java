package edu.iu.gtubbs.primesservice.service;

import edu.iu.gtubbs.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {

    boolean register(Customer customer) throws IOException;


}
