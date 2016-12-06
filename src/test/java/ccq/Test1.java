package ccq;

import net.sf.json.JSONArray;

import org.json.JSONObject;

public class Test1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String aString="{'status':'0','message':'请求处理成功','phone_attr':{'dtype':'3','content':'中国联通提示您:号码15201644403已被110人标记为-骚扰测试【该数据由中国联通提供】','firstpushflag':'1'}}";
		JSONObject jsonObject = new JSONObject(aString);
		String status=jsonObject.getString("status");
		JSONObject phone_attr=jsonObject.getJSONObject("phone_attr");
		System.out.println(phone_attr);
	}

}
