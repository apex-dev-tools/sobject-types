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
public class ContactPointEmail extends SObject {
	public static SObjectType$<ContactPointEmail> SObjectType;
	public static SObjectFields$<ContactPointEmail> Fields;

	public Date ActiveFromDate;
	public Date ActiveToDate;
	public Time BestTimeToContactEndTime;
	public Time BestTimeToContactStartTime;
	public String BestTimeToContactTimezone;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String EmailAddress;
	public String EmailDomain;
	public Datetime EmailLatestBounceDateTime;
	public String EmailLatestBounceReasonText;
	public String EmailMailBox;
	public Id Id;
	public Boolean IsDeleted;
	public Boolean IsPrimary;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ParentId;
	public Name Parent;
	public Integer PreferenceRank;
	public Datetime SystemModstamp;
	public String UsageType;

	public CommSubscriptionConsent[] CommSubscriptionConsents;
	public ContactPointConsent[] ContactPointConsents;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ContactPointEmailHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ContactPointEmailShare[] Shares;

	public ContactPointEmail clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointEmail clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointEmail clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointEmail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointEmail clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
