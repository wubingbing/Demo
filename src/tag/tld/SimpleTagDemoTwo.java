package tag.tld;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * ��ǩ���յ�����ֵ��һ�������������ͣ�����θ���ǩ�����Ը�ֵ
 * @author Administrator
 *
 */
public class SimpleTagDemoTwo extends SimpleTagSupport {

	/**
	 * �����ǩ������
	 * @throws JspException
	 * @throws IOException
	 */
	private Date date;

	public void setDate(Date date) {
		this.date = date;
	}


	@Override
	public void doTag() throws JspException, IOException {
	
		this.getJspContext().getOut().write(date.toLocaleString());
	}
	
}