package com.zhangyuhang.InterfaceAndEntry.Interface;



import com.zhangyuhang.InterfaceAndEntry.Entry.User;
import java.util.List;

public interface IUserService {
    public List<User> findByUsername();
}
