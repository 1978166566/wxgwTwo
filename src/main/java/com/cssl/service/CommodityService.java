package com.cssl.service;

import com.github.pagehelper.Page;

import java.util.List;
import java.util.Map;

public interface CommodityService {
    /**
     * 分页查询卖场推荐
     * @return
     */
    public List<Map<String, String>> mall();
    /**
     * 查询二级分类下的部分商品
     * @param oc_id
     * @return
     */
    public List<Map<String, String>> selTowPro(Integer oc_id);

    /**
     * 查询分类下的商品
     * @param figure 判断是几级分类
     * @param cid 分类id
     * @param pageno 当前页
     * @return
     */
    public Page<Map<String,Object>> selcomm(int figure, int cid, int pageno);

    /**
     * 退货或者取消订单时返还库存
     * @param CY_INVENTORY 返还的库存数量
     * @param CY_ID 商品id
     * @return
     */
    public int updaquantity(int CY_INVENTORY, int CY_ID);
}
