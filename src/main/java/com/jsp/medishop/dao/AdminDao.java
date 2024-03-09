package com.jsp.medishop.dao;

import com.jsp.medishop.dto.Admin;

/**
 * @author Aabhas
 */
public interface AdminDao {

	public Admin getAdminByEmailDao(String email);

}
