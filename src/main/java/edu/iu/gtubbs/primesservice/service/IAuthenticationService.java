package edu.iu.gtubbs.primesservice.service;

import edu.iu.gtubbs.primesservice.model.Customer;

import java.io.IOException;

public interface IAuthenticationService {

    Customer register(Customer customer) throws IOException;


}
