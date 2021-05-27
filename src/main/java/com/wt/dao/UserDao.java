package com.wt.dao;

import com.wt.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;


public interface UserDao {
    /**
     * 根据id查找用户
     * @return
     * @throws Exception
     */
    public List<User> findUserList(
            @Param("gender") Integer userList,
            @Param("userName") String userName) throws Exception;
    //查询所有用户的信息 根据性别和姓名（孙 模糊查询）

//    public List<User> get(
//            @Param("gender") Integer gender,@Param("userName") String userName)throws  Exception;
//根据用户编号id 修改用户信息  增删改返回的类型都是int（只能说findUseint 返回的行数）
    //用对象做参数最简单 增删改查 参数传对象最简单  resultType属性不用写（没有这属性）
    /**
     * 更新用户
     */
   public int updateUser(@Param("user") User user)throws  Exception;

    //查询所有用户的信息 根据性别和姓名（孙 模糊查询）参数传map <String,Object>
// public List<User> find(Map<String,Object> map)throws Exception;

    /**
     * 删除用户
     */
    public int deleteUser( User user)throws Exception ;
    /**
     * 增加用户
     */
    public int addUser( User user)throws Exception ;

    /**
     * 根据用户id获取对象
     */
    public int findUserRoleById(Integer userid)throws Exception ;


}
