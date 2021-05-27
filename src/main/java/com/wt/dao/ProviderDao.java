package com.wt.dao;

import com.wt.pojo.Provider;
import org.apache.ibatis.annotations.Param;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

public interface ProviderDao {
    /**
     *     根据供应商编号 proCode 查询多个供应商
     *
     *     foreach动态查找  传list
     */
    public List <Provider > findListByCode(
            List <String> codes
    )throws Exception ;
    /**
     *     根据供应商编号 proCode 查询多个供应商
     *
     *     foreach动态查找  传数组array
     */
    public List<Provider> findArrayByCode(String[] codes);

    /**
     *     根据供应商编号 proCode 查询多个供应商
     *
     *     foreach动态查找  传数组map
     */
    public List<Provider> findMapByCode(Map<String,Object> map);



    /**
     *     根据供应商名字和描述全模糊查询
     *     使用动态sql
     *     查询时没有特殊要求直接list
     */

    public List <Provider>getByproNameAndByproDesc(
        @Param("proName") String proName,
        @Param("proDesc") String proDesc
    )throws Exception;
    /**
     * 更新供应商
     */
    public int updateProvider(Provider provider)throws  Exception;

    /**
     * 增加供应商数据
     */
    public int addProvider(Provider provider)throws  Exception;

}
