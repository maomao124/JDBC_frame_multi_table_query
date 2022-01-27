package tools.Handler;

import java.sql.ResultSet;

/**
 * Project name(项目名称)：JDBC框架之多表查询
 * Package(包名): tools.Handler
 * Interface(接口名): ResultSetHandler
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/1/27
 * Time(创建时间)： 22:53
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public interface ResultSetHandler<T>
{
    <T> T handler(ResultSet resultSet);
}
