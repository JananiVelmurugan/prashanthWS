package test.com.janani.urbanapp.util;

import com.janani.urbanapp.util.ConnectionUtil;

public class TestConnectionUtil {

	public static void main(String[] args) {
		try {
			System.out.println(ConnectionUtil.getConnection());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
