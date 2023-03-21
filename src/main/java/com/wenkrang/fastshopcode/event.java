package com.wenkrang.fastshopcode;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;


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
                ItemStack back = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
                ItemMeta back_meta = back.getItemMeta();
                back_meta.setDisplayName("");
                back.setItemMeta(back_meta);

                //渲染物品
                GUI.setItem(0, back);
                GUI.setItem(1, back);
                GUI.setItem(2, back);
                GUI.setItem(3, back);
                GUI.setItem(4, back);
                GUI.setItem(5, back);
                GUI.setItem(6, back);
                GUI.setItem(7, back);
                GUI.setItem(8, back);

                GUI.setItem(14, back);
                GUI.setItem(15, back);
                GUI.setItem(16, back);
                GUI.setItem(17, back);
                GUI.setItem(18, back);
                GUI.setItem(19, back);
                GUI.setItem(20, back);
                GUI.setItem(21, back);
                GUI.setItem(22, back);
                GUI.setItem(23, back);
            }

            event.setCancelled(true); //取消点击事件
        }
    }
}
