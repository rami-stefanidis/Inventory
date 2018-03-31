package com.rami.controller;


import com.rami.model.Customer;
import com.rami.model.response.InsertCustomerResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerController {

    final Logger LOG = LoggerFactory.getLogger(getClass());

    @RequestMapping(value = "/insertcustomer", method = RequestMethod.POST)
    public ResponseEntity<InsertCustomerResponse> insert(final Customer customer) {
        LOG.info("insert invoked. customer = {}",customer);
        final InsertCustomerResponse insertCustomerResponse = new InsertCustomerResponse();
        insertCustomerResponse.setStatus("SUCCESS");

        return new ResponseEntity<>(insertCustomerResponse, HttpStatus.OK);
    }

}
