package com.demo.cloudVendorService.service.impl;

import com.demo.cloudVendorService.model.CloudVendor;
import com.demo.cloudVendorService.repository.CloudVendorRepository;
import com.demo.cloudVendorService.service.CloudVendorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CloudVendorServiceImpl implements CloudVendorInterface {
   @Autowired
   CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }


    @Override
    public String createCloudVendor(CloudVendor cloudVendor) {
         cloudVendorRepository.save(cloudVendor);
         return "CloudVendor Created";
    }

    @Override
    public String updateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "CloudVendor Updated";
    }

    @Override
    public String deleteCloudVendor(String cloudVendorId) {
        cloudVendorRepository.deleteById(cloudVendorId);
        return "Deleted CloudVendor";
    }

    @Override
    public CloudVendor getCloudVendor(String cloudVendorId) {
        return cloudVendorRepository.findById(cloudVendorId).get();
    }



    @Override
    public List<CloudVendor> getAllCloudVendors() {
        return cloudVendorRepository.findAll();
    }

    public CloudVendor getCloudVendorName(String vendorName) {
        return cloudVendorRepository.findByName(vendorName);
    }
}
