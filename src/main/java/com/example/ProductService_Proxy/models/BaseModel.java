package com.example.ProductService_Proxy.models;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

//lombok has usefull annotations like Getter,Setter which saves us from manually adding getter/setter functions.
@Getter
@Setter
public class BaseModel {
    private Long id;
    private Date createdAt;
    private Date lastUpdatedAt;
    private boolean isDeleted;

}
