package com.huanghy.scaff.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.JobParameters;
import org.springframework.batch.core.JobParametersBuilder;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/api/batch")
public class BatchController {
    // 日志服务处理
    private Logger logger = LoggerFactory.getLogger(BatchController.class);

    @Autowired
    private SimpleJobLauncher launcher;
    @Autowired
    private Job job;

    @RequestMapping(value = "/init", method = {RequestMethod.POST,RequestMethod.GET}, produces = "application/json;charset=UTF-8")
    @ResponseBody
    public void insert() {
        // 后置参数：使用JobParameters中绑定参数
        try {
            JobParameters jobParameters = new JobParametersBuilder().addLong("time", System.currentTimeMillis())
                    .toJobParameters();
            launcher.run(job, jobParameters);

        } catch (Exception e) {
            e.printStackTrace();
            logger.error(e.getMessage());
        }
    }

}
