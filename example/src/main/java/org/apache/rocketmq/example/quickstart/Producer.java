/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.rocketmq.example.quickstart;

import com.alibaba.fastjson.JSON;
import org.apache.rocketmq.client.exception.MQClientException;
import org.apache.rocketmq.client.producer.DefaultMQProducer;
import org.apache.rocketmq.client.producer.SendResult;
import org.apache.rocketmq.common.message.Message;
import org.apache.rocketmq.example.batch.RequestAccessDataMsg;
import org.apache.rocketmq.remoting.common.RemotingHelper;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * This class demonstrates how to send messages to brokers using provided {@link DefaultMQProducer}.
 */
public class Producer {
    public static void main(String[] args) throws MQClientException, InterruptedException {

        /*
         * Instantiate with a producer group name.
         */
        DefaultMQProducer producer = new DefaultMQProducer("hlj-stargate-producer");

        /*
         * Specify name server addresses.
         * <p/>
         *
         * Alternatively, you may specify name server addresses via exporting environmental variable: NAMESRV_ADDR
         * <pre>
         * {@code
         * producer.setNamesrvAddr("name-server1-ip:9876;name-server2-ip:9876");
         * }
         * </pre>
         */
        producer.setNamesrvAddr("127.0.0.1:9876");
        /*
         * Launch the instance.
         */
        producer.start();

        for (int i = 0; i <= 2000; i++) {
            try {
                Long userId = 654321L;
                /*
                 * Create a message instance, specifying topic, tag and message body.
                 */
                RequestAccessDataMsg requestAccessDataMsg = new RequestAccessDataMsg();
                requestAccessDataMsg.setClientIp("129.123.15.48");
                requestAccessDataMsg.setHost("localhost");
                requestAccessDataMsg.setIdfa("aaa");
                requestAccessDataMsg.setPath("/api/test/jello");
                requestAccessDataMsg.setRt(20L);
                requestAccessDataMsg.setRequestTime(new Date());

                Message msg = new Message("hlj-stargate-request-access-data-topic" /* Topic */,
                    "original-request-record" /* Tag */,
                   (JSON.toJSONString(requestAccessDataMsg)).getBytes(RemotingHelper.DEFAULT_CHARSET) /* Message body */
                );

                /*
                 * Call send message to deliver message to one of brokers.
                 */
                SendResult sendResult = producer.send(msg);

                System.out.printf("%s%n", sendResult);
                //TimeUnit.SECONDS.sleep(1);
            } catch (Exception e) {
                e.printStackTrace();
                Thread.sleep(1000);
            }
        }

        /*
         * Shut down once the producer instance is not longer in use.
         */
        producer.shutdown();
    }
}
