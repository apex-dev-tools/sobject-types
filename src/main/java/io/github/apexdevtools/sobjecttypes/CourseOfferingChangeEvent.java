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
public class CourseOfferingChangeEvent extends SObject {
	public static SObjectType$<CourseOfferingChangeEvent> SObjectType;
	public static SObjectFields$<CourseOfferingChangeEvent> Fields;

	public Object ChangeEventHeader;
	public Id CourseNameId;
	public TrnCourse CourseName;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Datetime EndDate;
	public Id Id;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LocationId;
	public Location Location;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String ReplayId;
	public Datetime StartDate;

	public CourseOfferingChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public CourseOfferingChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public CourseOfferingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public CourseOfferingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public CourseOfferingChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
