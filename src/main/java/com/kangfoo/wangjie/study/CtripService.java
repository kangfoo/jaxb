package com.kangfoo.wangjie.study;

import javax.jws.WebParam;
import javax.jws.WebService;

/**
 * User: kangfoo-mac
 * Date: 16-1-7
 * Time: 下午4:53
 *
 * TODO , 可以定义子接口，对 invoke 做进一步的序列化和反序列化操作
 */
@WebService(name = "ctripService", targetNamespace = WsConstants.NS)
public interface CtripService {
//    @WebParam(name = "id") Long id
    String invoke(@WebParam(name = "xml") String xml, @WebParam(name = "Invoketype")String invokeType);
}
