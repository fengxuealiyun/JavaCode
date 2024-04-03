package com.xunhou.mould;

/**
 * 测试类头的注释信息
 */
public class Custone {

    private String website;
    private String authorName;
    private Integer age;
    private HomedownDTO homedown;

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public HomedownDTO getHomedown() {
        return homedown;
    }

    public void setHomedown(HomedownDTO homedown) {
        this.homedown = homedown;
    }

    public static class HomedownDTO {
        private String address;
        private String pincode;

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPincode() {
            return pincode;
        }

        public void setPincode(String pincode) {
            this.pincode = pincode;
        }
    }
}
