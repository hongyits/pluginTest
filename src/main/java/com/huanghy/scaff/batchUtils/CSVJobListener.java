package com.huanghy.scaff.batchUtils;

import lombok.extern.slf4j.Slf4j;
import org.springframework.batch.core.JobExecution;
import org.springframework.batch.core.JobExecutionListener;

@Slf4j
public class CSVJobListener implements JobExecutionListener {

    private long startTime;
    private long endTime;

    @Override
    public void afterJob(JobExecution arg0) {
        // TODO Auto-generated method stub
        endTime = System.currentTimeMillis();
        log.info("job process end...");
        log.info("spend time: " + (endTime - startTime) + "ms");
    }

    @Override
    public void beforeJob(JobExecution arg0) {
        // TODO Auto-generated method stub
        startTime = System.currentTimeMillis();
        log.info("job process start...");
    }

}
