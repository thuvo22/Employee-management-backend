package com.bf.employee.service;

import com.bf.employee.entity.VisaStatus;

public interface VisaStatusService {
    public VisaStatus getVisaStatus(int employeeVisaStatusId);

    public Boolean updateVisaType(int employeeVisaStatusId, String visaType);

}
