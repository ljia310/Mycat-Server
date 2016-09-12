package io.mycat.config.loader.zookeeper.create.flow;

import java.io.File;

import io.mycat.config.loader.zookeeper.create.comm.SeqLinkedList;
import io.mycat.config.loader.zookeeper.create.comm.ServiceExecInf;

/**
 * 将节点的单独的配制信息录入到zk中
* 源文件名：FlowToNodeService.java
* 文件版本：1.0.0
* 创建作者：liujun
* 创建日期：2016年9月11日
* 修改作者：liujun
* 修改日期：2016年9月11日
* 文件描述：TODO
* 版权所有：Copyright 2016 zjhz, Inc. All Rights Reserved.
*/
public class FlowToNodeService implements ServiceExecInf {

    public static void main(String[] args) {
        System.out.println("File.pathSeparator:" + File.pathSeparator);
        System.out.println("File.pathSeparatorChar:" + File.pathSeparatorChar);
        System.out.println("File.separator:" + File.separator);
        System.out.println("File.separatorChar:" + File.separatorChar);
    }

    @Override
    public boolean invoke(SeqLinkedList seqList) throws Exception {
        return false;
    }

    @Override
    public boolean rollBackInvoke(SeqLinkedList seqList) throws Exception {
        return false;
    }

}
