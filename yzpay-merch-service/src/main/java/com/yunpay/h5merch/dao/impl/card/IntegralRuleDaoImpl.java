package com.yunpay.h5merch.dao.impl.card;

import org.springframework.stereotype.Repository;

import com.yunpay.h5merch.permission.dao.card.IntegralRuleDao;
import com.yunpay.h5merch.permission.entity.card.IntegralRule;
import com.yunpay.permission.dao.impl.PermissionBaseDaoImpl;
/**
 *            积分规则DAO实现类
 * 类名称
 * 文件名称:     MemberCardDaoImpl.java
 * 内容摘要: 
 * @author:   Zhao Xiaoman
 * @version:  1.0  
 * @Date:     2017年9月6日下午4:13:20
 * 
 * 修改历史:  
 * 修改日期                     修改人员                                   版本	            修改内容  
 * ----------------------------------------------  
 * 2017年9月6日   Zhao Xiaoman       1.0       新建
 *
 * 版权:   版权所有(C)2017
 * 公司:   深圳市至高通信技术发展有限公司
 */
@SuppressWarnings("rawtypes")
@Repository("integralRuleDao")
public class IntegralRuleDaoImpl extends PermissionBaseDaoImpl implements IntegralRuleDao  {

	@Override
	public IntegralRule getIntegralRule(String merchantNo)
	{
		return super.getSqlSession().selectOne(getStatement("getIntegralRule"), merchantNo);
	}

	@Override
	public int insertIntegralRule(IntegralRule integralRule)
	{
		return super.getSqlSession().insert(getStatement("insertIntegralRule"), integralRule);
	}

	@Override
	public int deleteIntegralRule(String merchantNo)
	{
		return super.getSqlSession().delete(getStatement("deleteIntegralRule"), merchantNo);
	}

	@Override
	public int updateIntegralRule(IntegralRule integralRule)
	{
		return super.getSqlSession().update(getStatement("updateIntegralRule"), integralRule);
	}
	
}
