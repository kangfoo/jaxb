package com.kangfoo.wangjie.study.biz;

import com.kangfoo.wangjie.study.WsConstants;
import com.kangfoo.wangjie.study.request.*;
import com.kangfoo.wangjie.study.request.HeaderInfoType;
import com.kangfoo.wangjie.study.request.ObjectFactory;
import com.kangfoo.wangjie.study.response.*;
import com.kangfoo.wangjie.study.utils.JaxbUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@DirtiesContext
@ContextConfiguration(locations = {"/applicationContext-test.xml"})
public class GetCtripRoomTypeInfoServiceTest extends AbstractJUnit4SpringContextTests {


    @Autowired
    private GetCtripRoomTypeInfoService service;

    @org.junit.Test
    public void testInvoke() throws Exception {
        JaxbUtil jaxbUtil = new JaxbUtil(com.kangfoo.wangjie.study.request.Request.class);
        String resq = service.invoke(jaxbUtil.toXml(buildRequest()), WsConstants.InvokeType.GetCtripRoomTypeInfo.name());
        assert resq!=null;
    }

    private RequestResponse buildRequestResponse(){
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
        return response;
    }

    private Request buildRequest(){
        ObjectFactory factory = new ObjectFactory();
        Request request = factory.createRequest();

        HeaderInfoType headerInfoType = factory.createHeaderInfoType();
        headerInfoType.setUserID("77");
        headerInfoType.setRequestorId("kangfoo");
        headerInfoType.setAsyncRequest("false");
        headerInfoType.setTimeStamp("2016-01-01 12:12:12");

        AuthenticationType auth = factory.createAuthenticationType();
        auth.setUserName("wangjie");
        auth.setPassword("wangjie");
        headerInfoType.setAuthentication(auth);

        RequestTypeType requestTypeType = factory.createRequestTypeType();
        requestTypeType.setName("GetCtripRoomTypeInfo");
        requestTypeType.setVersion("1.0");
        headerInfoType.setRequestType(requestTypeType);

        HotelGroupInterfaceRoomTypeListRequestType hotel = factory.createHotelGroupInterfaceRoomTypeListRequestType();
        hotel.setHotelGroupHotelCode("101");
        hotel.setHotelGroupRoomTypeCode("roomTypeCode");
        hotel.setHotelGroupBrand("groupBrand");
        hotel.setHotelGroupRatePlanCode("planCode");

        request.setHeaderInfo(headerInfoType);
        request.setHotelGroupInterfaceRoomTypeListRequest(hotel);

        return request;
    }
}