package com.ciwei.mongo.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class User implements Serializable {
   
   private String id;

   private String userName;

   private String password;

   private int age;

   private long createTime;
   
}
