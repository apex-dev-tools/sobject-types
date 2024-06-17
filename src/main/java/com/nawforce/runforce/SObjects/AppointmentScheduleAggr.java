/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class AppointmentScheduleAggr extends SObject {
	public static SObjectType$<AppointmentScheduleAggr> SObjectType;
	public static SObjectFields$<AppointmentScheduleAggr> Fields;

	public Date AppointmentDate;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Name;
	public Integer ResourceUtilizationCount;
	public Id ServiceResourceId;
	public ServiceResource ServiceResource;
	public Datetime SystemModstamp;
	public Decimal TotalResourceUtilization;
	public String UsageType;

	public AppointmentScheduleLog[] AppointmentScheduleAggr;

	public AppointmentScheduleAggr clone$() {throw new java.lang.UnsupportedOperationException();}
	public AppointmentScheduleAggr clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentScheduleAggr clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentScheduleAggr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentScheduleAggr clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
