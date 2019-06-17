package com.timeselectrical.service;

import com.timeselectrical.dto.SceneFaultLabelCondDTO;
import com.timeselectrical.model.SceneFaultLabel;

import java.util.List;

/**
 * 现场故障标签service
 */
public interface ISceneFaultLabelService {

    /**
     * 查询现场故障标签
     * @return
     */
    List<SceneFaultLabel> getSceneFaultLabels(SceneFaultLabelCondDTO cond);
}
