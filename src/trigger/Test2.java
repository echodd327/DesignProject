package trigger;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

public class Test2 {

	public static void main(String[] args) {
		Map<String,Object> record_new = new HashMap<String,Object>();
		Map<String,Object> record_old = new HashMap<String,Object>();
		 String result = record_new.get("result")==null?"":record_new.get("result").toString();
		
		Calendar c = Calendar.getInstance();
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
	    //异常分类
	    String type = record_new.get("type")==null?"":record_new.get("type").toString();
	    //订单商品状态
	    String orderitemstatus = record_new.get("orderitemstatus")==null?"":record_new.get("orderitemstatus").toString();
	    if("询货结果".equals(type) && "缺货不补".equals(orderitemstatus)  && "等待".equals(result)){
			 //当前日期加8天
	         c.add(Calendar.DAY_OF_MONTH, 8); 
	         record_new.put("nextcontdate",sf.format(c.getTime()));
	    }else if("同意等两天".equals(type)){
			 c.add(Calendar.DAY_OF_MONTH, 2); 
			 record_new.put("nextcontdate",sf.format(c.getTime()));
		}else if("一直等".equals(type)){
			 c.add(Calendar.DAY_OF_MONTH, 3); 
			 record_new.put("nextcontdate",sf.format(c.getTime()));
		}
	}

}
