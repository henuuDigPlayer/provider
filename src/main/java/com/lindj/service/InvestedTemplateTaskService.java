package com.lindj.service;

import com.lindj.mapper.InvestedTemplateTaskMapper;
import com.lindj.model.InvestedTemplateTask;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by lindongjie on 18/1/4.
 */
@Service
public class InvestedTemplateTaskService {
    @Autowired
    private InvestedTemplateTaskMapper templateTaskMapper;

    public List<InvestedTemplateTask> selectAll(){
        return this.templateTaskMapper.selectAll();
    }

    @Transactional(rollbackFor = Exception.class)
    public void insert(){
        InvestedTemplateTask templateTask = new InvestedTemplateTask();
        this.templateTaskMapper.insert(templateTask);
        int i = 1/0;
    }
}
