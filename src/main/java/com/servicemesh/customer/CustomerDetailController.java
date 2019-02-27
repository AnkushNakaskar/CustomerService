package com.servicemesh.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
@Slf4j
public class CustomerDetailController {

    @GetMapping
    public ResponseEntity<String> getCustomerDetails() {
        return new ResponseEntity<String>("CustomerDetail service", HttpStatus.OK);
    }
}
