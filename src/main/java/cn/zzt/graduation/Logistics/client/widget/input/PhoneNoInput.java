package cn.zzt.graduation.Logistics.client.widget.input;
/**  
 * 手机号码输入框
 *  
 * @author zhangtao.zhou  
 * @version 2018年1月18日  下午5:55:49
 */
public class PhoneNoInput extends AbstractBaseInput
{
	public PhoneNoInput(){
		super();
		image.setUrl("images/login/Mobile-phone.png");
		setType("tel");
		
	}
	@Override
	public boolean valid() {
		// TODO Auto-generated method stub
		return false;
	}

}
