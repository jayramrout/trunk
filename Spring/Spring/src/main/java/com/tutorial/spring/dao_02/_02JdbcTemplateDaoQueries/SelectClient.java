package com.tutorial.spring.dao_02._02JdbcTemplateDaoQueries;

import java.util.List;
import java.util.Map;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SelectClient {
	public static void main(String args[]) throws Exception {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext(
				"com/tutorial/spring/dao_02/_02JdbcTemplateDaoQueries/applicationContext.xml");
		SelectImple select = (SelectImple) ctx.getBean("sel");
		/*System.out.println("Employee count with Clerk disgnation is: "
				+ select.getEmpCount("AD_PRES"));
		*/
		Map m = select.getEmpDetails(100);
		System.out.println("Details of empno: 100 are: " + m.toString());

		/*System.out.println("Clerk designation employees details are: ");

		List l = select.getEmpDetails("AD_VP");
		for (int i = 0; i < l.size(); i++) {
			Map m1 = (Map) l.get(i);
			System.out.println(m1.toString());
		}*/

		// boolean bool = s.registerEmp(1, "Manoj", "MANAGER", 50000);
		// System.out.println("Employee registered "+bool);
		// bool = s.modifyDesignation(1, "PRESIDENT");
		// System.out.println("Employee designation updated "+bool);
		// Thread.sleep(5000);
		// bool = s.fireEmp(1);
		// System.out.println("Employee fired "+bool);
	}
}
