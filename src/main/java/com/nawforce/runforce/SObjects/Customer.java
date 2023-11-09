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
public class Customer extends SObject {
	public static SObjectType$<Customer> SObjectType;
	public static SObjectFields$<Customer> Fields;

	public Id CreatedById;
	public User CreatedBy;
	public Datetime CreatedDate;
	public String CustomerStatusType;
	public Id Id;
	public Boolean IsDeleted;
	public Id LastModifiedById;
	public User LastModifiedBy;
	public Datetime LastModifiedDate;
	public Datetime LastReferencedDate;
	public Datetime LastViewedDate;
	public String Name;
	public Id OwnerId;
	public Name Owner;
	public Id PartyId;
	public Individual Party;
	public Datetime SystemModstamp;
	public Integer TotalLifeTimeValue;

	public CommSubscriptionConsent[] CommSubsConsents;
	public ContactPointConsent[] ContactPointConsents;
	public ContactPointTypeConsent[] ContactPointTypeConsents;
	public FlowOrchestrationWorkItem[] FlowOrchestrationWorkItems;
	public PartyConsent[] PartyConsents;
	public ProcessInstance[] ProcessInstances;
	public ProcessInstanceHistory[] ProcessSteps;
	public CustomerShare[] Shares;

	public Customer clone$() {throw new java.lang.UnsupportedOperationException();}
	public Customer clone$(Boolean preserveId) {throw new java.lang.UnsupportedOperationException();}
	public Customer clone$(Boolean preserveId, Boolean isDeepClone) {throw new java.lang.UnsupportedOperationException();}
	public Customer clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps) {throw new java.lang.UnsupportedOperationException();}
	public Customer clone$(Boolean preserveId, Boolean isDeepClone, Boolean preserveReadonlyTimestamps, Boolean preserveAutonumber) {throw new java.lang.UnsupportedOperationException();}
}
