/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OperatingHoursHolidayChangeEvent extends SObject {
	public static SObjectType$<OperatingHoursHolidayChangeEvent> SObjectType;
	public static SObjectFields$<OperatingHoursHolidayChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String DateAndTime;
	public Id HolidayId;
	public Holiday Holiday;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String OperatingHoursHolidayNumber;
	public Id OperatingHoursId;
	public OperatingHours OperatingHours;
	public String ReplayId;

	public OperatingHoursHolidayChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public OperatingHoursHolidayChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OperatingHoursHolidayChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OperatingHoursHolidayChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OperatingHoursHolidayChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
