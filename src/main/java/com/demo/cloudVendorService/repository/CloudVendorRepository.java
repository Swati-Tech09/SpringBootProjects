package com.demo.cloudVendorService.repository;

import com.demo.cloudVendorService.model.CloudVendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;


public interface CloudVendorRepository extends JpaRepository<CloudVendor,String> {
    CloudVendor findByName(String vendorName);
}
