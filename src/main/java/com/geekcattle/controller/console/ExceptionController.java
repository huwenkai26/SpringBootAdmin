/*
 * Copyright (c) 2017 <l_iupeiyu@qq.com> All rights reserved.
 */

package com.geekcattle.controller.console;

import com.geekcattle.util.ReturnUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author geekcattle
 * date 2016/10/21 0021 下午 15:58
 */
@Controller

public class ExceptionController {


    @RequestMapping(value = "/sss", method = {RequestMethod.GET})
    @ResponseBody
    public ModelMap editPwd() throws Exception {
        return ReturnUtil.Error("cuow",null,null);
    }


}
