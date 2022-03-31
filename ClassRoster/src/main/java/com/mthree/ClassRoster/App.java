package com.mthree.ClassRoster;

import com.mthree.ClassRoster.controller.ClassRosterController;
import com.mthree.ClassRoster.dao.ClassRosterAuditDao;
import com.mthree.ClassRoster.dao.ClassRosterAuditDaoFileImpl;
import com.mthree.ClassRoster.dao.ClassRosterDaoFileImpl;
import com.mthree.ClassRoster.dao.ClassRosterDao;
import com.mthree.ClassRoster.service.ClassRosterServiceLayer;
import com.mthree.ClassRoster.service.ClassRosterServiceLayerImpl;
import com.mthree.ClassRoster.ui.ClassRosterView;
import com.mthree.ClassRoster.ui.UserIO;
import com.mthree.ClassRoster.ui.UserIOConsoleImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {

//        UserIO myIo = new UserIOConsoleImpl();
//        ClassRosterView myView = new ClassRosterView(myIo);
//        ClassRosterDao myDao = new ClassRosterDaoFileImpl();
//        ClassRosterAuditDao myAuditDao = new ClassRosterAuditDaoFileImpl();
//        ClassRosterServiceLayer myService = new ClassRosterServiceLayerImpl(myDao, myAuditDao);
//        ClassRosterController controller = new ClassRosterController(
//                myService, myView
//        );
//        controller.run();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");

        ClassRosterController controller =
                ctx.getBean("controller", ClassRosterController.class);
        controller.run();
    }
}
