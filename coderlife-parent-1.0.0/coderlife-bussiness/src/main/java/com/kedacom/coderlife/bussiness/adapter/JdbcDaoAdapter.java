package com.kedacom.coderlife.bussiness.adapter;

import java.sql.ResultSet;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.simple.SimpleJdbcDaoSupport;
import org.springframework.util.StringUtils;


public abstract class JdbcDaoAdapter extends SimpleJdbcDaoSupport{
	@Resource(name = "mJdbcTemplate")
	private JdbcTemplate jdbcTemplate;

	protected Logger logger = LoggerFactory.getLogger(getClass());

	@PostConstruct
	public void initJdbcTemplate() {
		super.setJdbcTemplate(jdbcTemplate);
	}

	/**
	 * 获取总的记录数
	 * @param sql
	 * @param args
	 * @return
	 */
	public Long getTotalCount(String sql, Object... args) {
		return getSimpleJdbcTemplate().queryForLong(sql, args);
	}

	/**
	 * 获取总的记录数
	 * @param sql
	 * @param args
	 * @return
	 */
	public Long getTotalCount(String sql, Map<String, ?> args) {
		return getSimpleJdbcTemplate().queryForLong(sql, args);
	}

	/**
	 * 过滤 %,供like 条件使用
	 * @param keyword
	 * @return
	 */
	public String filterKey(String keyword) {
		// Assert.hasText(keyword);
		if (!StringUtils.hasText(keyword)) {
			return null;
		}
		String key = keyword.trim();
		if (keyword.indexOf("%") >= 0) {
			key = key.replace("%", "/%");
			return "'%" + key + "%' ESCAPE '/' ";
		} else {
			return "'%" + key + "%' ";
		}
	}

	/**
	 * 过滤 %,供like 条件使用
	 * @param keyword
	 * @return
	 */
	public String filterKeyPara(String keyword) {
		if (!StringUtils.hasText(keyword)) {
			return null;
		}
		// Assert.hasText(keyword);
		String key = keyword.trim();
		if (keyword.indexOf("%") >= 0) {
			key = key.replace("%", "/%");
			return "%" + key + "% ESCAPE '/'";
		} else {
			return "%" + key + "%";
		}
	}
}
