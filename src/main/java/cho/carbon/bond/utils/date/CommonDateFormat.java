package cho.carbon.bond.utils.date;


import java.text.DateFormat;
import java.text.SimpleDateFormat;
/**
 * 
 * <p>Title: OfDateFormat</p>
 * <p>Description: </p><p>
 * 框架默认的日期格式工具类
 * </p>
 */
public class CommonDateFormat extends AbstractFrameDateFormat {
	//默认日期格式
	private static final DateFormat defaultDateFormat = new SimpleDateFormat("yyyy-MM-dd");
	//默认日期时间格式
	private static final DateFormat defaultDateTimeFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	//默认时间格式
	private static final DateFormat defaultTimeFormat = new SimpleDateFormat("HH:mm:ss");
	
	/**
	 * 系统默认构造函数，使用默认格式来格式化时间对象
	 */
	public CommonDateFormat() {
		super(defaultDateFormat, defaultTimeFormat, defaultDateTimeFormat);
	}

}
