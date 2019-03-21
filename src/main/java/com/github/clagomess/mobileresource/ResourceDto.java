package com.github.clagomess.mobileresource;

import lombok.Data;

@Data
public class ResourceDto {
    private Integer width;
    private Integer height;
    private String filename;

    public ResourceDto(String filename, Integer width, Integer height){
        this.filename = filename;
        this.width = width;
        this.height = height;
    }
}
