package com.yupi.mianshiniao.service;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.IService;
import com.yupi.mianshiniao.model.dto.mockinterview.MockInterviewAddRequest;
import com.yupi.mianshiniao.model.dto.mockinterview.MockInterviewEventRequest;
import com.yupi.mianshiniao.model.dto.mockinterview.MockInterviewQueryRequest;
import com.yupi.mianshiniao.model.entity.MockInterview;
import com.yupi.mianshiniao.model.entity.User;

/**
* @author wangz
* @description 针对表【mock_interview(模拟面试)】的数据库操作Service
* @createDate 2025-08-27 10:33:30
*/
public interface MockInterviewService extends IService<MockInterview> {
    /**
     * 创建模拟面试
     *
     * @param mockInterviewAddRequest
     * @param loginUser
     * @return
     */
    Long createMockInterview(MockInterviewAddRequest mockInterviewAddRequest, User loginUser);

    /**
     * 构造查询条件
     *
     * @param mockInterviewQueryRequest
     * @return
     */
    QueryWrapper<MockInterview> getQueryWrapper(MockInterviewQueryRequest mockInterviewQueryRequest);

    /**
     * 处理模拟面试事件
     * @param mockInterviewEventRequest
     * @param loginUser
     * @return AI 给出的回复
     */
    String handleMockInterviewEvent(MockInterviewEventRequest mockInterviewEventRequest, User loginUser);
}
