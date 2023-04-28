package org.example.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * @author : archer
 * @date : Created in 2023/3/27 10:51
 * @description :
 */
@Data
@AllArgsConstructor
public class ImgDictNameVO implements Serializable {

    private String dictNameDesc;
    private String dictName;
    private List<String> oldValues;
    private List<String> newValues;
}
