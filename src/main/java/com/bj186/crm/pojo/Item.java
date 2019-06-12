package com.bj186.crm.pojo;

import java.util.Date;

public class Item {
    private Integer itemId;

    private String itemName;

    private Double itemPrice;

    private String itemDetail;

    private String itemPic;

    private Date itemCreatetime;

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName == null ? null : itemName.trim();
    }

    public Double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(Double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public String getItemDetail() {
        return itemDetail;
    }

    public void setItemDetail(String itemDetail) {
        this.itemDetail = itemDetail == null ? null : itemDetail.trim();
    }

    public String getItemPic() {
        return itemPic;
    }

    public void setItemPic(String itemPic) {
        this.itemPic = itemPic == null ? null : itemPic.trim();
    }

    public Date getItemCreatetime() {
        return itemCreatetime;
    }

    public void setItemCreatetime(Date itemCreatetime) {
        this.itemCreatetime = itemCreatetime;
    }
}