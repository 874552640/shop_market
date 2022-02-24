package com.ycc.market.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.type.Alias;

@Alias("User")
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private int userId;
    private String userName;
    private String userPassword;
    private String userRealName;
    private String userImage;
}

//userName="rick"&userPassword="12345"&userRealName="mike"&userImage="1.jpg"
