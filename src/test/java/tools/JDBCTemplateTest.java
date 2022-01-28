package tools;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Project name(项目名称)：JDBC框架之多表查询
 * Package(包名): tools
 * Class(测试类名): JDBCTemplateTest
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/27
 * Time(创建时间)： 23:10
 * Version(版本): 1.0
 * Description(描述)： 测试类
 */

class JDBCTemplateTest
{

    @org.junit.jupiter.api.Test
    void update()
    {
    }

    @org.junit.jupiter.api.Test
    void testUpdate()
    {
    }

    @org.junit.jupiter.api.Test
    void testUpdate1()
    {
    }

    @org.junit.jupiter.api.Test
    void queryForObject()
    {
    }

    @org.junit.jupiter.api.Test
    void queryForList()
    {
    }

    @org.junit.jupiter.api.Test
    void queryForScalar()
    {
    }

    @org.junit.jupiter.api.Test
    void queryForArray()
    {
        String sql = "SELECT course.`name`, grade.grade " +
                "FROM grade, course WHERE grade.cno = course.cno and grade.`no`=2";
        Object[] objects = {};
        Object[][] objects1 = JDBCTemplate.queryForArray(sql, objects);
        System.out.println("行：" + objects1.length + "   列：" + objects1[0].length);
        for (int i = 0; i < objects1.length; i++)
        {
            for (int j = 0; j < objects1[i].length; j++)
            {
                System.out.print(objects1[i][j] + "  ");
            }
            System.out.println();
        }
    }

    @org.junit.jupiter.api.Test
    void queryForArray1()
    {
        String sql = "select * from information";
        Object[] objects = {};
        Object[][] objects1 = JDBCTemplate.queryForArray(sql, objects);
        System.out.println("行：" + objects1.length + "   列：" + objects1[0].length);
        for (int i = 0; i < objects1.length; i++)
        {
            for (int j = 0; j < objects1[i].length; j++)
            {
                System.out.print(objects1[i][j] + "  ");
            }
            System.out.println();
        }
    }

    @org.junit.jupiter.api.Test
    void queryForArray2()
    {
        String sql = "select * from course";
        Object[] objects = {};
        Object[][] objects1 = JDBCTemplate.queryForArray(sql, objects);
        System.out.println("行：" + objects1.length + "   列：" + objects1[0].length);
        for (int i = 0; i < objects1.length; i++)
        {
            for (int j = 0; j < objects1[i].length; j++)
            {
                System.out.print(objects1[i][j] + "  ");
            }
            System.out.println();
        }
    }

    @Test
    void queryForListMap()
    {
        String sql = "SELECT course.`name`, grade.grade " +
                "FROM grade, course WHERE grade.cno = course.cno and grade.`no`=2";
        Object[] objects = {};
        List<HashMap<String, Object>> list = JDBCTemplate.queryForListMap(sql, objects);
        //System.out.println(list);
        for (HashMap<String, Object> map : list)
        {
            System.out.print(map.get("name") + "   " + map.get("grade"));
            System.out.println();
        }
    }
}