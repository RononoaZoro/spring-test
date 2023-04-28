package org.example.controller;

import com.akulaku.biz.common.utils.JsonUtils;
import com.fasterxml.jackson.core.type.TypeReference;
import com.google.common.collect.Lists;
import org.example.entity.dto.ChangedDictNamePropDTO;
import org.example.entity.vo.DictNameVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;

import java.util.*;

/**
 * @author : archer
 * @date : Created in 2023/3/27 10:34
 * @description :
 */
@Controller
public class ThymeleafController {

    @Autowired
    private TemplateEngine templateEngine;

    String json =
        "[{\"dictNameDesc\":\"商户名称\",\"dictName\":\"vendorName\",\"oldValue\":\"bimo79\",\"newValue\":\"PT-bimo79\"},{\"dictNameDesc\":\"商户简称\",\"dictName\":\"vendorShortName\",\"oldValue\":null,\"newValue\":\"24535\"},{\"dictNameDesc\":\"授权书照片\",\"dictName\":\"authorizationLetterPhoto\",\"oldValue\":[],\"newValue\":[\"https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/merchant/material/df656efc64bc45a59940cad405606799875737.png?Expires=1679998040&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=VuPa9Il6KKPxvFL9rtiIuo2yo5E%3D\"]}]";

    @ResponseBody
    @RequestMapping("/table")
    public String table() {
        Context context = new Context();
        //        List<DictNameVO> list = new ArrayList<>();
        //        list.add(new DictNameVO("姓名", "name", "old", "new"));
        //        list.add(new DictNameVO("年龄", "age", 12, 20));
        //        list.add(new DictNameVO("分数列表", "score", Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6)));
        //        list.add(new DictNameVO("图片", "img",
        //            Arrays.asList("https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/other/48689fa5f9e6477f95d73a494f69bca8790020.jpg?Expires=1679890303&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=qzWTLeSi75NcACi89NaduC9gGeY%3D"
        //                ,"https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/other/48689fa5f9e6477f95d73a494f69bca8790020.jpg?Expires=1679890303&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=qzWTLeSi75NcACi89NaduC9gGeY%3D"
        //                ,"https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/other/48689fa5f9e6477f95d73a494f69bca8790020.jpg?Expires=1679890303&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=qzWTLeSi75NcACi89NaduC9gGeY%3D"
        //                ,"https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/other/48689fa5f9e6477f95d73a494f69bca8790020.jpg?Expires=1679890303&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=qzWTLeSi75NcACi89NaduC9gGeY%3D"
        //            ),
        //            Arrays.asList("https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/other/48689fa5f9e6477f95d73a494f69bca8790020.jpg?Expires=1679890303&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=qzWTLeSi75NcACi89NaduC9gGeY%3D"
        //            ,"https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/other/48689fa5f9e6477f95d73a494f69bca8790020.jpg?Expires=1679890303&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=qzWTLeSi75NcACi89NaduC9gGeY%3D"
        //            ,"https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/other/48689fa5f9e6477f95d73a494f69bca8790020.jpg?Expires=1679890303&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=qzWTLeSi75NcACi89NaduC9gGeY%3D"
        //            ,"https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/other/48689fa5f9e6477f95d73a494f69bca8790020.jpg?Expires=1679890303&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=qzWTLeSi75NcACi89NaduC9gGeY%3D"
        //            )
        //            ));

        List<ChangedDictNamePropDTO> dictNameVOS = JsonUtils.parseJsonOrNull(json, new TypeReference<List<ChangedDictNamePropDTO>>() {});
        context.setVariable("dictNameVOS", dictNameVOS);
        String mytemplate = templateEngine.process("table", context);
        return mytemplate;
    }

    @ResponseBody
    @RequestMapping(value = "/table1")
    public String table1() {
        Context context = new Context();
        List<DictNameVO> list = new ArrayList<>();
        list.add(new DictNameVO("姓名", "name", "old", "new"));
        list.add(new DictNameVO("年龄", "age", 12, 20));
        list.add(new DictNameVO("分数列表", "score", Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6)));
        list.add(new DictNameVO("图片", "authorizationLetterPhoto",
            Lists.newArrayList(),
            Arrays.asList("https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/merchant/material/df656efc64bc45a59940cad405606799875737.png?Expires=1679998040&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=VuPa9Il6KKPxvFL9rtiIuo2yo5E%3D"
                , "https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/other/48689fa5f9e6477f95d73a494f69bca8790020.jpg?Expires=1679890303&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=qzWTLeSi75NcACi89NaduC9gGeY%3D"
                , "https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/other/48689fa5f9e6477f95d73a494f69bca8790020.jpg?Expires=1679890303&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=qzWTLeSi75NcACi89NaduC9gGeY%3D"
                , "https://background-business-biz-service-test.oss-cn-hongkong.aliyuncs.com/other/48689fa5f9e6477f95d73a494f69bca8790020.jpg?Expires=1679890303&OSSAccessKeyId=LTAI4Fg2iUt3nkSrCM2DfiXW&Signature=qzWTLeSi75NcACi89NaduC9gGeY%3D"
            )
        ));

        context.setVariable("dictNameVOS", list);
        String mytemplate = templateEngine.process("table", context);
        return mytemplate;
    }

    @ResponseBody
    @RequestMapping("/valid")
    public Map<String, Object> table1(@RequestBody @Validated DictNameVO vo) {
        System.out.println(vo.getDictNameDesc());
        Map<String, Object> map = new HashMap<>();
        map.put("dictNameDesc", vo.getDictNameDesc());
        return map;
    }

}
