package trigger;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class TskRetrieveTest {
	
	public static void main(String[] args) throws ParseException {
		Map<String,Object> record_new = new HashMap<String,Object>();
		Map<String,Object> record_old = new HashMap<String,Object>();
		
		
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DAY_OF_MONTH, 3);
		Calendar now = Calendar.getInstance();
		String addThreeDate =sf.format(c.getTime()); //当前时间+3天
		
	
		//下次联系日期
		String next_cont_date = record_new.get("next_cont_date")==null?"":record_new.get("next_cont_date").toString();
		//联系状态
		String cont_status = record_new.get("cont_status")==null?"":record_new.get("cont_status").toString();
		String cont_status_old = record_old.get("cont_status") == null?"":record_old.get("cont_status").toString();
		//赠券前联系次数
		String beforetimesStr = record_new.get("beforetimes")==null?"":record_new.get("beforetimes").toString();
		Integer beforetimesInt = "".equals(beforetimesStr)? 0:Integer.valueOf(beforetimesStr);
		
		//赠券后联系次数
		String aftertimesStr = record_new.get("aftertimes") ==null?"":record_new.get("aftertimes").toString();
		Integer aftertimesInt = "".equals(aftertimesStr)? 0:Integer.valueOf(aftertimesStr);
		
		//意向程度
		String intention = record_new.get("intention")==null?"":record_new.get("intention").toString();
		
		//赠券日期
		String coupon_date = record_new.get("coupon_date")==null?"":record_new.get("coupon_date").toString();
	
		//第一次无法联系到客户
		if("".equals(next_cont_date)&& cont_status.equals("联系失败")){
			beforetimesInt++; //赠券前联系次数+1
			record_new.put("beforetimes", beforetimesInt.toString());
			record_new.put("next_cont_date", addThreeDate);
			record_new.put("status", "进行中");
		}
		else if(!"".equals(next_cont_date) && ((sf.parse(next_cont_date).compareTo(now.getTime())==-1)||(sf.parse(next_cont_date).compareTo(now.getTime())==0)) 
				&& cont_status.equals("联系失败")){
			beforetimesInt++; //赠券前联系次数+1
			record_new.put("beforetimes",beforetimesInt.toString());
			if(beforetimesInt == 3){
				record_new.put("status", "已关闭");
			}else{
				record_new.put("status", "进行中");
				record_new.put("next_cont_date", addThreeDate);
			}
		}
		else if(cont_status.equals("无效客户")){
			beforetimesInt++;//赠券前联系次数+1
			record_new.put("status", "已关闭");
			record_new.put("beforetimes", beforetimesInt.toString());
		}
		
		else if(cont_status.equals("客户拒绝")){
			beforetimesInt++;//赠券前联系次数+1
			record_new.put("status", "已关闭");
			record_new.put("beforetimes", beforetimesInt.toString());
			record_new.put("intention", "弱");
		}
		else if(cont_status.equals("客户接受-待注册后送券") || cont_status.equals("客户考虑")){
			if("".equals(intention) || "未知".equals(intention)){
				trigger.addErrorMessage("请选择意向程度！");
			}else{
				beforetimesInt++; //赠券前联系次数+1
				record_new.put("beforetimes", beforetimesInt.toString());
				record_new.put("next_cont_date", addThreeDate);
				record_new.put("status", "进行中");
			}
		}
		else if(cont_status.equals("客户接受")||cont_status.equals("需推荐商品")||cont_status.equals("需告知活动")){
			if("".equals(intention) || "未知".equals(intention)){
				trigger.addErrorMessage("请选择意向程度！");
			}else if("强".equals(intention)){
				aftertimesInt++; //赠券后联系次数+1
				record_new.put("aftertimes",aftertimesInt.toString());
				record_new.put("next_cont_date", addThreeDate);
				record_new.put("status", "进行中");
			}else if("弱".equals(intention) || "一般".equals(intention)){
				aftertimesInt++; //赠券后联系次数+1
				record_new.put("aftertimes",aftertimesInt.toString());
				record_new.put("status", "进行中");
				record_new.put("next_cont_date", "");
				if(!coupon_date.equals("")){
					Date coupon_date_d = sf.parse(coupon_date);
					Calendar cal = Calendar.getInstance();
					cal.setTime(coupon_date_d);
					long betweenDays = (now.getTimeInMillis()-cal.getTimeInMillis())/(24*60*60*1000);
					if(betweenDays <= 30){
						cal.add(Calendar.DAY_OF_YEAR, 30);
						record_new.put("next_cont_date", sf.format(cal.getTime()));
					}else if(betweenDays>30 && betweenDays <= 60){
						cal.add(Calendar.DAY_OF_YEAR, 60);
						record_new.put("next_cont_date", sf.format(cal.getTime()));
					}else if(betweenDays > 60 && betweenDays <80){
						cal.add(Calendar.DAY_OF_YEAR, 80);
						record_new.put("next_cont_date", sf.format(cal.getTime()));
					}else if(betweenDays > 80){
						record_new.put("status", "已关闭");
					}
					
				}
			}
		}
		else if(cont_status.equals("已推荐商品")||cont_status.equals("已告知活动-电话")||cont_status.equals("已告知活动-微信")){
			if("".equals(intention) || "未知".equals(intention)){
				trigger.addErrorMessage("请选择意向程度！");
			}else if("强".equals(intention)){
				aftertimesInt++; //赠券后联系次数+1
				record_new.put("aftertimes",aftertimesInt.toString());
				record_new.put("status", "已关闭");
			}else if("弱".equals(intention) || "一般".equals(intention)){
				aftertimesInt++; //赠券后联系次数+1
				record_new.put("aftertimes",aftertimesInt.toString());
				record_new.put("status", "进行中");
				record_new.put("next_cont_date", "");
				if(!coupon_date.equals("")){
					Date coupon_date_d = sf.parse(coupon_date);
					Calendar cal = Calendar.getInstance();
					cal.setTime(coupon_date_d);
					long betweenDays = (now.getTimeInMillis()-cal.getTimeInMillis())/(24*60*60*1000);
					if(betweenDays <= 30){
						cal.add(Calendar.DAY_OF_YEAR, 30);
						record_new.put("next_cont_date", sf.format(cal.getTime()));
					}else if(betweenDays>30 && betweenDays <= 60){
						cal.add(Calendar.DAY_OF_YEAR, 60);
						record_new.put("next_cont_date", sf.format(cal.getTime()));
					}else if(betweenDays > 60 && betweenDays <80){
						cal.add(Calendar.DAY_OF_YEAR, 80);
						record_new.put("next_cont_date", sf.format(cal.getTime()));
					}else if(betweenDays > 80){
						record_new.put("status", "已关闭");
					}
				}
			}
		}
		else if(cont_status_old.equals("已下单") && cont_status.equals("已答谢")){
			aftertimesInt++;
			record_new.put("aftertimes",aftertimesInt.toString());
			record_new.put("status", "已关闭");
		}
		
	} //main end
}
