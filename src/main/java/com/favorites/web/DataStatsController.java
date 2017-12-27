package com.favorites.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.favorites.comm.aop.LoggerManage;
import com.favorites.domain.User;
import com.favorites.service.CollectService;

@Controller
@RequestMapping("/")
public class DataStatsController extends BaseController {
	@Autowired
	private CollectService collectService;

	@RequestMapping(value = "/datastats")
	@LoggerManage(description = "数据统计")
	public String datastats(Model model) {
		int collectSize = collectService.getRowsOfCollect();
		model.addAttribute("collectSize", collectSize);
		return "datastats";
	}
}
