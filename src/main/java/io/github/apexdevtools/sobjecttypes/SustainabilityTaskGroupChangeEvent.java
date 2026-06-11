/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class SustainabilityTaskGroupChangeEvent extends SObject {
	public static SObjectType$<SustainabilityTaskGroupChangeEvent> SObjectType;
	public static SObjectFields$<SustainabilityTaskGroupChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Location;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Date PeriodEndDate;
	public Date PeriodStartDate;
	public String ReplayId;
	public String Status;
	public Date TaskDueDate;
	public String Type;

	public SustainabilityTaskGroupChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityTaskGroupChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityTaskGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityTaskGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public SustainabilityTaskGroupChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
