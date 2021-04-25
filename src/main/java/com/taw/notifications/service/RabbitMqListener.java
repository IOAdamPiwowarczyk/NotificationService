package com.taw.notifications.service;

import com.taw.notifications.dto.NotificationInfoDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RabbitMqListener {
//    Logger logger = LoggerFactory.getLogger(RabbitMqListener.class);
//korzystam z @Slf4j z lomboka, więc niepotrzebne

    @RabbitListener(queues = "finish_enroll")
    public void handleFinishEnroll(NotificationInfoDto notificationInfo) {
        log.info(notificationInfo.toString());
    }
}
