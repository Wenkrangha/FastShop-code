package com.wenkrang.fastshopcode;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

//初始化命令 fs
//TODO:此命令可以打开FastShop的主菜单


public class fs implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        Inventory GUI = Bukkit.createInventory(null, 54, "FastShop-快速商店");
        if (sender instanceof Player player) {
            //获取玩家对象
            player.openInventory(GUI);

            //初始化界面图标
            //背景
            //TODO:没啥用装饰
            ItemStack back = new ItemStack(Material.LIGHT_BLUE_STAINED_GLASS_PANE);
            back.getItemMeta().setDisplayName("");

            //玩家的头
            //TODO:WHO ARE YOU????????????
            ItemStack head = new ItemStack(Material.PLAYER_HEAD);
            ItemMeta head_meta = head.getItemMeta();
            head_meta.setDisplayName("§6" + player.getDisplayName());
            head.setItemMeta(head_meta);
            //出售
            //TODO:将你的东西展示在FastShop平台上
            ItemStack add = new ItemStack(Material.NETHER_STAR);
            ItemMeta add_meta = add.getItemMeta();
            add_meta.setDisplayName("§6出售");
            ArrayList<String> head_lore = new ArrayList<>();
            head_lore.add("");
            head_lore.add("§7|投放你的物品到到平台");
            head_lore.add("§7|销售");
            head_meta.setLore(head_lore);
            head.setItemMeta(head_meta);
            //渲染图标

            //TODO:渲染背景
            GUI.setItem(0, back);
            GUI.setItem(1, head);
            GUI.setItem(2, back);
            GUI.setItem(3, back);
            GUI.setItem(4, back);
            GUI.setItem(5, back);
            GUI.setItem(6, back);
            GUI.setItem(7, back);
            GUI.setItem(8, back);

            GUI.setItem(45, back);
            GUI.setItem(46, back);
            GUI.setItem(47, back);
            GUI.setItem(48, back);
            GUI.setItem(49, back);
            GUI.setItem(50, back);
            GUI.setItem(51, back);
            //52号物品 < == > 点击事件ID:A001
            GUI.setItem(52, add);
            GUI.setItem(53, back);


        } else {
            sender.sendMessage("[!] 此命令不能在终端运行");
        }
        return true;
    }
}
