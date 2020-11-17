package com.yueqian.ticketsMgr_domain_9000.domain.sysMgr;

public class RolesVO {
	private int roleId;
	private String roleName;
	
	public int getRoleId() {
		return roleId;
	}
	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	@Override
	public String toString() {
		return "RolesVO [roleId=" + roleId + ", roleName=" + roleName + "]";
	}

}
