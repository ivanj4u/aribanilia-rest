package com.aribanilia.rest.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by ivan_j4u on 5/29/2017.
 */
@Controller
@RequestMapping("/home")
public class HomeController {

    private static final Logger logger = LoggerFactory.getLogger(HomeController.class);

    @PreAuthorize("hasAuthority('USER_VIEW')")
    @GetMapping("/view")
    public String view() {
        logger.info("Request View : /home/view ");
        return "Approved";
    }

    @PreAuthorize("hasAuthority('USER_EDIT')")
    @PostMapping("/user")
    @ResponseStatus(HttpStatus.CREATED)
    public void edit(@RequestBody Object o){
        logger.info("Post Edit : /home/edit");
    }

}
