# StarFloatView
## 在工程目录的build.gradle中添加JitPack.io的代码仓库地址

    allprojects {
      repositories {
        ...
        maven { url 'https://jitpack.io' }
      }
    }
    
## 项目目录中的build.gradle中添加依赖

    dependencies {
            compile 'com.github.ErChenZhang:StarFloatView:v1.0'
    }
