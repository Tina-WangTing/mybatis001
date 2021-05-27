package com.wt.pojo;

import lombok.*;



@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString  //重写这个方法  字符串拼接
public class User {
    private Integer id;//用户id
    private String userCode;//用户编码
    private String userName;//用户姓名
    private String userPassword;//用户密码
    private Integer gender;//性别
    private String birthday;//生日
    private String phone;//用户电话
    private String address;//地址
    private String creationDate;//创建者
    private Integer createdBy;//创建时间
    private Integer modifyBy;//更新者
    private String modifyDate;//更新时间

    //private Integer userRole;//用户角色


//    private Integer roleid;
//    private String roleCode;
//    private String roleName;
//    对象角色
//    private Role userRole;
//
////    地址集合
//    private List<Address> addressList;
//
//
//    public User() {
    }




