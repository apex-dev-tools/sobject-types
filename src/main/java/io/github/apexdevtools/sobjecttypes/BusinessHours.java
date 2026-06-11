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
public class BusinessHours extends SObject {
	public static SObjectType$<BusinessHours> SObjectType;
	public static SObjectFields$<BusinessHours> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public Time FridayEndTime;
	public Time FridayStartTime;
	public Id Id;
	public Boolean IsActive;
	public Boolean IsDefault;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastViewedDate;
	public Time MondayEndTime;
	public Time MondayStartTime;
	public String Name;
	public Time SaturdayEndTime;
	public Time SaturdayStartTime;
	public Time SundayEndTime;
	public Time SundayStartTime;
	public Datetime SystemModstamp;
	public Time ThursdayEndTime;
	public Time ThursdayStartTime;
	public String TimeZoneSidKey;
	public Time TuesdayEndTime;
	public Time TuesdayStartTime;
	public Time WednesdayEndTime;
	public Time WednesdayStartTime;

	public Case[] Cases;
	public Entitlement[] Entitlements;
	public Incident[] Incidents;
	public IndividualApplication[] IndividualApplications;
	public MessagingChannel[] MessagingChannels;
	public WorkOrder[] WorkOrders;

	public BusinessHours clone$() {throw new java.lang.UnsupportedOperationException();}
	public BusinessHours clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public BusinessHours clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public BusinessHours clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public BusinessHours clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
