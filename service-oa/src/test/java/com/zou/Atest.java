package com.zou;

import com.atguigu.model.system.SysRole;
import com.zou.mappers.SysRoleMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

@SpringBootTest
public class Atest {
    @Autowired
    private SysRoleMapper sysRoleMapper;
    @Test
    public  void getAll(){
        List<SysRole> sysRoles = sysRoleMapper.selectList(null);
        System.out.println(sysRoles);

    }
}
