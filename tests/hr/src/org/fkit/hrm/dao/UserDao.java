package org.fkit.hrm.dao;


import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.fkit.hrm.dao.provider.UserDynaSqlProvider;
import org.fkit.hrm.domain.User;
import static org.fkit.hrm.util.common.HrmConstants.USERTABLE;

/**   
 * @Description: UserMapper鎺ュ彛
 * <br>缃戠珯锛�<a href="http://www.fkit.org">鐤媯Java</a> 
 * @author 鑲栨枃鍚�	36750064@qq.com   
 * @version V1.0   
 */
public interface UserDao {

	// 鏍规嵁鐧诲綍鍚嶅拰瀵嗙爜鏌ヨ鍛樺伐
	@Select("select * from "+USERTABLE+" where loginname = #{loginname} and password = #{password}")
	User selectByLoginnameAndPassword(
			@Param("loginname") String loginname,
			@Param("password") String password);
	
	// 鏍规嵁id鏌ヨ鐢ㄦ埛
	@Select("select * from "+USERTABLE+" where ID = #{id}")
	User selectById(Integer id);
	
	// 鏍规嵁id鍒犻櫎鐢ㄦ埛
	@Delete(" delete from "+USERTABLE+" where id = #{id} ")
	void deleteById(Integer id);
		
	// 鍔ㄦ�佷慨鏀圭敤鎴�
	@SelectProvider(type=UserDynaSqlProvider.class,method="updateUser")
	void update(User user);
		
	// 鍔ㄦ�佹煡璇�
	@SelectProvider(type=UserDynaSqlProvider.class,method="selectWhitParam")
	List<User> selectByPage(Map<String, Object> params);
	
	// 鏍规嵁鍙傛暟鏌ヨ鐢ㄦ埛鎬绘暟
	@SelectProvider(type=UserDynaSqlProvider.class,method="count")
	Integer count(Map<String, Object> params);
	
	// 鍔ㄦ�佹彃鍏ョ敤鎴�
	@SelectProvider(type=UserDynaSqlProvider.class,method="insertUser")
	void save(User user);
	
}
