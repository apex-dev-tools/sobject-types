/*
 * Copyright (c) 2024 Certinia Inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class AppointmentSchedulingPolicy extends SObject {
	public static SObjectType$<AppointmentSchedulingPolicy> SObjectType;
	public static SObjectFields$<AppointmentSchedulingPolicy> Fields;

	public String AppointmentStartTimeInterval;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String DeveloperName;
	public Id ExtCalEventHandlerId;
	public ApexClass ExtCalEventHandler;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsOrgDefault;
	public Boolean IsSvcTerrOpHoursWithShiftsUsed;
	public Boolean IsSvcTerritoryMemberShiftUsed;
	public String Language;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String MasterLabel;
	public Boolean ShouldConsiderCalendarEvents;
	public Boolean ShouldEnforceExcludedResource;
	public Boolean ShouldEnforceRequiredResource;
	public Boolean ShouldMatchSkill;
	public Boolean ShouldMatchSkillLevel;
	public Boolean ShouldRespectVisitingHours;
	public Boolean ShouldUsePrimaryMembers;
	public Boolean ShouldUseSecondaryMembers;
	public Datetime SystemModstamp;

	public AppointmentSchedulingPolicy clone$() {throw new java.lang.UnsupportedOperationException();}
	public AppointmentSchedulingPolicy clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentSchedulingPolicy clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentSchedulingPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public AppointmentSchedulingPolicy clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
