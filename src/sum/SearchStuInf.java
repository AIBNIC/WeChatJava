package sum;

import com.alibaba.fastjson.JSONObject;

import entry.StuInfo;
import service.StuService;
import thread.SearchuserService_Thread;

public class SearchStuInf {
	StuService service = new StuService();
	public JSONObject searchUserOnline(String content , String username , String ip) throws Exception {
		StuInfo stuinf = service.search(content);
		JSONObject inf = new JSONObject();
		if(stuinf.getStu_name()!=null || !"".equals(stuinf.getStu_name())) {
			
			SearchuserService_Thread loginfo = new SearchuserService_Thread(username,stuinf.getStu_number(),ip);
			
			loginfo.start();
			inf.put("stu_number", stuinf.getStu_number());
			inf.put("stu_idcard", stuinf.getStu_idcard());
			inf.put("stu_major", stuinf.getStu_major());
			inf.put("stu_name", stuinf.getStu_name());
			inf.put("stu_end_time", stuinf.getEnd_time());
			inf.put("stu_room", stuinf.getStu_room());
			inf.put("stu_rooms", stuinf.getUproom());
			inf.put("stu_state", stuinf.getState());
			return inf;
		}else {
			inf.put("msg", stuinf.getMsg());
			return inf;
		}
	}
}
