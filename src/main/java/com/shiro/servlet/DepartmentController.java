package com.shiro.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.lang3.time.DateFormatUtils;

import com.shiro.entity.Department;

import net.sf.json.JSONArray;

@WebServlet("/Department/*")
public class DepartmentController extends HttpServlet{

	private static final long serialVersionUID = 4025943331108753214L;

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("UTF-8");
		resp.setContentType("application/json,text/xml;charset=UTF-8");
		String uri = req.getRequestURI();
		if(uri.endsWith("/GetDepartment")){
			List<Department> depts = new ArrayList<Department>();
			buildDepts(depts);
//			ObjectMapper mapper = new ObjectMapper();
//	        mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
//	        String jsonStr = mapper.writeValueAsString(depts.get(0));
			JSONArray jsonArray = JSONArray.fromObject(depts);
			String json = "{\"total\":" + depts.size() + ",\"rows\":" + jsonArray.toString() + "}"; 
	        PrintWriter out = resp.getWriter();
			out.write(json);
	        out.close();
		}else if(uri.endsWith("/SaveDepartment")){
			
		}
	}

	private void buildDepts(List<Department> depts) {
		for(int i=0;i<5;i++){
			Department dept = new Department();
			dept.setId(""+i);
			dept.setName("test"+i);
			dept.setDes("这是test"+i);
			dept.setLevel(""+i);
			dept.setCreateTime(DateFormatUtils.format(new Date(), "yyyy-MM-dd HH:mm:ss"));
			depts.add(dept);
		}
	}
}
