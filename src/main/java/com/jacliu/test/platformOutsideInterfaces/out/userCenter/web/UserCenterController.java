package com.jacliu.test.platformOutsideInterfaces.out.userCenter.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.jacliu.test.platformOutsideInterfaces.common.enums.EnumResCode;
import com.jacliu.test.platformOutsideInterfaces.common.web.model.ResultModel;
import com.jacliu.test.platformOutsideInterfaces.common.web.util.RespUtil;

import io.swagger.annotations.Api;

@Controller
@RequestMapping("userCenterApi/")
@Api("userCenterApi相关的api")
public class UserCenterController {

	@SuppressWarnings("rawtypes")
	@ResponseBody
	@RequestMapping("testUserCenter/1.4")
	public ResultModel test(String test) {
		return RespUtil.result(EnumResCode.OK, false);
	}

}
