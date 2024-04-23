package com.nidhi.Loan.controller;

import com.nidhi.Loan.service.UserLoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserLoanController {
    @Autowired
    UserLoanService userLoanService;

}
