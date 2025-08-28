package com.yupi.mianshiniao.model.dto.questionBankQuestion;

import lombok.Data;

import java.io.Serializable;

@Data
public class QuestionBankQuestionRemoveRequest implements Serializable {

    /**
     * 题库id
     */
    private Long questionBankId;

    /**
     * 题目id
     */
    private Long questionId;
    public static final long serialVersionUID =1L;
}
