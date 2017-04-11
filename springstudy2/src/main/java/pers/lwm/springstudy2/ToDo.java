package pers.lwm.springstudy2;

/**
 * 待办事项类
 * 
 * @author lwm 2017/04/11
 *
 */
public class ToDo {

	private int user_id;
	private String text;
	private boolean is_completed;

	public int getUser_id() {
		return user_id;
	}

	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public boolean isIs_completed() {
		return is_completed;
	}

	public void setIs_completed(boolean is_completed) {
		this.is_completed = is_completed;
	}

}
