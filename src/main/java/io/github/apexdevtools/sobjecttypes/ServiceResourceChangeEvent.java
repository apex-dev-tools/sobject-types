/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ServiceResourceChangeEvent extends SObject {
	public static SObjectType$<ServiceResourceChangeEvent> SObjectType;
	public static SObjectFields$<ServiceResourceChangeEvent> Fields;

	public Id AccountId;
	public Account Account;
	public Id AssetId;
	public Asset Asset;
	public Object ChangeEventHeader;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsCapacityBased;
	public Boolean IsOptimizationCapable;
	public Boolean IsPrimary;
	public Decimal LastKnownLatitude;
	public Location LastKnownLocation;
	public Datetime LastKnownLocationDate;
	public Decimal LastKnownLongitude;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Id LocationId;
	public Location Location;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public Id RelatedRecordId;
	public User RelatedRecord;
	public String ReplayId;
	public String ResourceType;
	public Id SchedulingConstraintId;
	public SchedulingConstraint SchedulingConstraint;
	public Id ServiceCrewId;
	public ServiceCrew ServiceCrew;

	public ServiceResourceChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public ServiceResourceChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResourceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResourceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ServiceResourceChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
