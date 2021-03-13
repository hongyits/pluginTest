package com.huanghy.scaff.batchUtils;

import com.huanghy.scaff.domain.AuthUser;
import org.springframework.batch.item.validator.ValidatingItemProcessor;
import org.springframework.batch.item.validator.ValidationException;

public class CVSItemProcessor extends ValidatingItemProcessor<AuthUser> {
    @Override
    public AuthUser process(AuthUser item) throws ValidationException {
        // TODO Auto-generated method stub
        super.process(item);
//		if("是".equalsIgnoreCase(item.getIsSuperuser())){
//			item.setIsSuperuser(YES);
//		} else {
//			item.setIsSuperuser(NO);
//		}
//
//		if("是".equalsIgnoreCase(item.getIsActive())){
//			item.setIsActive(YES);
//		} else {
//			item.setIsActive(NO);
//		}
//
//		if("是".equalsIgnoreCase(item.getIsStaff())){
//			item.setIsStaff(YES);
//		} else {
//			item.setIsStaff(NO);
//		}
        return item;

    }

}
