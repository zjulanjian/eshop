package com.bj186.fms.pojo;

public class RoleResourcePermission {
    private Integer rrpermissionid;

    private Integer roleid;

    private Integer resourceid;

    private Integer permissionid;

    public Integer getRrpermissionid() {
        return rrpermissionid;
    }

    public void setRrpermissionid(Integer rrpermissionid) {
        this.rrpermissionid = rrpermissionid;
    }

    public Integer getRoleid() {
        return roleid;
    }

    public void setRoleid(Integer roleid) {
        this.roleid = roleid;
    }

    public Integer getResourceid() {
        return resourceid;
    }

    public void setResourceid(Integer resourceid) {
        this.resourceid = resourceid;
    }

    public Integer getPermissionid() {
        return permissionid;
    }

    public void setPermissionid(Integer permissionid) {
        this.permissionid = permissionid;
    }
}