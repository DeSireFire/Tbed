package cn.hellohao.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.hellohao.dao.KeysMapper;
import cn.hellohao.pojo.Keys;
import cn.hellohao.service.KeysService;

import java.util.List;

@Service
public class KeysServiceImpl implements KeysService {

    @Autowired
    private KeysMapper keysMapper;

    @Override
    public Keys selectKeys(Integer id) {
        // TODO Auto-generated method stub
        return keysMapper.selectKeys(id);
    }
    @Override
    public List<Keys> getStorageName() {
        return keysMapper.getStorageName();
    }
    @Override
    public Integer updateKey(Keys key) {
        // TODO Auto-generated method stub
        return keysMapper.updateKey(key);
    }

    @Override
    public List<Keys> getKeys() {
        return keysMapper.getKeys();
    }

}
