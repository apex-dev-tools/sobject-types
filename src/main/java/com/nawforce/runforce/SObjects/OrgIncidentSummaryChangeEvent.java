/*
 * Copyright (c) 2025 Certinia Inc. All rights reserved.
 */

package com.nawforce.runforce.SObjects;

import com.nawforce.runforce.Internal.SObjectFields$;
import com.nawforce.runforce.Internal.SObjectType$;
import com.nawforce.runforce.System.Boolean;
import com.nawforce.runforce.System.Integer;
import com.nawforce.runforce.System.String;
import com.nawforce.runforce.System.*;

@SuppressWarnings("unused")
public class OrgIncidentSummaryChangeEvent extends SObject {
	public static SObjectType$<OrgIncidentSummaryChangeEvent> SObjectType;
	public static SObjectFields$<OrgIncidentSummaryChangeEvent> Fields;

	public String Category;
	public Object ChangeEventHeader;
	public String CorrectiveActionType;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public Id DisclsReportingPeriodId;
	public DisclsReportingPeriod DisclsReportingPeriod;
	public Decimal FineAmount;
	public String HazardType;
	public Decimal HoursWorked;
	public Id Id;
	public Decimal IncidentCount;
	public String IncidentSubtype;
	public String IncidentType;
	public Boolean IsWorkRelated;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Integer LostHours;
	public Decimal MonetaryLoss;
	public String Name;
	public Id OwnerId;
	public User Owner;
	public String PenaltyType;
	public String ReplayId;
	public Id SubsidiaryAccountId;
	public Account SubsidiaryAccount;
	public Integer WorkingDaysReportingPeriod;
	public Integer WorkingHoursDay;

	public OrgIncidentSummaryChangeEvent clone$() {throw new java.lang.UnsupportedOperationException();}
	public OrgIncidentSummaryChangeEvent clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public OrgIncidentSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public OrgIncidentSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public OrgIncidentSummaryChangeEvent clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
