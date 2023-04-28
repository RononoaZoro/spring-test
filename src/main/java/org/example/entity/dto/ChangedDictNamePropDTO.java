package org.example.entity.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @author : archer
 * @date : Created in 2023/3/20 14:38
 * @description :
 */
@Data
public class ChangedDictNamePropDTO implements Serializable {
    private static final long serialVersionUID = -1267180728062188186L;

    private String dictNameDesc;

    private String dictName;

    private Object oldValue;

    private Object newValue;

}
