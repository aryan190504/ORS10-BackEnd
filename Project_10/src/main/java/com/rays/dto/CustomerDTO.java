package com.rays.dto;

import java.util.LinkedHashMap;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import com.rays.common.BaseDTO;

@Entity
@Table(name = "ST_CUSTOMER")
public class CustomerDTO extends BaseDTO {

    @Column(name = "CLIENT_NAME", length = 50)
    private String clientName;

    @Column(name = "LOCATION", length = 50)
    private String location;

    @Column(name = "CONTACT_NUMBER", length = 20)
    private String contactNumber;

    @Column(name = "IMPORTANCE", length = 50)
    private String importance;

    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    @Override
    public String getKey() {
        return id + "";
    }

    @Override
    public String getValue() {
        return clientName;
    }

    @Override
    public String getLabel() {
        return "Client Name";
    }

    // ✅ These two methods are critical for unique key logic
    @Override
    public String getUniqueKey() {
        return "clientName";  // Column name in DB
    }

    @Override
    public String getUniqueValue() {
        return clientName;    // Value of that column
    }

    @Override
    public LinkedHashMap<String, String> orderBY() {
        LinkedHashMap<String, String> map = new LinkedHashMap<>();
        map.put("clientName", "asc");
        return map;
    }

    @Override
    public LinkedHashMap<String, Object> uniqueKeys() {
        LinkedHashMap<String, Object> map = new LinkedHashMap<>();
        map.put("clientName", clientName);
        return map;
    }
}
