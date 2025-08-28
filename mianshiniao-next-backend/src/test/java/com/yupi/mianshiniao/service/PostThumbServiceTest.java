package com.yupi.mianshiniao.service;

import com.yupi.mianshiniao.model.entity.User;
import javax.annotation.Resource;

import org.junit.jupiter.api.BeforeAll;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * 帖子点赞服务测试
 *

 */
@SpringBootTest
class PostThumbServiceTest {

    @Resource
    private PostThumbService postThumbService;

    private static final User loginUser = new User();

    @BeforeAll
    static void setUp() {
        loginUser.setId(1L);
    }

//    @Test
//    void doPostThumb() {
//        int i = postThumbService.doPostThumb(1L, loginUser);
//        Assertions.assertTrue(i >= 0);
//    }
}
