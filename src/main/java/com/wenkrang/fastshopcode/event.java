package com.wenkrang.fastshopcode;

import org.bukkit.Bukkit;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;


//初始化监听器
public class event implements Listener {
    @EventHandler
    public void gui(InventoryClickEvent event) {
        //防止玩家拿走物品
        if (event.getView().getTitle().equalsIgnoreCase("FastShop-快速商店")) {
            //检测点击事件

            //点击事件 一
            //TODO:打开上传界面
            //事件ID:A001
            if (event.getRawSlot() == 6) {
                //新建界面 --> GUI
                Inventory GUI = Bukkit.createInventory(null, 27, "FastShop --> 销售 | 上传");
                //界面说明 --> 打开一个可供玩家使用的物品销售界面

                //定义物品

                //背景
                //TODO:装饰 awa


                //渲染物品
            }

            event.setCancelled(true); //取消点击事件
        }
    }
}
