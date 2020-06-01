package com.tellus.crud.service;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.tellus.crud.support.EntityUtil;

import java.util.function.Supplier;

/**
 * 自定义: IService 实现类
 *
 * @author Roy
 * @date 2020/5/25 22:51
 */
public class ICustomizeServiceImpl<M extends BaseMapper<T>, T> extends ServiceImpl<M, T> implements ICustomizeService<T> {

}
