package com.leyou.goods.listener;

import com.leyou.goods.service.GoodsHtmlService;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.Exchange;
import org.springframework.amqp.rabbit.annotation.Queue;
import org.springframework.amqp.rabbit.annotation.QueueBinding;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class GoodsListener {

    @Autowired
    private GoodsHtmlService htmlService;

    @RabbitListener(bindings = @QueueBinding(
            value = @Queue(value = "LEYOU.ITEM.SAVE.QUEUE" , durable = "true"),
            exchange = @Exchange(value = "LEYOU.ITEM.EXCHANGE" , ignoreDeclarationExceptions = "true" , type = ExchangeTypes.TOPIC),
            key = {"item.insert" , "item.update"}
    ))
    public void save(Long id){
        if (id == null){
            return;
        }
        this.htmlService.creatHtml(id);
    }
}
