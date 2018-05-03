package com.jsee.gona.demo.controller;

import com.jsee.gona.demo.dao.CustomerDao;
import com.jsee.gona.demo.domain.Customer;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.*;

@Controller
@RequestMapping("/")
public class CustomerController {

    @Resource
    CustomerDao customerDao;

    @GetMapping("/getCusList")
    public List<Customer> getUserList(){
        List<Customer> customerList = customerDao.getAllCustomer();
        return  customerList;
    }

    @GetMapping("/hello")
    public String indexPage(ModelMap modelMap){
        modelMap.addAttribute("host","刘亦菲");
        return "index";
    }


}
