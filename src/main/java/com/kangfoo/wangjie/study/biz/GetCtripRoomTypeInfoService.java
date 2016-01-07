package com.kangfoo.wangjie.study.biz;

import com.kangfoo.wangjie.study.CtripService;
import com.kangfoo.wangjie.study.response.RequestResponse;
import com.kangfoo.wangjie.study.response.RequestResultType;
import com.kangfoo.wangjie.study.response.ResponseType;
import com.kangfoo.wangjie.study.utils.JaxbUtil;
import org.apache.cxf.binding.soap.SOAPBindingUtil;
import org.springframework.stereotype.Service;

import static com.kangfoo.wangjie.study.WsConstants.InvokeType.GetCtripRoomTypeInfo;

/**
 * User: kangfoo-mac
 * Date: 16-1-7
 * Time: 下午5:44
 */
@Service
public class GetCtripRoomTypeInfoService implements CtripService {
    @Override
    public String invoke(String xml, String invokeType) {

        System.out.println("请求的报文：\t\n"+xml);

        String resq = buildRequestResponse();
        System.out.println("响应报文：\t\n"+resq);
        return resq;
    }

    private String buildRequestResponse(){
        JaxbUtil jaxbUtil = new JaxbUtil(RequestResponse.class);

        com.kangfoo.wangjie.study.response.ObjectFactory factory = new com.kangfoo.wangjie.study.response.ObjectFactory();
        RequestResponse response = factory.createRequestResponse();

        RequestResultType resultType = factory.createRequestResultType();
        resultType.setMessage("msg");
        resultType.setResultCode("001");


        ResponseType responseType = factory.createResponseType();
        com.kangfoo.wangjie.study.response.HeaderInfoType headerInfoType = factory.createHeaderInfoType();
        headerInfoType.setResultCode("Success");
        responseType.setHeaderInfo(headerInfoType);

//        <HotelGroupInterfaceRoomTypeListResponse> 。。。 。。。。
        resultType.setResponse(responseType);

        response.setRequestResult(resultType);
        return jaxbUtil.toXml(response);
    }

}
