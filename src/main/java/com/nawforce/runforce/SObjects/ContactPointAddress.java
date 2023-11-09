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
public class ContactPointAddress extends SObject {
	public static SObjectType$<ContactPointAddress> SObjectType;
	public static SObjectFields$<ContactPointAddress> Fields;

	public Date ActiveFromDate;
	public Date ActiveToDate;
	public Address Address;
	public String AddressType;
	public Time BestTimeToContactEndTime;
	public Time BestTimeToContactStartTime;
	public String BestTimeToContactTimezone;
	public String City;
	public Id ContactPointPhoneId;
	public ContactPointPhone ContactPointPhone;
	public String Country;
	public String CountryCode;
	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String GeocodeAccuracy;
	public Id Id;
	public Boolean IsDefault;
	public Boolean IsDeleted;
	public Boolean IsPrimary;
	public Boolean IsThirdPartyAddress;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public Decimal Latitude;
	public Decimal Longitude;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id ParentId;
	public Name Parent;
	public String PostalCode;
	public Integer PreferenceRank;
	public String State;
	public String StateCode;
	public String Street;
	public Datetime SystemModstamp;
	public String UsageType;

	public CommSubscriptionConsent[] CommSubscriptionConsents;
	public ContactPointConsent[] ContactPointConsents;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public ContactPointAddressHistory[] Histories;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public ContactPointAddressShare[] Shares;

	public ContactPointAddress clone$() {throw new java.lang.UnsupportedOperationException();}
	public ContactPointAddress clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointAddress clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public ContactPointAddress clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
