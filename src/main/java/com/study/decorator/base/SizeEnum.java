package com.study.decorator.base;

/**
 * Created by J.zhu on 2019/2/7.
 */
public enum SizeEnum {
    TALL(1,"tall"),
    GRANDE(2,"grande"),
    VENTI(3,"venti");
    private Integer code;
    private String name;
    SizeEnum(Integer code,String name) {
       this.code = code;
       this.name = name;
    }

    public SizeEnum getEnumByCode(Integer code){
        SizeEnum[] values = SizeEnum.values();
        for (SizeEnum sizeEnum : values) {
            if(sizeEnum.code == code){
                return sizeEnum;
            }
        }
        return null;
    }

    public SizeEnum getEnumByName(String name){
        SizeEnum[] values = SizeEnum.values();
        for (SizeEnum sizeEnum : values) {
            if(sizeEnum.name.equals(name)){
                return sizeEnum;
            }
        }
        return null;
    }

    public Integer getCode(){
        return this.code;
    }
    public String getName(){
        return this.name;
    }

}
