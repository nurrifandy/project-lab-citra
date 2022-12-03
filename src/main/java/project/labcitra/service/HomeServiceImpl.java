package project.labcitra.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service

public class HomeServiceImpl implements HomeService{

    @Override
    public void homePage(){
        System.out.println("Hello");
    }

}
