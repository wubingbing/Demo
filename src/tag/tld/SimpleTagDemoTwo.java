package tag.tld;

import java.io.IOException;
import java.util.Date;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

/**
 * 标签接收的属性值是一个复合数据类型，该如何给标签的属性赋值
 * @author Administrator
 *
 */
public class SimpleTagDemoTwo extends SimpleTagSupport {

	/**
	 * 定义标签的属性
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