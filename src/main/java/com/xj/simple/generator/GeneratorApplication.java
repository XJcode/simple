package com.xj.simple.generator;

import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.generator.FastAutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.OutputFile;
import com.baomidou.mybatisplus.generator.fill.Column;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GeneratorApplication {

    /**
     * 数据源配置
     */
    private static final DataSourceConfig.Builder DATA_SOURCE_CONFIG = new DataSourceConfig
            .Builder("jdbc:mysql://127.0.0.1:3306/demo?serverTimezone=Asia/Shanghai", "root", "123456");


    public static void main(String[] args) {

        FastAutoGenerator.create(DATA_SOURCE_CONFIG)
                // 全局配置
                .globalConfig((scanner, builder) -> {
                    builder.author(scanner.apply("请输入作者名称："))
                            .outputDir(System.getProperty("user.dir") + "/src/main/java")
                            .commentDate("yyyy-MM-dd")
                            .fileOverride();
                })
                // 包配置
                .packageConfig((scanner, builder) -> {
                    builder.parent(scanner.apply("请输入包名"))
                            .entity("domain.po")
                            .service("service")
                            .serviceImpl("service.impl")
                            .mapper("mapper")
                            .xml("mapper.xml")
                            .controller("controller")
                            .pathInfo(Collections.singletonMap(OutputFile.mapperXml, System.getProperty("user.dir") + "/src/main/resources/mapper"));
                })
                // 策略配置
                .strategyConfig((scanner, builder) -> {
                    builder.addInclude(getTables(scanner.apply("请输入表名，多个英文逗号分隔？所有输入 all")))
                            // 控制器
                            .controllerBuilder().enableRestStyle().enableHyphenStyle()
                            .entityBuilder().enableLombok()
                            .build();
                })
                .execute();
    }

    // 处理 all 情况
    protected static List<String> getTables(String tables) {
        return "all".equals(tables) ? Collections.emptyList() : Arrays.asList(tables.split(","));
    }
}
