package com.demo.cloudVendorService.controller;

import com.demo.cloudVendorService.model.CloudVendor;
import com.demo.cloudVendorService.service.impl.CloudVendorServiceImpl;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cloudvendor")
public class cloudVendorController {

    CloudVendor cloudVendor;
    CloudVendorServiceImpl cloudVendorServiceImpl;

    public cloudVendorController(CloudVendorServiceImpl cloudVendorServiceImpl) {
        this.cloudVendorServiceImpl = cloudVendorServiceImpl;
    }

    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(@PathVariable String vendorId)
    {
        return cloudVendorServiceImpl.getCloudVendor(vendorId);

    }

    @GetMapping("{vendorName}")
    public CloudVendor getCloudVendor(@PathVariable String vendorName)
    {
        return cloudVendorServiceImpl.getCloudVendorName(vendorName);

    }

    @GetMapping
    public List<CloudVendor> getCloudVendorDetails()
    {
        return cloudVendorServiceImpl.getAllCloudVendors();

    }

    @PostMapping
    public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorServiceImpl.createCloudVendor(cloudVendor);
        return "Cloud Vendor created Successfully";
    }

    @PutMapping
    public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        cloudVendorServiceImpl.updateCloudVendor(cloudVendor);
        return "Cloud Vendor updated Successfully";
    }

    @DeleteMapping("{vendorId}")
    public String deleteCloudVendorDetails(@PathVariable String vendorId)
    {
        cloudVendorServiceImpl.deleteCloudVendor(vendorId);
        return "Cloud Vendor Deleted Successfully";
    }
}
