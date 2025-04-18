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
public class LookedUpFromActivity extends SObject {
	public static SObjectType$<LookedUpFromActivity> SObjectType;
	public static SObjectFields$<LookedUpFromActivity> Fields;

	public Id AccountId;
	public Account Account;
	public Date ActivityDate;
	public Datetime ActivityDateTime;
	public String ActivitySubtype;
	public String ActivityType;
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

	public LookedUpFromActivity clone$() {throw new java.lang.UnsupportedOperationException();}
	public LookedUpFromActivity clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public LookedUpFromActivity clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public LookedUpFromActivity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public LookedUpFromActivity clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
