/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class WorkTypeChangeEvent extends SObject {
	public static SObjectType$<WorkTypeChangeEvent> SObjectType;
	public static SObjectFields$<WorkTypeChangeEvent> Fields;

	public Id AppointmentCategoryId;
	public AppointmentCategory AppointmentCategory;
	public Integer ApptStartTimeIntvlInMin;
	public Integer AttendeeLimit;
	public Integer BlockTimeAfterAppointment;
	public String BlockTimeAfterUnit;
	public Integer BlockTimeBeforeAppointment;
	public String BlockTimeBeforeUnit;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DefaultAppointmentType;
	public String Description;
	public Decimal DurationInMinutes;
	public String DurationType;
	public Decimal EstimatedDuration;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer MinimumCrewSize;
	public String Name;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public Id OwnerId;
	public User Owner;
	public Id ProductId;
	public Product2 Product;
	public Integer RecommendedCrewSize;
	public String ReplayId;
	public Id ServiceReportTemplateId;
	public ServiceReportLayout ServiceReportTemplate;
	public Boolean ShouldAutoCreateSvcAppt;
	public String TimeFrameEndUnit;
	public String TimeFrameStartUnit;
	public Integer TimeframeEnd;
	public Integer TimeframeStart;

	public WorkTypeChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public WorkTypeChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
