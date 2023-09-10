package com.demo.cloudVendorService.service;

import com.demo.cloudVendorService.model.CloudVendor;

import java.util.List;

public interface CloudVendorInterface {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
}
