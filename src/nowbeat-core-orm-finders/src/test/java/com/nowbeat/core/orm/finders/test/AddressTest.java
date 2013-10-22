package com.nowbeat.core.orm.finders.test;

import com.nowbeat.core.orm.Address;
import com.nowbeat.core.orm.finders.repositories.AddressRepository;
import com.nowbeat.core.orm.finders.repositories.AddressRepositoryImpl;
import com.nowbeat.core.orm.finders.repositories.DbFuncs;
import com.nowbeat.enums.AddressType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.springframework.transaction.annotation.Transactional;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.annotation.Resource;

/**
 * Created with IntelliJ IDEA.
 * User: shreyaslokkur
 * Date: 17/10/13
 * Time: 10:51 PM
 * To change this template use File | Settings | File Templates.
 */
@ContextConfiguration(locations = {
        "classpath:application-context-orm.xml",
        "classpath:application-context-orm-persistence-unit.xml",
        "classpath:application-context-orm-finders.xml"

})
@Transactional
@Configurable
public class AddressTest extends AbstractTestNGSpringContextTests {

    @Resource(name="dbFuncs")
    DbFuncs dbFuncs;

   @Test
    public void test()
   {

       Address address = new Address();
       address.setAddressCode("a");
       address.setAddressType(AddressType.MAIL);
       dbFuncs.entities.addressRepository.save(address);
       Assert.assertEquals(1, 1);
   }

}
