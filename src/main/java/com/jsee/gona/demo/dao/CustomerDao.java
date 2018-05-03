package com.jsee.gona.demo.dao;

import com.jsee.gona.demo.domain.Customer;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CustomerDao {
    List<Customer> getAllCustomer();
}
