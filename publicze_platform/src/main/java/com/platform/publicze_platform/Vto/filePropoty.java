package com.platform.publicze_platform.Vto;

import com.sun.xml.internal.ws.developer.Serialization;
import lombok.Data;

@Data
@Serialization
public class filePropoty {
    public int fileType;
    public String id;
    public String title;
    public boolean isMainImg;
    public String discrip;
    public String companyNo;
    public String groupName;
    public String filePath;
}
