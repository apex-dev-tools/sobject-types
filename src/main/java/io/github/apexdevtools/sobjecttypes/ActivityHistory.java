/*
 * Copyright (c) 2022 FinancialForce.com, inc. All rights reserved.
 */

package io.github.apexdevtools.sobjecttypes;

import io.github.apexdevtools.standardtypes.Internal.SObjectFields$;
import io.github.apexdevtools.standardtypes.Internal.SObjectType$;
import io.github.apexdevtools.standardtypes.System.Boolean;
import io.github.apexdevtools.standardtypes.System.Integer;
import io.github.apexdevtools.standardtypes.System.String;
import io.github.apexdevtools.standardtypes.System.*;

@SuppressWarnings("unused")
public class ActivityHistory extends SObject {
	public static SObjectType$<ActivityHistory> SObjectType;
	public static SObjectFields$<ActivityHistory> Fields;

	public Id AccountId;
	public Account Account;
	public Date ActivityDate;
	public Datetime ActivityDateTime;
	public String ActivitySubtype;
	public String ActivityType;
	public Id AlternateDetailId;
	public EmailMessage AlternateDetail;
	public String CallDisposition;
	public Integer CallDurationInSeconds;
	public String CallObject;
	public String CallType;
	public Datetime CompletedDateTime;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CurrencyIsoCode;
	public String Description;
	public String Division;
	public Integer DurationInMinutes;
	public Datetime EndDateTime;
	public Id Id;
	public Boolean IsAllDayEvent;
	public Boolean IsClosed;
	public Boolean IsDeleted;
	public Boolean IsHighPriority;
	public Boolean IsReminderSet;
	public Boolean IsTask;
	public Boolean IsVisibleInSelfService;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public String Location;
	public Id OwnerId;
	public Name Owner;
	public Id PrimaryAccountId;
	public Account PrimaryAccount;
	public Id PrimaryWhoId;
	public Name PrimaryWho;
	public String Priority;
	public Datetime ReminderDateTime;
	public Datetime StartDateTime;
	public String Status;
	public String Subject;
	public Datetime SystemModstamp;
	public Id WhatId;
	public Name What;
	public Id WhoId;
	public Name Who;

	public ActivityHistory clone$() {throw new java.lang.UnsupportedOperationException();}
	public ActivityHistory clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ActivityHistory clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ActivityHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ActivityHistory clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
