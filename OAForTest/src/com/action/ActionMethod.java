package com.action;
/**
 * 每个action应该实现该接口，这样对于客户端的调用命名规则是统一的。
 * @author zeh
 *
 */
public interface ActionMethod {
	public String save();
	public String delete();
	public String update();
	/**
	 * 请求修改某条数据，传入实体类的主键值，返回相应的类对象
	 * @return
	 */
	public String addRequest();
	/**
	 * 请求添加某条数据，传入实体类的主键值，返回相应的类对象
	 * @return
	 */
	public String updateRequest();
	/**
	 * 查询所有数据
	 */
	public String queryAllData();
	/**
	 * 分页查询
	 */
	public String queryDataByPage();
}
