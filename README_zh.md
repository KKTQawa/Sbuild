# Sbuild

[English](README.md)

[![Minecraft Version](https://img.shields.io/badge/Minecraft-1.20--1.21-brightgreen)](https://www.minecraft.net/)
[![Forge Version](https://img.shields.io/badge/Forge-46%2B-orange)](https://files.minecraftforge.net/)
[![ECNU-Minecraft-Mod-Template](https://img.shields.io/badge/Template-ECNU--Minecraft--Mod--Template-lightgrey)](https://github.com/Viola-Siemens/ECNU-Minecraft-Mod-Template)
[![License](https://img.shields.io/badge/License-MIT-blue)](LICENSE)
[![GitHub Issues](https://img.shields.io/badge/GitHub-Issues-yellow)](https://github.com/KKTQawa/Sbuild/issues)

> 让华东师范大学再次伟大！！！

---

## 📖 概述

**Sbuild** 是一款 Minecraft Forge 模组，添加了多种建筑方块、结构和物品，灵感来源于上海城市和华东师范大学。

本模组主要面向：
- 🏗️ 想要独特装饰方块的建筑玩家  
- 🧭 渴望更丰富世界内容的生存与冒险玩家  
- 🌏 展示地区与文化风格

---

## ⚠️ 注意事项
请勿随意从现有世界中移除此模组。
否则该模组添加的方块可能会缺失，导致结构损坏。

---

## ✨ 特性

### 🧱 建筑方块

- **线条方块**  
  多种颜色的线条图案装饰方块。以下是部分预览：
  ![Line Blocks](resources/images/line_blocks.png)

- **网格方块**  
  简洁网格风格的方块，适用于精细建筑。以下是部分预览：
  ![Grid Blocks](resources/images/grid_blocks.png)

- **其他**  
  额外的装饰和功能性方块  
  ![Other Blocks](resources/images/others.png)  
  ![Extra Blocks](resources/images/extra_blocks.png)

---

### ⚙️ 游戏机制

- 大多数方块：  
  ➤ 配方：**3 圆石 → 4 个方块**  
  ➤ 需要至少 **石镐** 才能挖掘

- 盒子：  
  ➤ 大小：**4 × 9 个槽位**

- 徽章：  
  ➤ 配方：**3 张纸**

- 💥 爆炸抗性：  
  ➤ 所有建筑方块都 **具有高抗爆性**  
  ![Explosion Resistance](resources/images/no_tnt.png)

---

### 🏛️ 结构

#### 🏫 校园建筑
- 生成于 **平坦地形和海洋**

/locate structure sbuild:dorm_5_lobby

![Dorm Lobby](resources/images/no_5_dorm_lobby.png)

- 校门：

/locate structure sbuild:school_gate

![School Gate](resources/images/school_gate.png)

---

#### 📮 驿站
- 生成于 **平坦地形和海洋**

/locate structure sbuild:post_station1

![Post Station 1](resources/images/post_station1.png)

/locate structure sbuild:post_station2

![Post Station 2](resources/images/post_station2.png)

---

#### 🌉 桥梁
- **仅在河流生物群系生成**

/locate structure sbuild:bridge1

![Bridge 1](resources/images/bridge1.png)

/locate structure sbuild:bridge2

![Bridge 2](resources/images/bridge2.png)

---

## 📦 安装教程

1. 安装 [Minecraft Forge](https://files.minecraftforge.net/)（版本 46 或更高）  
2. 从 [Releases](https://github.com/KKTQawa/Sbuild/releases) 下载最新的 **Sbuild** `.jar` 文件  
3. 将 `.jar` 文件放入你的 `mods` 文件夹  
4. 使用 Forge 配置启动 Minecraft  

---

## ⚠️ 需求

- Minecraft：**1.20 – 1.21**
- Forge：**46+**
- Java：**17+**

---

## 🛠️ 从源码构建

```bash
./gradlew build
```
编译后的 .jar 文件位于：
```
build/libs/
```
📜 许可证

本项目采用 MIT 许可证。
详见 LICENSE 文件。

👥 贡献者
作者：9090
贡献者：刘冬煜、9090

---

## 📦 致谢

本项目基于以下模板，并使用了其部分代码：

👉 https://github.com/Viola-Siemens/ECNU-Minecraft-Mod-Template

特别感谢 **ECNU-Minecraft-Mod-Template** 提供的基座。