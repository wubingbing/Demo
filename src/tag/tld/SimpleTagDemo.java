package tag.tld;

import java.io.IOException;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class SimpleTagDemo extends SimpleTagSupport{

	/**
	 * �����ǩ����
	 */
	private int count;
	
	
	public void setCount(int count) {
		this.count = count;
	}


	 /* �򵥱�ǩʹ����������Ϳ���������е�ҵ���߼�
	      * @see javax.servlet.jsp.tagext.SimpleTagSupport#doTag()
	      * ��дdoTag������ͨ����ǩ�����Կ��Ʊ�ǩ���ִ�д���
	      */
	@Override
	public void doTag() throws JspException, IOException {
		
		for(int i=0;i<count;i++)
		{
			this.getJspBody().invoke(null);
		}
		
	}
	
	
}