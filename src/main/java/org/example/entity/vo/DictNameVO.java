package org.example.entity.vo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;

/**
 * @author : archer
 * @date : Created in 2023/3/27 10:39
 * @description :
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DictNameVO implements Serializable {

    @NotEmpty(message = "dictNameDesc can not be null")
    private String dictNameDesc;
    private String dictName;
    private Object oldValue;
    private Object newValue;
}
