package com.bj186.fms.pojo;

public class RoleResourcePermission {
    private Integer rrPermissionID;

    private Integer roleID;

    private Integer resourceID;

    private Integer permissionID;

    public Integer getRrPermissionID() {
        return rrPermissionID;
    }

    public void setRrPermissionID(Integer rrPermissionID) {
        this.rrPermissionID = rrPermissionID;
    }

    public Integer getRoleID() {
        return roleID;
    }

    public void setRoleID(Integer roleID) {
        this.roleID = roleID;
    }

    public Integer getResourceID() {
        return resourceID;
    }

    public void setResourceID(Integer resourceID) {
        this.resourceID = resourceID;
    }

    public Integer getPermissionID() {
        return permissionID;
    }

    public void setPermissionID(Integer permissionID) {
        this.permissionID = permissionID;
    }
}