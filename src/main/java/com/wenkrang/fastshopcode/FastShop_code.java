package com.wenkrang.fastshopcode;

import org.bukkit.plugin.java.JavaPlugin;

public class FastShop_code extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        //注册命令
        //主菜单命令注册
        this.getCommand("fs").setExecutor(new fs());
        this.getCommand("fsinfo").setExecutor(new fsinfo());

        //检测配置文件与存档是否存在

        //注册监听器
        getServer().getPluginManager().registerEvents(new event(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
