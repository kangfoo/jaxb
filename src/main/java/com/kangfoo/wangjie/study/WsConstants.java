package com.kangfoo.wangjie.study;

/**
 * WebService常量定义.
 * 
 */
public interface WsConstants {

	/** 项目内统一的NameSpace定义. **/
	public static final String NS = "http://study.wangjie.kangfoo.com";// 请根据需要自己修改成自己公司的域名

//    接口
//            接口名称
//    发起端
//    ￼￼
//            ￼￼￼￼￼
//    GetCtripRoomTypeInfo
//            获取房型
//    Hotel
//    ￼￼￼￼
//            ￼￼￼￼￼
//    SetRoomPrice
//            设置房价
//    Hotel
//    ￼￼￼￼
//            ￼￼￼￼￼
//    SetRoomInfo
//            设置房态
//    Hotel
//    ￼￼￼￼￼
//            ￼￼
//            ￼￼￼￼￼
//            ￼￼
//            ￼￼￼DomesticCheckRoomAvail
//            可订检查
//    Ctrip
//    ￼￼
//            ￼￼
//            ￼￼￼DomesticSubmitNewHotelOrder
//            提交订单
//    Ctrip
//    ￼￼￼￼
//            ￼￼
//            ￼￼￼DomesticModifyHotelOrder
//    ￼￼
//            ￼￼
//    DomesticCancelHotelOrder
//            修改订单
//    Ctrip
//    ￼￼￼取消订单
//    ￼￼￼￼
//            ￼￼
//            ￼￼
//            ￼￼
//            ￼￼￼￼￼￼￼
//            ￼￼
//            ￼￼￼￼￼￼￼
//            ￼￼
//            ￼￼
//            ￼￼
//    获取酒店信息
//            Ctrip
//    ￼￼￼DomesticPushOrderStatus
//            推送订单状态
//    Hotel
//    ￼￼￼DomesticGetOrderStatus
//            订单状态查询
//    Ctrip
//    ￼￼￼GetHotelIDList
//    获取酒店 ID
//    Ctrip
//    ￼
//            ￼￼GetHotelInfo
//            Ctrip
//    ￼￼￼￼
//            ￼￼
//            ￼￼GetRoomTypeInfo
//            获取房型信息
//    Ctrip
//    ￼￼￼￼
//            ￼￼￼￼
//    GetHotelFacilityInfo
//            获取设施设备
//    Ctrip
//    ￼￼￼￼
//            ￼￼￼￼
//    GetHotelImageInfo
//            获取图片
//    Ctrip
//    ￼￼￼￼￼￼
//            ￼￼
//            ￼￼￼￼￼
//            ￼￼
//    GetOrderNoBookingInfo
//            获取审核信息
//    Ctrip
    public static enum InvokeType{
        GetCtripRoomTypeInfo, SetRoomPrice, SetRoomInfo
    // .....  TODO
    }
}
