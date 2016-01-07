package com.kangfoo.wangjie.study;

import com.kangfoo.wangjie.study.biz.GetCtripRoomTypeInfoService;
import org.apache.cxf.feature.Features;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.jws.WebService;

import static com.kangfoo.wangjie.study.WsConstants.InvokeType.*;

/**
 * User: kangfoo-mac
 * Date: 16-1-7
 * Time: 下午5:08
 */
@Service
// serviceName指明WSDL中<wsdl:service>与<wsdl:binding>元素的名称, endpointInterface属性指向Interface类全称.      //http://study.wangjie.kangfoo.com
// 增加inbound/outbound SOAP内容的日志
@Features(features = "org.apache.cxf.feature.LoggingFeature")
public class CtripServiceImpl implements CtripService {

    @Autowired
    private GetCtripRoomTypeInfoService getCtripRoomTypeInfoService;

    @Override
    public String invoke(String xml, String invokeType) {
        if (invokeType!=null ){
            WsConstants.InvokeType method = WsConstants.InvokeType.valueOf(invokeType.trim());
            switch (method){
                case  GetCtripRoomTypeInfo:
                    return getCtripRoomTypeInfoService.invoke(xml, invokeType);
                case SetRoomInfo:
                    System.out.println(SetRoomInfo.name());
                    break;
                case SetRoomPrice:
                    System.out.println(SetRoomPrice);
                    break;
                default:
                    System.err.println("未定义的类型");
            }
        }
        return null;
    }
}
