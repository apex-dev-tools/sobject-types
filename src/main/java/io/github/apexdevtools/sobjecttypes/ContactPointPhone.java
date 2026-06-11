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
public class ContactPointPhone extends SObject {
	public static SObjectType$<ContactPointPhone> SObjectType;
	public static SObjectFields$<ContactPointPhone> Fields;

	public Date ActiveFromDate;
	public Date ActiveToDate;
	public String AreaCode;
	public Time BestTimeToContactEndTime;
	public Time BestTimeToContactStartTime;
	public String BestTimeToContactTimezone;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String ExtensionNumber;
	public String FormattedInternationalPhoneNumber;
	public String FormattedNationalPhoneNumber;
	public Id Id;
	public Boolean IsBusinessPhone;
	public Boolean IsDeleted;
	public Boolean IsFaxCapable;
	public Boolean IsPersonalPhone;
	public Boolean IsPrimary;
	public Boolean IsSmsCapable;
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
	public String PhoneType;
	public Integer PreferenceRank;
	public Datetime SystemModstamp;
	public String TelephoneNumber;
	public String UsageType;

	public ApprovalSubmission[] ApprovalSubmissions;
	public ApprovalWorkItem[] ApprovalWorkItems;
	public CommSubscriptionConsent[] CommSubscriptionConsents;
	public ContactPointAddress[] ContactPointAddresses;
	public ContactPointConsent[] ContactPointConsents;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ContactPointPhoneHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ContactPointPhoneShare[] Shares;

	public ContactPointPhone clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhone clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhone clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhone clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointPhone clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
