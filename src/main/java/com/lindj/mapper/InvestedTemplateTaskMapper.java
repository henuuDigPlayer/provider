package com.lindj.mapper;

import com.lindj.model.InvestedTemplateTask;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by lindongjie on 18/1/2.
 */
@Repository
public interface InvestedTemplateTaskMapper {
    List<InvestedTemplateTask> selectAll();
    int insert(InvestedTemplateTask templateTask);

}
