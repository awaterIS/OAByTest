package com.action;
/**
 * ÿ��actionӦ��ʵ�ָýӿڣ��������ڿͻ��˵ĵ�������������ͳһ�ġ�
 * @author zeh
 *
 */
public interface ActionMethod {
	public String save();
	public String delete();
	public String update();
	/**
	 * �����޸�ĳ�����ݣ�����ʵ���������ֵ��������Ӧ�������
	 * @return
	 */
	public String addRequest();
	/**
	 * �������ĳ�����ݣ�����ʵ���������ֵ��������Ӧ�������
	 * @return
	 */
	public String updateRequest();
	/**
	 * ��ѯ��������
	 */
	public String queryAllData();
	/**
	 * ��ҳ��ѯ
	 */
	public String queryDataByPage();
}
